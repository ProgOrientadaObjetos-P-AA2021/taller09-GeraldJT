/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo extends Persona {
    private Persona beneficiario ;
    private double tiempoP;
    private String ciudad;
    
    public Prestamo(String nom, String ap,double temp, String ciu){
        super(nom, ap);
        tiempoP=temp;
        ciudad=ciu;
    }
    
    public void establecerBenefi ( Persona b){
        beneficiario = b;
    }
    public void establecerTiempo ( double t){
        tiempoP = t;
    }
    public void establecerCiudad ( String c){
        ciudad = c;
    }
    public Persona obtenerBenefi (){
        return beneficiario;
    }
    public double obtenerTiempo (){
        return tiempoP;
    }
    public String obtenerCiudad (){
        return ciudad;
    }
}
