/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

/**
 *
 * @author Valeria Romero
 */
public class v_Boolean extends Variables{
    private Boolean valor;
    private String nombre;

    public v_Boolean() {
    }
    

    public v_Boolean(Boolean valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public Boolean getValor() {
        return valor;
    }

    public void setValor(Boolean valor) {
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
        return nombre+" = "+valor;
    }
}
