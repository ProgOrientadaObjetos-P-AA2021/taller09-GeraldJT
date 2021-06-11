/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author USUARIO PC
 */
public class Persona {
    private String nombre;
    private String apellido;
    public Persona ( String n, String a){
        nombre = n;
        apellido = a;
    }
    public void establecerNombre ( String n){
        nombre = n;
    }
    public void establecerApellido (String a){
        apellido = a;
    }
    public String obtenerNombre () {
        return nombre;
    }
    public String obtenerApellido (){
        return apellido;
    }

    
}
