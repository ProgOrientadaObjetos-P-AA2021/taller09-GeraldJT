/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelE;
    private String nombreCE;
    private double valorC;
    private double valorPC;

    public PrestamoEducativo(String nom, String ap, String ciu, double temp, 
            String nvl, String nCentro, double valor){
        super(nom, ap, temp, ciu);
        nivelE= nvl;
        nombreCE=nCentro;
        valorC= valor;
    }
    public void establecerNivelE (String n){
        nivelE = n;
    }
    public void establecerNombre (String nom){
        nombreCE = nom;
    }
    public void establecerValorC (double vC){
        valorC = vC;
    }
    public void establecerValorPC (){
        valorPC = (valorC / super.obtenerTiempo());
        valorPC = valorPC - (valorPC * 10)/100;  
    }
    public String obtenerNivelE (){
        return nivelE;
    }
    public String obtenerNombreCentroE(){
        return nombreCE;
    }
    public double obtenerValorC (){
        return valorC;
    }
    public double obtenerValorPC (){
        return valorPC;
    }
    public String toString (){
        String cadena = String.format("Beneficiario: %s %s\nAcreedor del préstamo "
                + "educativo"
                + "\nCiudad: %s \nNombre del centro Educativo: %s\n"
                + "Nivel de estudio: %s\n Tiempo del prestamo: %.2f\n Valor de "
                + "la carrera: %.2f\n Valor de pago mensual total: %.2f",
                super.obtenerBenefi(), super.obtenerApellido(),
                super.obtenerCiudad().toLowerCase(), obtenerNombreCentroE(),
                obtenerNivelE(),
                super.obtenerTiempo(), obtenerValorC(),
                obtenerValorPC ());
        return cadena;
    }
}
