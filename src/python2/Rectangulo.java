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
public class Rectangulo extends Figura implements Serializable{

    private v_Int int1;
    private v_Int int2;
    private v_Int intresult;

    private v_Float f1;
    private v_Float f3;
    private v_Float fresult;

    public Rectangulo() {
    }

    public Rectangulo(Color color, String code, int x, int y) {
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

    public v_Int getInt1() {
        return int1;
    }

    public void setInt1(v_Int int1) {
        this.int1 = int1;
    }

    public v_Int getInt2() {
        return int2;
    }

    public void setInt2(v_Int int2) {
        this.int2 = int2;
    }

    public v_Int getIntresult() {
        return intresult;
    }

    public void setIntresult(v_Int intresult) {
        this.intresult = intresult;
    }

    public v_Float getF1() {
        return f1;
    }

    public void setF1(v_Float f1) {
        this.f1 = f1;
    }

    public v_Float getF3() {
        return f3;
    }

    public void setF3(v_Float f3) {
        this.f3 = f3;
    }

    public v_Float getFresult() {
        return fresult;
    }

    public void setFresult(v_Float fresult) {
        this.fresult = fresult;
    }

    public void crearRectangulo(int Num, JLabel x) {
        x.setOpaque(true);
        x.setName("jl_rectangulo" + Num);
        x.setHorizontalTextPosition(SwingConstants.CENTER);
        x.setBackground(JColorChooser.showDialog(this, "Seleccione el color de la figura", color));
        x.setLocation(10, 200);
        x.setIcon(new ImageIcon(".\\build\\classes\\proceso.png"));
        x.setText(code);
        x.setMaximumSize(new java.awt.Dimension(100, 100));
        x.setMinimumSize(new Dimension(100, 100));
        x.setLocation(new Point(20, 20));
        x.setPreferredSize(new Dimension(50, 50));
        x.setSize(100, 61);

    }

    public int sumaInt(v_Int x, v_Int y) {
        int1 = x;
        int2 = y;

        int result = int1.getValor() + int2.getValor();
        return result;
    }

    public int restaInt(v_Int x, v_Int y) {
        int1 = x;
        int2 = y;

        int result = int1.getValor() - int2.getValor();
        return result;
    }

    public int multiInt(v_Int x, v_Int y) {
        int1 = x;
        int2 = y;

        int result = int1.getValor() * int2.getValor();
        return result;
    }

    public int divInt(v_Int x, v_Int y) {
        int1 = x;
        int2 = y;

        int result = int1.getValor() / int2.getValor();
        return result;
    }

    public float sumaFloat(v_Float x, v_Float y){
        f1=x;
        f3=y;
        
        float result = f1.getValor()+f3.getValor();
        return result;
    }
    public float restaFloat(v_Float x, v_Float y){
        f1=x;
        f3=y;
        
        float result = f1.getValor()-f3.getValor();
        return result;
    }
    public float multiFloat(v_Float x, v_Float y){
        f1=x;
        f3=y;
        
        float result = f1.getValor()*f3.getValor();
        return result;
    }
    public float divFloat(v_Float x, v_Float y){
        f1=x;
        f3=y;
        
        float result = f1.getValor()/f3.getValor();
        return result;
    }
    
    @Override
    public String code() {
        String codigo="";
        codigo+=code;
        codigo+="\n";
        return codigo;
    }
}
