/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *Clase la persona apostadora
 * @author alexis
 */
public class Apostador {
    private String nombre;
    public Apostador(){}
    
    // constructor de la clase
    public Apostador(String nombre) {
        this.nombre = nombre;
    }
    
    
    /*
    Getters y setters de la clase
    */
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    
}
