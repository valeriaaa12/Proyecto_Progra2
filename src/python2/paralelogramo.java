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
public class paralelogramo extends Figura implements Serializable{

    private ArrayList<Variables> variables = new ArrayList();

    public paralelogramo() {
    }

    public paralelogramo(Color color, String code, int x, int y) {
        super(color, code, x, y);
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

    public ArrayList<Variables> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variables> variables) {
        this.variables = variables;
    }

    @Override
    public String code() {
        String codigo = "";
        for (Variables variable : variables) {
            codigo += variable.toString();
            codigo += "\n";
        }
        codigo += "\n";
        return codigo;
    }

    public void crearParalelogramo(int Num, JLabel x) {
        x.setOpaque(true);
        x.setName("jl_rectangulo" + Num);
        x.setHorizontalTextPosition(SwingConstants.CENTER);
        x.setBackground(JColorChooser.showDialog(this, "Seleccione el color de la figura", color));
        x.setLocation(10, 200);
        x.setIcon(new ImageIcon(".\\build\\classes\\paralelogramo.png"));
        x.setText(code);
        x.setMaximumSize(new java.awt.Dimension(100, 100));
        x.setMinimumSize(new Dimension(100, 100));
        x.setLocation(new Point(20, 20));
        x.setPreferredSize(new Dimension(50, 50));
        x.setSize(100, 61);

    }
}
