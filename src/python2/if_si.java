/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Valeria Romero
 */
public class if_si extends Rombo {

    private JLabel proceso;

    public if_si() {
    }

    public if_si(int index, Color color, String code, int x, int y) {
        super(index, color, code, x, y);
    }

    

    public JLabel getProceso() {
        return proceso;
    }

    public void setProceso(JLabel proceso) {
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
        if (proceso != null) {
            if (proceso instanceof Rectangulo) {
                codigo += ((Rectangulo) proceso).code();
            }
            if (proceso instanceof Rectangulo2) {
                codigo += ((Rectangulo2) proceso).code();
            }
            if (proceso instanceof Rombo) {
                codigo += ((Rombo) proceso).code();
            }
            if (proceso instanceof documento) {
                codigo += ((Rombo) proceso).code();

            }
            codigo+="\n";
        }
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
