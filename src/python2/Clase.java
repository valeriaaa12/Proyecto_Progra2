/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Valeria Romero
 */
public class Clase implements Serializable {
    private  ArrayList atributos = new ArrayList();
    private String nombre;
    private ArrayList <Metodo> metodos = new ArrayList();
    private String tipo;

    public Clase(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Clase(String nombre) {
        this.nombre = nombre;
    }
    

    public ArrayList getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList atributos) {
        this.atributos = atributos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodo> metodos) {
        this.metodos = metodos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
