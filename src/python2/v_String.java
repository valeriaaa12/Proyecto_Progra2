/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

/**
 *
 * @author Valeria Romero
 */
public class v_String extends Variables {

    private String valor;
    private String nombre;

    public v_String() {
    }

    public v_String(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
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
        if (valor.equalsIgnoreCase("\"\"")) {
            return nombre;
        } else {
            return nombre + " = " +valor;
        }

    }
}
