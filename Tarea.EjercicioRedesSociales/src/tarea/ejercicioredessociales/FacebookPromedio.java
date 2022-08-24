/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicioredessociales;

/**
 *
 * @author Irving
 */
public class FacebookPromedio {
    private int datos=660;
    private int datos1=4850;
    private int datos2=3638;
    private int datos3=4585;
    private int datos4=5308;
    private int datos5=7925;

    public FacebookPromedio() {
    }

    public int getDatos() {
        return datos;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public int getDatos1() {
        return datos1;
    }

    public void setDatos1(int datos1) {
        this.datos1 = datos1;
    }

    public int getDatos2() {
        return datos2;
    }

    public void setDatos2(int datos2) {
        this.datos2 = datos2;
    }

    public int getDatos3() {
        return datos3;
    }

    public void setDatos3(int datos3) {
        this.datos3 = datos3;
    }

    public int getDatos4() {
        return datos4;
    }

    public void setDatos4(int datos4) {
        this.datos4 = datos4;
    }

    public int getDatos5() {
        return datos5;
    }

    public void setDatos5(int datos5) {
        this.datos5 = datos5;
    }

    @Override
    public String toString() {
        return "FacebookPromedio{" + "datos=" + datos + ", datos1=" + datos1 + ", datos2=" + datos2 + ", datos3=" + datos3 + ", datos4=" + datos4 + ", datos5=" + datos5 + '}';
    }
     public void promedioFacebook(){
         System.out.println("El promedio de crecimiento de Facebook es de: ");
         System.out.println((datos+datos1+datos2+datos3+datos4+datos5)/6);   

     }
}