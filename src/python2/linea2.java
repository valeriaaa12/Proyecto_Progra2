/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Valeria Romero
 */
public class linea2 extends Figura implements Serializable{

    public linea2() {
    }

    public linea2(Color color, int x, int y) {
        super(color, x, y);
    }

   

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

  

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String code() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public void crearLinea1(int Num, JLabel x) {
        x.setOpaque(true);
        x.setName("jl_linea2" + Num);
        x.setHorizontalTextPosition(SwingConstants.CENTER);
        x.setBackground(JColorChooser.showDialog(this, "Seleccione el color de la figura", color));
        x.setLocation(10, 200);
        x.setIcon(new ImageIcon(".\\build\\classes\\linea2.png"));
  
        x.setMaximumSize(new java.awt.Dimension(100, 100));
        x.setMinimumSize(new Dimension(100, 100));
        x.setLocation(new Point(20, 20));
        x.setPreferredSize(new Dimension(50, 50));
        x.setSize(6, 100);

    }
    
}
