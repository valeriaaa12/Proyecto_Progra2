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
public class if_fin extends Rombo implements Serializable {
   
    public if_fin() {
    }

    public if_fin(int index, Color color, String code, int x, int y) {
        super(index, color, code, x, y);
    }

    public String code() {
        System.out.println("if fin");
        String codigo = "";
        System.out.println(codigo);
        return codigo;
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
