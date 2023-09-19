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
public class Rectangulo2 extends Figura implements Serializable{

    private ArrayList<JLabel> procesos = new ArrayList();
    private int index;
    public Rectangulo2() {
    }

    public Rectangulo2(int index, Color color, String code, int x, int y) {
        super(color, code, x, y);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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

    public ArrayList<JLabel> getProcesos() {
        return procesos;
    }

    public void setProcesos(ArrayList<JLabel> procesos) {
        this.procesos = procesos;
    }

    public void agregarProceso(JLabel x) {
        procesos.add(x);
    }

  
    public String code() {
        String codigo = "";
        codigo += code;
        codigo += " :";
        if (procesos != null) {
            codigo += codigo(this.procesos);
        }

        return codigo;
    }

    public String code2() {
        String codigo = "";
        codigo += "for";
        codigo += " ";
        codigo += code;
        codigo += "";
        if (procesos != null) {
            codigo += codigo(this.procesos);
        }

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

    public void crearRectangulo(int Num, JLabel x) {
        x.setOpaque(true);
        x.setName("jl_rectangulo" + Num);
        x.setHorizontalTextPosition(SwingConstants.CENTER);
        x.setBackground(JColorChooser.showDialog(this, "Seleccione el color de la figura", color));
        x.setLocation(10, 200);
        x.setIcon(new ImageIcon(".\\build\\classes\\proceso predefinido.png"));
        x.setText(code);
        x.setMaximumSize(new java.awt.Dimension(100, 100));
        x.setMinimumSize(new Dimension(100, 100));
        x.setLocation(new Point(20, 20));
        x.setPreferredSize(new Dimension(50, 50));
        x.setSize(100, 61);

    }
}
