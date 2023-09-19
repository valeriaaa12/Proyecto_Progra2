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
public class Rombo extends Figura implements Serializable {

    private ArrayList<JLabel> si = new ArrayList();
    private if_no no;
    private int index;
    public Rombo() {
    }

    public Rombo(int index, Color color, String code, int x, int y) {
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

    public ArrayList<JLabel> getSi() {
        return si;
    }

    public void setSi(ArrayList<JLabel> si) {
        this.si = si;
    }

    public if_no getNo() {
        return no;
    }

    public void setNo(if_no no) {
        this.no = no;
    }

    public void agregarSi(JLabel x) {
        si.add(x);
    }

    public String code() {
        String codigo = "";
        codigo += "if";
        codigo += " ";
        codigo += code;
        codigo += " :";
        if (si != null) {
            codigo += codigo(this.si);
        }
        if (no != null) {
            codigo += no.code();
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
