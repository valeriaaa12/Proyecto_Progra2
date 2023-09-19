/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

/**
 *
 * @author Valeria Romero
 */
public class v_Float extends Variables{
    private Float valor;
    private String nombre;

    public v_Float() {
    }

    public v_Float(Float valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
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
