/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.ejercicioredessociales;


public class TareaEjercicioRedesSociales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiferenciaFollowers ob1=new DiferenciaFollowers();
        TwitterPromedio ob2=new TwitterPromedio();
        FacebookPromedio ob3=new FacebookPromedio();
        ob1.leeDatos(); //62404 enero //67496 junio
        ob1.diferencia();
        ob2.promedioTwitter();
        ob3.promedioFacebook();
    }
    
}
