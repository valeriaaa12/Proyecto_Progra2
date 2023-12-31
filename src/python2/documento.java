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
public class documento extends Figura implements Serializable {

    public documento() {
    }

    public documento(Color color, String code, int x, int y) {
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

    public String code() {
        String codigo="";
        codigo+="print(\"";
        codigo+=code;
        codigo+="\")";
        return codigo;
    }

    public void crearDocumento(int Num, JLabel x) {
        x.setOpaque(true);
        x.setName("jl_documento" + Num);
        x.setHorizontalTextPosition(SwingConstants.CENTER);
        x.setBackground(JColorChooser.showDialog(this, "Seleccione el color de la figura", color));
        x.setLocation(10, 200);
        x.setIcon(new ImageIcon(".\\build\\classes\\documentos.png"));
        x.setText(code);
        x.setMaximumSize(new java.awt.Dimension(100, 100));
        x.setMinimumSize(new Dimension(100, 100));
        x.setLocation(new Point(20, 20));
        x.setPreferredSize(new Dimension(50, 50));
        x.setSize(100, 61);

    }
    public void Copiar(JLabel D, JLabel doc) {
        D.setBackground(doc.getBackground());
        D.setText(doc.getText());
        D.setLocation(10, 200);
        D.setFont(doc.getFont());
        D.setOpaque(true);
        D.setIcon(doc.getIcon());
        D.setHorizontalTextPosition(SwingConstants.CENTER);
        D.setName(doc.getText() + "-copia");
        D.setSize(doc.getWidth(), doc.getHeight());
        System.out.println("Sirve?");
    }

}
