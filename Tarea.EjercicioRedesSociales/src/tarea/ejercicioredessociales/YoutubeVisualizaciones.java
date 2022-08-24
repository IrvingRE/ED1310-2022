/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicioredessociales;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Irving
 */
public class YoutubeVisualizaciones  {
    public static void main(String[] args) { 
        ArrayList<String> meses = new ArrayList<>();
        ArrayList<String> meses1 = new ArrayList<>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add ("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses1.add("Enero");
        meses1.add("Febrero");
        meses1.add("Marzo");
        meses1.add("Abril");
        meses1.add("Mayo");
        meses1.add("Junio");
        

        
        
        for (String mes : meses) {
        System.out.println(mes);
        }
        System.out.println("--------------");
        Scanner teclado = new Scanner(System.in);

        int seleccion;
        String elMes = "";
        try{
            seleccion = teclado.nextInt();
            elMes = meses.get(seleccion);
        } catch (InputMismatchException ie) {
            System.out.println("Debe teclear valores númericos");
            elMes = meses.get(0);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("Error, debe ser un número entre 0 y 5");

        } finally {
            System.out.println(elMes);
            
        }
        
        System.out.println("");
        System.out.println("Escoja el segundo");
        System.out.println("");
        for (String mes1 : meses1) {
        System.out.println(mes1);
        }
        System.out.println("--------------");
        Scanner teclado1 = new Scanner(System.in);

        int seleccion1;
        String elMes1 = "";
        try{
            seleccion1 = teclado1.nextInt();
            elMes1 = meses1.get(seleccion1);
        } catch (InputMismatchException ie) {
            System.out.println("Debe teclear valores númericos");
            elMes1 = meses1.get(0);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("Error, debe ser un número entre 0 y 5");

        } finally {
            System.out.println(elMes1);

                
        }
    
        
    }
     
} 
    

