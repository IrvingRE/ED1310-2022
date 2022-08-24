/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicioredessociales;


/**
 *
 * @author Irving
 */
public class Visualizaciones {
        
        private String mes;
        private int datos;

    public Visualizaciones() {
    }

    public Visualizaciones(String mes, int datos) {
        this.mes = mes;
        this.datos = datos;
    }

    public int getDatos() {
        return datos;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Visualizaciones{" + "mes=" + mes + ", datos=" + datos + '}';
    }
    

        
       

       
    }
    

