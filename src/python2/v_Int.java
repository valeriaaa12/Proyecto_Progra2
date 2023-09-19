/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

/**
 *
 * @author Valeria Romero
 */
public class v_Int extends Variables {

    private int valor;
    private String nombre;

    public v_Int() {
    }

    public v_Int(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " = " + valor;

    }

}
