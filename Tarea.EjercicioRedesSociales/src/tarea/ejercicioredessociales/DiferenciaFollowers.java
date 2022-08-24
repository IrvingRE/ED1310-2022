/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicioredessociales;
import java.util.Scanner;

public class DiferenciaFollowers {
    private String redSocial;
    private String concepto;
    private int año;
    private int enero;
    private int junio;

    public DiferenciaFollowers() {
    }

    public DiferenciaFollowers(String redSocial, String concepto, int año, int enero, int junio) {
        this.redSocial = redSocial;
        this.concepto = concepto;
        this.año = año;
        this.enero = enero;
        this.junio = junio;
    
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getEnero() {
        return enero;
    }

    public void setEnero(int enero) {
        this.enero = enero;
    }

    public int getJunio() {
        return junio;
    }

    public void setJunio(int junio) {
        this.junio = junio;
    }

    @Override
    public String toString() {
        return "DiferenciaFollowers{" + "redSocial=" + redSocial + ", concepto=" + concepto + ", a\u00f1o=" + año + ", enero=" + enero + ", junio=" + junio + '}';
    }  
    
    public void leeDatos(){
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese los datos de enero: "); //62404 enero
        enero=datos.nextInt();
        System.out.println("Ingrese los datos de junio: ");//67496 junio
        junio=datos.nextInt();
        
    }
    public void diferencia(){
        System.out.println("La diferencia de seguidores en Twitter Enero y Junio es: ");
        System.out.println(junio-enero + " " + "seguidores");
       
    }

    void promedio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


