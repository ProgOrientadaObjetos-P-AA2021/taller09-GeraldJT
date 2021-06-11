/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil  extends Prestamo{
    private String tipoAuto;
    private String marcaAuto;
    private Persona garante1;
    private double valorAuto;
    private double valorMen;
    
     public PrestamoAutomovil(String nom, String ap, String ciu,double temp, 
            String tipo, String marca, double valor){
        super(nom, ap, temp, ciu);
        tipoAuto= tipo;
        marcaAuto=marca;
        valorAuto= valor;
    }
    public void establecerTipo ( String t){
        tipoAuto = t;
    }
    public void establecerMarca (String m){
        marcaAuto = m;
    }
    public void establecerGarante (Persona g){
        garante1 = g;
    }
    public void establecerValorA (double v){
        valorAuto = v;
    }
    public void establecerValorM (){
        valorMen = valorAuto / super.obtenerTiempo();
    }
    public String obtenerTipo (){
        return tipoAuto;
    }
    public String obtenerMarca (){ 
        return marcaAuto;
    }
        public Persona obtenerGarante (){
        return garante1;
    }
    public double obtenerValorA (){
        return valorAuto;
    }
    public double obtenerValorM (){
        return valorMen;
    }
    public String toString (){
        String cadena = String.format("Beneficiario: %s %s\nAcreedor del préstamo"
                + "para la compra de un automovil\nCiudas: %s \ntipo de automovil:"
                + " %s\n"
                + "Marca: %s\n Tiempo del prestamo: %.2f\nTotal a "
                + "pagar mensual: %.2f",
                super.obtenerNombre(), super.obtenerApellido(),
                super.obtenerCiudad().toLowerCase(), obtenerTipo(),obtenerMarca(),
                super.obtenerTiempo(), obtenerValorM(),
                obtenerValorA());
        return cadena;
        
    }
}

