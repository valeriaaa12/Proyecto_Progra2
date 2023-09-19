/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

import java.util.ArrayList;

/**
 *
 * @author Valeria Romero
 */
public class Metodo {
    private String atributos;
    private String nombre;

    public Metodo(String atributos, String nombre) {
        this.atributos = atributos;
        this.nombre = nombre;
    }

    public String getAtributos() {
        return atributos;
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
