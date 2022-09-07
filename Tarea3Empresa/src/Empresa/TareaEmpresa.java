package Empresa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import adts.Arreglo;
import adts.Empleado;

public class TareaEmpresa extends Empleado {

    public static void main(String[] args) {
        String linea;
        String datos[];
        int i = 1;
        Arreglo<Empleado> lista = new Arreglo(15);

        try {

            BufferedReader buffer = new BufferedReader(new FileReader("junio.dat"));
           
            linea = buffer.readLine();
          
            while (linea != null) {
                System.out.println(linea);
                datos = linea.split(",");
                Empleado empleado = new Empleado(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3], Integer.parseInt(datos[4]), Integer.parseInt(datos[5]), Integer.parseInt(datos[6]));
                lista.setElemento(i, empleado);
                i++;
                linea = buffer.readLine();
            }
            int mayor = 0;
            int menor = 0;

            for (int j = 1; j < 15; j++) {
                int k = 2;

                System.out.println(lista.getElemento(j) + " Sueldo total= " + lista.getElemento(j).calcularSueldo1());
                if (lista.getElemento(j).getAnioIngreso() < lista.getElemento(k).getAnioIngreso()) {

                    mayor = lista.getElemento(k).getAnioIngreso();
                    menor = lista.getElemento(j).getAnioIngreso();

                } else {
                    mayor = lista.getElemento(j).getAnioIngreso();
                    menor = lista.getElemento(k).getAnioIngreso();

                }
                k++;

            }
            int m;
            int n = 1;
            for (m = 1; m < 15; m++) {
                if (lista.getElemento(m).getAnioIngreso() == mayor) {
                    System.out.println("El empleado con mayor antiguedad es :" + lista.getElemento(m)
                            + " empezo a laborar en el año: " + mayor);
                }
                if (lista.getElemento(n).getAnioIngreso() == menor) {
                    System.out.println("El empleado con menor antiguedad es :" + lista.getElemento(n)
                            + " empezo a laborar en el año: " + menor);
                }
                n++;
            }

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

}
