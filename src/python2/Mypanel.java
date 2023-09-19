/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

/**
 *
 * @author Valeria Romero
 */
public class Mypanel extends JPanel{
    private  Graphics z;
    private int width;
    private int heigth;
    Point esquina;
    Point previous;

    public Mypanel() {
        
        esquina= new Point(0,0);
        ClickListener clicklistener = new ClickListener();
        
        this.addMouseListener(clicklistener);
        
        DragListener dl = new DragListener();
        this.addMouseMotionListener(dl);
    }
    

    public Graphics getZ() {
        return z;
    }

    public void setZ(Graphics z) {
        this.z = z;
    }
    
  
   public void paintComponent(Graphics g){
      super.paintComponent(g);
        g.drawRect((int) esquina.getX(), (int) esquina.getY(), 75, 50);
       
   }
   private class ClickListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent evt) {
            previous = evt.getPoint();
        }
   }
   private class DragListener extends MouseMotionAdapter{
       @Override
        public void mouseDragged(MouseEvent evt) {
            Point currentPoint = evt.getPoint();
            esquina.translate((int) (currentPoint.getX() - previous.getX()), (int) (currentPoint.getY() - previous.getY()));
            previous = currentPoint;
            repaint();
        }
   }
   
}
