/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Valeria Romero
 */
public class if_no extends Rombo implements Serializable{

    private ArrayList<JLabel> proceso;

    public if_no() {
    }

    public if_no(int index, Color color, String code, int x, int y) {
        super(index, color, code, x, y);
    }

    public ArrayList<JLabel> getProceso() {
        return proceso;
    }

    public void setProceso(ArrayList<JLabel> proceso) {
        this.proceso = proceso;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    
  

    public String code() {

        String codigo = "";
        codigo += "\n";
        codigo += "else";
        codigo += " :";
        if (proceso != null) {
            codigo += "\n\t";
            codigo += codigo(this.proceso);
            codigo += "\n";
        }
        codigo += "\n";
        return codigo;
    }

    public String codigo(ArrayList<JLabel> y) {
        String z = "";
        for (JLabel x : y) {
            if (x instanceof Rectangulo) {
                Rectangulo P = ((Rectangulo) x);
                z = P.code();
            }
            if (x instanceof Rectangulo2) {
                Rectangulo2 P = ((Rectangulo2) x);
                z = P.code();
            }
            if (x instanceof Rombo) {
                Rombo P = ((Rombo) x);
                z = P.code();
            }
            if (x instanceof documento) {
                documento P = ((documento) x);
                z = P.code();
            }
            z = "\n";
        }

        return z;
    }

    public void crearRombo(int Num, JLabel x) {
        x.setOpaque(true);
        x.getName();
        x.setName("Rombo" + Num);
        x.setText(code);
        x.setHorizontalTextPosition(SwingConstants.CENTER);
        x.setBackground(JColorChooser.showDialog(this, "Seleccione el color de la figura", color));
        x.setLocation(10, 200);
        x.setIcon(new ImageIcon(".\\build\\classes\\if.png"));
        x.setText(code);
        x.setMaximumSize(new java.awt.Dimension(100, 100));
        x.setMinimumSize(new Dimension(100, 100));
        x.setLocation(new Point(20, 20));
        x.setPreferredSize(new Dimension(50, 50));
        x.setSize(100, 61);
    }
}
