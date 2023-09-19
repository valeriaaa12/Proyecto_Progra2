/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package python2;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragSource;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.SwingConstants;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Valeria Romero
 */
public class Mainp extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    //se pueden sustituir las flechas si las figuras son del mismo color
    public Mainp() {
        initComponents();
        frame_dflujo.setLayout(new FlowLayout());
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_fonts.getModel();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontNames[] = ge.getAvailableFontFamilyNames();

        for (int i = 0; i < fontNames.length; i++) {
            Fuentes.add(new java.awt.Font(fontNames[i], 1, 11));
            modelo.addElement(Fuentes.get(i).getFontName());
        }

        cb_fonts.setModel(modelo);
        cb_Font2.setModel(modelo);
    }

    // <editor-fold defaultstate="collapsed" desc="Paneles No Usados">  
    private class GPanel2 extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int lado = 50; // Longitud de un lado del cuadrado
            int x = (getWidth() - lado) / 2; // Coordenada x de la esquina superior izquierda del cuadrado
            int y = (getHeight() - lado) / 2; // Coordenada y de la esquina superior izquierda del cuadrado

            // Dibujar un cuadrado en el panel
            g.setColor(Color.RED); // Establecer el color del cuadrado
            g.fillRect(x, y, lado, lado); // Dibujar el cuadrado

        }
    }

    private class GPanel3 extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int lado = 50; // Longitud de un lado del rombo
            int x = (getWidth() - lado) / 2; // Coordenada x del centro del rombo
            int y = (getHeight() - lado) / 2; // Coordenada y del centro del rombo

            int[] xPoints = {x + lado / 2, x + lado, x + lado / 2, x}; // Coordenadas x de los vértices
            int[] yPoints = {y, y + lado / 2, y + lado, y + lado / 2}; // Coordenadas y de los vértices

            // Dibujar un rombo en el panel
            g.setColor(Color.orange); // Establecer el color del rombo
            g.fillPolygon(xPoints, yPoints, 4); // Dibujar el rombo
        }
    }

    private class GPanel4 extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int lado = 50; // Longitud de uno de los lados del paralelogramo romboide
            int altura = 30; // Altura del paralelogramo romboide

            int offsetX = 9; // Ajuste horizontal

            int x1 = (getWidth() - lado) / 2 + offsetX; // Coordenada x del punto superior izquierdo
            int x2 = x1 + lado;               // Coordenada x del punto superior derecho
            int x3 = x1 - altura / 2;         // Coordenada x del punto inferior izquierdo
            int x4 = x3 + lado;               // Coordenada x del punto inferior derecho

            int y1 = (getHeight() - altura) / 2; // Coordenada y del punto superior izquierdo
            int y2 = y1;                         // Coordenada y del punto superior derecho
            int y3 = y1 + altura;                // Coordenada y del punto inferior izquierdo
            int y4 = y3;                         // Coordenada y del punto inferior derecho

            int[] xPoints = {x1, x2, x4, x3}; // Coordenadas x de los vértices
            int[] yPoints = {y1, y2, y4, y3}; // Coordenadas y de los vértices

            // Dibujar el paralelogramo romboide en el panel
            g.setColor(Color.CYAN); // Establecer el color del paralelogramo romboide
            g.fillPolygon(xPoints, yPoints, 4); // Dibujar el paralelogramo romboide
        }
    }// </editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_dflujo = new javax.swing.JFrame();
        ab_panel1 = new javax.swing.JPanel();
        barratareas1 = new java.awt.Panel();
        jLabel5 = new javax.swing.JLabel();
        cb_fonts = new javax.swing.JComboBox<>();
        cb_fontsize = new javax.swing.JComboBox<>();
        paleta1 = new javax.swing.JPanel();
        jl_linea1 = new javax.swing.JLabel();
        jl_linea2 = new javax.swing.JLabel();
        jl_comienzo = new javax.swing.JLabel();
        jl_proceso = new javax.swing.JLabel();
        jl_proceso2 = new javax.swing.JLabel();
        jl_documento = new javax.swing.JLabel();
        jl_if = new javax.swing.JLabel();
        jl_paralelogramo = new javax.swing.JLabel();
        canvas1 = new javax.swing.JPanel();
        bt_generarcodigo1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto1 = new javax.swing.JTextArea();
        limpiar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_Int = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_Strings = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_Float = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_boolean = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        frame_uml = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text2 = new javax.swing.JTextArea();
        canvas_UML = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        bt_clasesimple = new javax.swing.JToggleButton();
        bt_claseAbstracta = new javax.swing.JButton();
        bt_claseHerencia = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        barratareas2 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        cb_Font2 = new javax.swing.JComboBox<>();
        cb_fotnsize2 = new javax.swing.JComboBox<>();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        pm_Figuras = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        cambiarColor = new javax.swing.JMenuItem();
        cambiarColorFont = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        copiar1 = new javax.swing.JMenuItem();
        frame_variables = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        valor_variable = new javax.swing.JTextField();
        nombre_variable = new javax.swing.JTextField();
        cb_tiposvariables = new javax.swing.JComboBox<>();
        frame_proceso = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        cb_procesos = new javax.swing.JComboBox<>();
        cb_variable1 = new javax.swing.JComboBox<>();
        cb_variable2 = new javax.swing.JComboBox<>();
        cb_variable3 = new javax.swing.JComboBox<>();
        frame_decisiones = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        rb_if = new javax.swing.JRadioButton();
        rb_if2 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cb_tipovariable_decisiones = new javax.swing.JComboBox<>();
        cb_variable1_decisiones = new javax.swing.JComboBox<>();
        cb_variable2_decisiones = new javax.swing.JComboBox<>();
        cb_evaluacion = new javax.swing.JComboBox<>();
        bt_decision = new javax.swing.JButton();
        rb_if3 = new javax.swing.JRadioButton();
        bg_ifs = new javax.swing.ButtonGroup();
        pm_UML = new javax.swing.JPopupMenu();
        pm_eliminarArbol = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        pm_colorArbol = new javax.swing.JMenuItem();
        pm_colortexto = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        copiar2 = new javax.swing.JMenuItem();
        frame_Metodos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        metodo_name = new javax.swing.JTextField();
        metodos_atributos = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        frame_Atributos = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        atributo = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        frame_bucles = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        bucle_for = new javax.swing.JRadioButton();
        bucle_while = new javax.swing.JRadioButton();
        ta_variable3_bucle = new javax.swing.JTextField();
        ta_operador_bucle = new javax.swing.JTextField();
        fin_bucle = new javax.swing.JRadioButton();
        tf_v1 = new javax.swing.JTextField();
        tf_v2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pp_pegarclase = new javax.swing.JPopupMenu();
        pegar1 = new javax.swing.JMenuItem();
        pp_pegarflujo = new javax.swing.JPopupMenu();
        pegar2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        ab_panel1.setBackground(new java.awt.Color(153, 204, 255));
        ab_panel1.setMinimumSize(new java.awt.Dimension(1280, 790));
        ab_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barratareas1.setBackground(new java.awt.Color(221, 240, 253));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Power_Clean_Ico.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        cb_fonts.setBackground(new java.awt.Color(77, 138, 221));
        cb_fonts.setForeground(new java.awt.Color(255, 255, 255));
        cb_fonts.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_fontsItemStateChanged(evt);
            }
        });

        cb_fontsize.setBackground(new java.awt.Color(255, 255, 255));
        cb_fontsize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "6", "8", "10", "12", "14", "16", "18" }));
        cb_fontsize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_fontsizeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout barratareas1Layout = new javax.swing.GroupLayout(barratareas1);
        barratareas1.setLayout(barratareas1Layout);
        barratareas1Layout.setHorizontalGroup(
            barratareas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barratareas1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_fonts, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(cb_fontsize, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        barratareas1Layout.setVerticalGroup(
            barratareas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barratareas1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(barratareas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barratareas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_fonts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_fontsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        ab_panel1.add(barratareas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 40));

        paleta1.setBackground(new java.awt.Color(255, 255, 255));
        paleta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paleta1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paleta1MouseEntered(evt);
            }
        });

        jl_linea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linea1.png"))); // NOI18N
        jl_linea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_linea1MouseClicked(evt);
            }
        });

        jl_linea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linea2.png"))); // NOI18N
        jl_linea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_linea2MouseClicked(evt);
            }
        });

        jl_comienzo.setBackground(new java.awt.Color(204, 204, 255));
        jl_comienzo.setForeground(new java.awt.Color(255, 0, 51));
        jl_comienzo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comienzo.png"))); // NOI18N
        jl_comienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_comienzoMouseClicked(evt);
            }
        });

        jl_proceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proceso.png"))); // NOI18N
        jl_proceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_procesoMouseClicked(evt);
            }
        });

        jl_proceso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proceso predefinido.png"))); // NOI18N
        jl_proceso2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_proceso2MouseClicked(evt);
            }
        });

        jl_documento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/documentos.png"))); // NOI18N
        jl_documento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_documentoMouseClicked(evt);
            }
        });

        jl_if.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if.png"))); // NOI18N
        jl_if.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_ifMouseClicked(evt);
            }
        });

        jl_paralelogramo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paralelogramo.png"))); // NOI18N
        jl_paralelogramo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_paralelogramoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paleta1Layout = new javax.swing.GroupLayout(paleta1);
        paleta1.setLayout(paleta1Layout);
        paleta1Layout.setHorizontalGroup(
            paleta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paleta1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(paleta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paleta1Layout.createSequentialGroup()
                        .addGroup(paleta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_paralelogramo)
                            .addGroup(paleta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jl_proceso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl_proceso2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl_linea1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl_comienzo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jl_linea2)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(paleta1Layout.createSequentialGroup()
                        .addGroup(paleta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_if, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        paleta1Layout.setVerticalGroup(
            paleta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paleta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_comienzo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_proceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_proceso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_documento)
                .addGap(18, 18, 18)
                .addGroup(paleta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paleta1Layout.createSequentialGroup()
                        .addComponent(jl_if)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_paralelogramo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_linea1)
                        .addGap(105, 105, 105))
                    .addGroup(paleta1Layout.createSequentialGroup()
                        .addComponent(jl_linea2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        ab_panel1.add(paleta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 490));

        canvas1.setBackground(new java.awt.Color(255, 255, 255));
        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvas1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout canvas1Layout = new javax.swing.GroupLayout(canvas1);
        canvas1.setLayout(canvas1Layout);
        canvas1Layout.setHorizontalGroup(
            canvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        canvas1Layout.setVerticalGroup(
            canvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        ab_panel1.add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 540, 600));

        bt_generarcodigo1.setBackground(new java.awt.Color(70, 117, 188));
        bt_generarcodigo1.setForeground(new java.awt.Color(255, 255, 255));
        bt_generarcodigo1.setText("Generar Codigo");
        bt_generarcodigo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_generarcodigo1MouseClicked(evt);
            }
        });
        ab_panel1.add(bt_generarcodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 140, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        texto1.setBackground(new java.awt.Color(255, 255, 255));
        texto1.setColumns(20);
        texto1.setRows(5);
        texto1.setBorder(null);
        jScrollPane1.setViewportView(texto1);

        ab_panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 220, 600));

        limpiar1.setBackground(new java.awt.Color(70, 117, 188));
        limpiar1.setForeground(new java.awt.Color(255, 255, 255));
        limpiar1.setText("Limpiar");
        limpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiar1MouseClicked(evt);
            }
        });
        ab_panel1.add(limpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 620, 130, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Declaración de Variables");
        ab_panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jButton4.setBackground(new java.awt.Color(70, 117, 188));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Agregar mas Variables");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        ab_panel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 150, 40));

        jl_Int.setBackground(new java.awt.Color(255, 255, 255));
        jl_Int.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jl_Int);

        ab_panel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 170, 60));

        jl_Strings.setBackground(new java.awt.Color(255, 255, 255));
        jl_Strings.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_Strings);

        ab_panel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, 60));

        jl_Float.setBackground(new java.awt.Color(255, 255, 255));
        jl_Float.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(jl_Float);

        ab_panel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 170, 60));

        jl_boolean.setBackground(new java.awt.Color(255, 255, 255));
        jl_boolean.setModel(new DefaultListModel());
        jScrollPane6.setViewportView(jl_boolean);

        ab_panel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 170, 60));

        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Enteros");
        ab_panel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Booleans");
        ab_panel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, 20));

        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("Strings");
        ab_panel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 102));
        jLabel18.setText("Floats");
        ab_panel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, 20));

        jButton11.setText("jButton11");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        ab_panel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, -1, -1));

        jButton8.setText("Pegar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        ab_panel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 204));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4856668.png"))); // NOI18N

        jMenu4.setText("Guardar como Imagen");

        jMenuItem10.setText("PNG");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Otro");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("JPG");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenu1.add(jMenu4);

        jMenuItem8.setText("Guardar como PDF");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("jMenuItem9");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4080838.png"))); // NOI18N

        jMenuItem13.setText("Nuevo");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setText("Abrir");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7603989.png"))); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        frame_dflujo.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout frame_dflujoLayout = new javax.swing.GroupLayout(frame_dflujo.getContentPane());
        frame_dflujo.getContentPane().setLayout(frame_dflujoLayout);
        frame_dflujoLayout.setHorizontalGroup(
            frame_dflujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ab_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1302, Short.MAX_VALUE)
        );
        frame_dflujoLayout.setVerticalGroup(
            frame_dflujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ab_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text2.setBackground(new java.awt.Color(255, 255, 255));
        text2.setColumns(20);
        text2.setRows(5);
        jScrollPane2.setViewportView(text2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, 350, 460));

        canvas_UML.setBackground(new java.awt.Color(255, 255, 255));
        canvas_UML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvas_UMLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout canvas_UMLLayout = new javax.swing.GroupLayout(canvas_UML);
        canvas_UML.setLayout(canvas_UMLLayout);
        canvas_UMLLayout.setHorizontalGroup(
            canvas_UMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        canvas_UMLLayout.setVerticalGroup(
            canvas_UMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel2.add(canvas_UML, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 780, 460));

        jButton5.setBackground(new java.awt.Color(89, 139, 197));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Generar Codigo");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 152, -1));

        jButton6.setBackground(new java.awt.Color(89, 139, 197));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Limpiar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 550, 122, -1));

        jPanel4.setBackground(new java.awt.Color(221, 240, 253));

        bt_clasesimple.setBackground(new java.awt.Color(0, 153, 153));
        bt_clasesimple.setForeground(new java.awt.Color(255, 255, 255));
        bt_clasesimple.setText("Agregar Clase Simple");
        bt_clasesimple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_clasesimpleMouseClicked(evt);
            }
        });

        bt_claseAbstracta.setBackground(new java.awt.Color(0, 102, 102));
        bt_claseAbstracta.setForeground(new java.awt.Color(255, 255, 255));
        bt_claseAbstracta.setText("Agregar Clase Abstracta");
        bt_claseAbstracta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_claseAbstractaMouseClicked(evt);
            }
        });

        bt_claseHerencia.setBackground(new java.awt.Color(0, 102, 102));
        bt_claseHerencia.setForeground(new java.awt.Color(255, 255, 255));
        bt_claseHerencia.setText("Agregar Clase con Herencia");
        bt_claseHerencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_claseHerenciaMouseClicked(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 102, 102));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Agregar Clase Compuesta ");
        jButton13.setToolTipText("");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_claseHerencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_claseAbstracta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_clasesimple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(bt_clasesimple)
                .addGap(18, 18, 18)
                .addComponent(bt_claseAbstracta)
                .addGap(18, 18, 18)
                .addComponent(bt_claseHerencia)
                .addGap(16, 16, 16)
                .addComponent(jButton13)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, -1));

        barratareas2.setBackground(new java.awt.Color(221, 240, 253));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Power_Clean_Ico.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        cb_Font2.setBackground(new java.awt.Color(77, 138, 221));
        cb_Font2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Font2ItemStateChanged(evt);
            }
        });

        cb_fotnsize2.setBackground(new java.awt.Color(255, 255, 255));
        cb_fotnsize2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "6", "8", "10", "12", "14", "16", "18" }));
        cb_fotnsize2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_fotnsize2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout barratareas2Layout = new javax.swing.GroupLayout(barratareas2);
        barratareas2.setLayout(barratareas2Layout);
        barratareas2Layout.setHorizontalGroup(
            barratareas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barratareas2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_Font2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_fotnsize2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        barratareas2Layout.setVerticalGroup(
            barratareas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barratareas2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(barratareas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barratareas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_Font2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_fotnsize2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jPanel2.add(barratareas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 470, 40));

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4856668.png"))); // NOI18N

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem1);

        jMenuItem2.setText("Guardar como PDF");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem2);

        jMenu16.setText("Guardar como Imagen");

        jMenuItem3.setText("PNG");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem3);

        jMenuItem4.setText("JPG");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem4);

        jMenuItem5.setText("Otros");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem5);

        jMenu13.add(jMenu16);

        jMenuBar2.add(jMenu13);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4080838.png"))); // NOI18N

        jMenuItem6.setText("Abrir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem6);

        jMenuItem7.setText("Nuevo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem7);

        jMenuBar2.add(jMenu12);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7603989.png"))); // NOI18N
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu14);

        frame_uml.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout frame_umlLayout = new javax.swing.GroupLayout(frame_uml.getContentPane());
        frame_uml.getContentPane().setLayout(frame_umlLayout);
        frame_umlLayout.setHorizontalGroup(
            frame_umlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1487, Short.MAX_VALUE)
        );
        frame_umlLayout.setVerticalGroup(
            frame_umlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pm_Figuras.setBackground(new java.awt.Color(255, 204, 255));

        eliminar.setBackground(new java.awt.Color(255, 204, 255));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        pm_Figuras.add(eliminar);

        jSeparator1.setBackground(new java.awt.Color(255, 204, 255));
        pm_Figuras.add(jSeparator1);

        cambiarColor.setBackground(new java.awt.Color(255, 204, 255));
        cambiarColor.setText("Cambiar Color de Figura");
        cambiarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarColorActionPerformed(evt);
            }
        });
        pm_Figuras.add(cambiarColor);

        cambiarColorFont.setBackground(new java.awt.Color(255, 204, 255));
        cambiarColorFont.setText("Cambiar el color de la letra");
        cambiarColorFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarColorFontActionPerformed(evt);
            }
        });
        pm_Figuras.add(cambiarColorFont);
        pm_Figuras.add(jSeparator3);

        copiar1.setText("Copiar");
        copiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar1ActionPerformed(evt);
            }
        });
        pm_Figuras.add(copiar1);

        frame_variables.setBackground(new java.awt.Color(204, 204, 255));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(153, 0, 255));
        jLabel11.setText("Agregar Variable");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel12.setForeground(new java.awt.Color(102, 0, 153));
        jLabel12.setText("Nombre de la variable: ");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel13.setForeground(new java.awt.Color(102, 0, 153));
        jLabel13.setText("Tipo de variable:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel14.setForeground(new java.awt.Color(102, 0, 153));
        jLabel14.setText("Valor de la variable:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Agregar Variable");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 150, 50));

        valor_variable.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.add(valor_variable, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 250, -1));

        nombre_variable.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.add(nombre_variable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 240, -1));

        cb_tiposvariables.setBackground(new java.awt.Color(255, 255, 255));
        cb_tiposvariables.setForeground(new java.awt.Color(102, 0, 153));
        cb_tiposvariables.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Int", "Float", "String", "Boolean", " ", " " }));
        jPanel5.add(cb_tiposvariables, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 260, -1));

        javax.swing.GroupLayout frame_variablesLayout = new javax.swing.GroupLayout(frame_variables.getContentPane());
        frame_variables.getContentPane().setLayout(frame_variablesLayout);
        frame_variablesLayout.setHorizontalGroup(
            frame_variablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        frame_variablesLayout.setVerticalGroup(
            frame_variablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel19.setForeground(new java.awt.Color(102, 0, 153));
        jLabel19.setText("Proceso Predeterminado");

        jLabel20.setForeground(new java.awt.Color(102, 0, 153));
        jLabel20.setText("Variable 1");

        jLabel21.setForeground(new java.awt.Color(102, 0, 153));
        jLabel21.setText("Tipo de operación");

        jLabel22.setForeground(new java.awt.Color(102, 0, 153));
        jLabel22.setText("Variable Resultado");

        jLabel23.setForeground(new java.awt.Color(102, 0, 153));
        jLabel23.setText("Variable 2");

        jButton7.setBackground(new java.awt.Color(153, 0, 153));
        jButton7.setText("Agregar Proceso");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        cb_procesos.setBackground(new java.awt.Color(255, 255, 255));
        cb_procesos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));

        cb_variable1.setBackground(new java.awt.Color(255, 255, 255));

        cb_variable2.setBackground(new java.awt.Color(255, 255, 255));

        cb_variable3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19)
                            .addComponent(cb_procesos, 0, 149, Short.MAX_VALUE)
                            .addComponent(cb_variable1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_variable2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_variable3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel19)
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cb_procesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cb_variable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cb_variable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cb_variable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout frame_procesoLayout = new javax.swing.GroupLayout(frame_proceso.getContentPane());
        frame_proceso.getContentPane().setLayout(frame_procesoLayout);
        frame_procesoLayout.setHorizontalGroup(
            frame_procesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frame_procesoLayout.setVerticalGroup(
            frame_procesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setForeground(new java.awt.Color(51, 0, 153));
        jLabel24.setText("Tipos de decisiones");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel25.setForeground(new java.awt.Color(51, 0, 153));
        jLabel25.setText("Que tipo de decision es?");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        bg_ifs.add(rb_if);
        rb_if.setForeground(new java.awt.Color(51, 0, 153));
        rb_if.setText("if");
        jPanel7.add(rb_if, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        bg_ifs.add(rb_if2);
        rb_if2.setForeground(new java.awt.Color(51, 0, 153));
        rb_if2.setText("if...else");
        jPanel7.add(rb_if2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel26.setForeground(new java.awt.Color(51, 0, 102));
        jLabel26.setText("Evaluación");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel27.setForeground(new java.awt.Color(51, 0, 102));
        jLabel27.setText("Tipo de variable");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel28.setForeground(new java.awt.Color(51, 0, 102));
        jLabel28.setText("Variable 1");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel29.setForeground(new java.awt.Color(51, 0, 102));
        jLabel29.setText("Variable 2");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        cb_tipovariable_decisiones.setBackground(new java.awt.Color(255, 255, 255));
        cb_tipovariable_decisiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Valor numerico", "Boolean", "Strings" }));
        cb_tipovariable_decisiones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipovariable_decisionesItemStateChanged(evt);
            }
        });
        jPanel7.add(cb_tipovariable_decisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 180, -1));

        cb_variable1_decisiones.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(cb_variable1_decisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 180, -1));

        cb_variable2_decisiones.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(cb_variable2_decisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, -1));

        cb_evaluacion.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(cb_evaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 180, -1));

        bt_decision.setBackground(new java.awt.Color(153, 0, 153));
        bt_decision.setText("Agregar ");
        bt_decision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_decisionMouseClicked(evt);
            }
        });
        jPanel7.add(bt_decision, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 130, 30));

        bg_ifs.add(rb_if3);
        rb_if3.setForeground(new java.awt.Color(51, 0, 102));
        rb_if3.setText("fin if");
        jPanel7.add(rb_if3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        javax.swing.GroupLayout frame_decisionesLayout = new javax.swing.GroupLayout(frame_decisiones.getContentPane());
        frame_decisiones.getContentPane().setLayout(frame_decisionesLayout);
        frame_decisionesLayout.setHorizontalGroup(
            frame_decisionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        frame_decisionesLayout.setVerticalGroup(
            frame_decisionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pm_eliminarArbol.setText("Eliminar");
        pm_eliminarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pm_eliminarArbolActionPerformed(evt);
            }
        });
        pm_UML.add(pm_eliminarArbol);
        pm_UML.add(jSeparator2);

        pm_colorArbol.setText("Cambiar Color de Fondo");
        pm_colorArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pm_colorArbolActionPerformed(evt);
            }
        });
        pm_UML.add(pm_colorArbol);

        pm_colortexto.setText("Cambiar el color del texto");
        pm_colortexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pm_colortextoActionPerformed(evt);
            }
        });
        pm_UML.add(pm_colortexto);
        pm_UML.add(jSeparator4);

        copiar2.setText("Copiar");
        copiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar2ActionPerformed(evt);
            }
        });
        pm_UML.add(copiar2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setBackground(new java.awt.Color(51, 0, 102));
        jLabel30.setForeground(new java.awt.Color(51, 0, 102));
        jLabel30.setText("ej: atributo1,atributo2,etc.....");
        jLabel30.setToolTipText("");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, -1));

        jLabel31.setBackground(new java.awt.Color(51, 0, 102));
        jLabel31.setForeground(new java.awt.Color(51, 0, 102));
        jLabel31.setText("Ingresar metodos");
        jLabel31.setToolTipText("");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel32.setBackground(new java.awt.Color(51, 0, 102));
        jLabel32.setForeground(new java.awt.Color(51, 0, 102));
        jLabel32.setText("Nombre del metodo: ");
        jLabel32.setToolTipText("");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel33.setBackground(new java.awt.Color(51, 0, 102));
        jLabel33.setForeground(new java.awt.Color(51, 0, 102));
        jLabel33.setText("Atributos del metodo: ");
        jLabel33.setToolTipText("");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        metodo_name.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(metodo_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 160, -1));

        metodos_atributos.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(metodos_atributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 150, -1));

        jButton9.setBackground(new java.awt.Color(51, 0, 102));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Agregar Metodo");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        javax.swing.GroupLayout frame_MetodosLayout = new javax.swing.GroupLayout(frame_Metodos.getContentPane());
        frame_Metodos.getContentPane().setLayout(frame_MetodosLayout);
        frame_MetodosLayout.setHorizontalGroup(
            frame_MetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        frame_MetodosLayout.setVerticalGroup(
            frame_MetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        jLabel34.setForeground(new java.awt.Color(102, 0, 153));
        jLabel34.setText("Ingresar Atributos de la Clase");

        jLabel35.setForeground(new java.awt.Color(102, 0, 153));
        jLabel35.setText("Nombre:");

        atributo.setBackground(new java.awt.Color(255, 255, 255));

        jButton10.setBackground(new java.awt.Color(102, 0, 153));
        jButton10.setText("Agregar Atributo");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel35)
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(atributo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel34)
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(atributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frame_AtributosLayout = new javax.swing.GroupLayout(frame_Atributos.getContentPane());
        frame_Atributos.getContentPane().setLayout(frame_AtributosLayout);
        frame_AtributosLayout.setHorizontalGroup(
            frame_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frame_AtributosLayout.setVerticalGroup(
            frame_AtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree1.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane7.setViewportView(jTree1);

        jPanel9.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 340));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 0, 153));
        jLabel36.setText("operador (si es while) :");
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 0, 153));
        jLabel37.setText("Agregar Bucle");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 0, 153));
        jLabel38.setText("Tipo de Bucle:");
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 0, 153));
        jLabel39.setText("variable 1:");
        jPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 0, 153));
        jLabel40.setText("variable 2 :");
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 0, 153));
        jLabel41.setText("variable 3(solo si es for) :");
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, -1));

        jButton12.setBackground(new java.awt.Color(102, 0, 153));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Agregar Bucle");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel10.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 150, 40));

        buttonGroup1.add(bucle_for);
        bucle_for.setForeground(new java.awt.Color(102, 0, 153));
        bucle_for.setText("For");
        jPanel10.add(bucle_for, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 101, -1, 30));

        buttonGroup1.add(bucle_while);
        bucle_while.setForeground(new java.awt.Color(102, 0, 153));
        bucle_while.setText("While");
        jPanel10.add(bucle_while, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 101, -1, 30));
        jPanel10.add(ta_variable3_bucle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 232, 190, 30));
        jPanel10.add(ta_operador_bucle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 190, 30));

        buttonGroup1.add(fin_bucle);
        fin_bucle.setForeground(new java.awt.Color(102, 0, 153));
        fin_bucle.setText("Fin bucle");
        jPanel10.add(fin_bucle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 101, -1, 30));
        jPanel10.add(tf_v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, -1));
        jPanel10.add(tf_v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, -1));

        javax.swing.GroupLayout frame_buclesLayout = new javax.swing.GroupLayout(frame_bucles.getContentPane());
        frame_bucles.getContentPane().setLayout(frame_buclesLayout);
        frame_buclesLayout.setHorizontalGroup(
            frame_buclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        frame_buclesLayout.setVerticalGroup(
            frame_buclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pegar1.setText("Pegar");
        pp_pegarclase.add(pegar1);

        pegar2.setText("Pegar");
        pegar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegar2ActionPerformed(evt);
            }
        });
        pp_pegarflujo.add(pegar2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(" Python interpreter ");

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i1.png"))); // NOI18N
        jButton1.setText("Diagrama De Flujo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i2.png"))); // NOI18N
        jButton2.setMnemonic('D');
        jButton2.setText("Diagramas UML");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/python.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(123, 141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //usar un jpanel
    //trapecio
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        frame_dflujo.pack();
        frame_dflujo.setLocationRelativeTo(null);

        paleta1.setVisible(true);
        //canvas1.setVisible(true);
        barratareas1.setBackground(Color.white);
        barratareas1.setVisible(true);

        // Hacer visible frame_dflujo
        frame_dflujo.setVisible(true);
        //Colorear las figuras de la paleta
        jl_comienzo.setOpaque(true);
        jl_if.setOpaque(true);
        jl_linea1.setOpaque(true);
        jl_linea2.setOpaque(true);
        jl_paralelogramo.setOpaque(true);
        jl_proceso.setOpaque(true);
        jl_proceso2.setOpaque(true);
        jl_documento.setOpaque(true);

        jl_comienzo.setBackground(Color.red);
        jl_if.setBackground(Color.yellow);
        jl_linea1.setBackground(Color.black);
        jl_linea2.setBackground(Color.black);
        jl_paralelogramo.setBackground(Color.orange);
        jl_proceso.setBackground(Color.MAGENTA);
        jl_proceso2.setBackground(Color.CYAN);
        jl_documento.setBackground(Color.BLUE);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        frame_uml.pack();
        frame_uml.setLocationRelativeTo(null);
        frame_uml.setVisible(true);

    }//GEN-LAST:event_jButton2MouseClicked
    // <editor-fold defaultstate="collapsed" desc="Codigo x">
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel5MouseClicked

    private void paleta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paleta1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_paleta1MouseClicked

    private void paleta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paleta1MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_paleta1MouseEntered

    private void canvas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            pp_pegarclase.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_canvas1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        canvas_UML.removeAll();;
        canvas_UML.repaint();
    }//GEN-LAST:event_jLabel7MouseClicked
    // </editor-fold> 
    private void limpiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiar1MouseClicked
        // TODO add your handling code here:
        texto1.setText("");
    }//GEN-LAST:event_limpiar1MouseClicked

    private void jl_comienzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_comienzoMouseClicked
        // TODO add your handling code here:

        if (!mapaOk(figuras)) {
            JOptionPane.showMessageDialog(frame_dflujo, "Ya ingreso una figura de inicio y final. No puede agregar mas");
        } else {

            //Mypanel canvas1 = new Mypanel();
            JLabel z = new JLabel();
            canvas1.setBackground(Color.white);
            int x = evt.getX();
            int y = evt.getY();
            String code = JOptionPane.showInputDialog("Ingrese el texto de la figura");
            Circulo c = new Circulo(Color.yellow, code, x, y);
            c.crearCirculo(cont_circulo, z);
            figuras.add(c);
            cont_circulo++;
            cont_figuras++;
            Drag(z, 1);
        }

    }//GEN-LAST:event_jl_comienzoMouseClicked

    private void jl_procesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_procesoMouseClicked
        // TODO add your handling code here:

        frame_proceso.show(true);
        frame_proceso.setVisible(true);
        frame_proceso.setLocationRelativeTo(frame_dflujo);
        frame_proceso.pack();


    }//GEN-LAST:event_jl_procesoMouseClicked

    private void jl_proceso2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_proceso2MouseClicked
        // TODO add your handling code here:
        frame_bucles.show(true);
        frame_bucles.setVisible(true);
        frame_bucles.setLocationRelativeTo(frame_dflujo);
        frame_bucles.pack();


    }//GEN-LAST:event_jl_proceso2MouseClicked

    private void jl_documentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_documentoMouseClicked
        // TODO add your handling code here:
        JLabel label = new JLabel();
        canvas1.setBackground(Color.white);
        int x = evt.getX();
        int y = evt.getY();
        String code = JOptionPane.showInputDialog("Ingrese el texto de la figura");
        documento r = new documento(Color.yellow, code, x, y);
        r.crearDocumento(cont_documneto, label);
        figuras.add(r);
        cont_documneto++;
        Drag(label, 1);
    }//GEN-LAST:event_jl_documentoMouseClicked

    private void jl_ifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_ifMouseClicked
        // TODO add your handling code here:

        frame_decisiones.show(true);
        frame_decisiones.setVisible(true);
        frame_decisiones.setLocationRelativeTo(frame_dflujo);
        frame_decisiones.pack();

        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jl_ifMouseClicked

    private void jl_paralelogramoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_paralelogramoMouseClicked
        // TODO add your handling code here:
        JLabel label = new JLabel();
        canvas1.setBackground(Color.white);
        int x = evt.getX();
        int y = evt.getY();

        frame_variables.setVisible(true);
        frame_variables.setLocationRelativeTo(frame_dflujo);
        frame_variables.pack();
        String code = "Variables";
        paralelogramo r = new paralelogramo(Color.yellow, code, x, y);
        r.crearParalelogramo(cont_paralelo, label);
        figuras.add(r);
        cont_paralelo++;
        r.setVariables(variables);
        Drag(label, 1);
    }//GEN-LAST:event_jl_paralelogramoMouseClicked

    private void jl_linea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_linea1MouseClicked
        // TODO add your handling code here:
        JLabel label = new JLabel();
        canvas1.setBackground(Color.white);
        int x = evt.getX();
        int y = evt.getY();

        linea1 r = new linea1(Color.yellow, x, y);
        r.crearLinea1(cont_linea1, label);
        figuras.add(r);
        cont_linea1++;
        Drag(label, 1);
    }//GEN-LAST:event_jl_linea1MouseClicked

    private void jl_linea2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_linea2MouseClicked
        // TODO add your handling code here:
        JLabel label = new JLabel();
        canvas1.setBackground(Color.white);
        int x = evt.getX();
        int y = evt.getY();

        linea2 r = new linea2(Color.yellow, x, y);
        r.crearLinea1(cont_linea2, label);
        figuras.add(r);
        cont_linea2++;
        Drag(label, 1);
    }//GEN-LAST:event_jl_linea2MouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        figuras.remove(Label1); // Eliminar el objeto Figura de la lista
        canvas1.remove(Label1); // Eliminar el JLabel del componente
        canvas1.repaint(); // Repintar el componente

    }//GEN-LAST:event_eliminarActionPerformed

    private void cambiarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarColorActionPerformed
        // TODO add your handling code here:
        Color color = JColorChooser.showDialog(frame_dflujo, "Escoja el nuevo color", Color.yellow);
        Label1.setBackground(color);
    }//GEN-LAST:event_cambiarColorActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_tiposvariables.getModel();
        DefaultComboBoxModel cb2 = (DefaultComboBoxModel) cb_variable1.getModel();
        DefaultComboBoxModel cb3 = (DefaultComboBoxModel) cb_variable2.getModel();
        DefaultComboBoxModel cb4 = (DefaultComboBoxModel) cb_variable3.getModel();

        DefaultListModel jl = (DefaultListModel) jl_Int.getModel();
        DefaultListModel jl2 = (DefaultListModel) jl_Float.getModel();
        DefaultListModel jl3 = (DefaultListModel) jl_Strings.getModel();
        DefaultListModel jl4 = (DefaultListModel) jl_boolean.getModel();

        int index = cb_tiposvariables.getSelectedIndex();
        String type = (String) cb.getElementAt(index);
        String nombre = nombre_variable.getText();
        String x = "";
        String vs = "";
        cont_framevariables++;
        if (!nombre_variable.getText().isEmpty() && cont_framevariables > 0) {
            if (type.equalsIgnoreCase("Int")) {

                if (!valor_variable.getText().isEmpty()) {
                    variable_int = Integer.parseInt(valor_variable.getText());
                    jl.addElement(new v_Int(variable_int, nombre));
                    cb2.addElement(new v_Int(variable_int, nombre));
                    cb3.addElement(new v_Int(variable_int, nombre));
                    cb4.addElement(new v_Int(variable_int, nombre));
                    variables_int.add(new v_Int(variable_int, nombre));
                    variables.add(new v_Int(variable_int, nombre));
                } else {
                    variable_int = 0;
                    jl.addElement(new v_Int(variable_int, nombre));
                    cb2.addElement(new v_Int(variable_int, nombre));
                    cb3.addElement(new v_Int(variable_int, nombre));
                    cb4.addElement(new v_Int(variable_int, nombre));
                    variables_int.add(new v_Int(variable_int, nombre));
                    variables.add(new v_Int(variable_int, nombre));
                }

            }
            if (type.equals("Float")) {

                if (!valor_variable.getText().isEmpty()) {
                    variable_float = Float.parseFloat(valor_variable.getText());
                    jl2.addElement(new v_Float(variable_float, nombre));
                    cb2.addElement(new v_Float(variable_float, nombre));
                    cb3.addElement(new v_Float(variable_float, nombre));
                    cb4.addElement(new v_Float(variable_float, nombre));
                    variables_float.add(new v_Float(variable_float, nombre));
                    variables.add(new v_Float(variable_float, nombre));
                } else {
                    variable_float = 0;
                    jl2.addElement(new v_Float(variable_float, nombre));
                    cb2.addElement(new v_Float(variable_float, nombre));
                    cb3.addElement(new v_Float(variable_float, nombre));
                    cb4.addElement(new v_Float(variable_float, nombre));
                    variables_float.add(new v_Float(variable_float, nombre));
                    variables.add(new v_Float(variable_float, nombre));
                }

            }
            if (type.equals("Boolean")) {
                String value = valor_variable.getText();
                if (value.equalsIgnoreCase("true") || valor_variable.getText().isEmpty()) {
                    variable_boolean = true;
                    jl4.addElement(new v_Boolean(variable_boolean, nombre));
                    variables_boolean.add(new v_Boolean(variable_boolean, nombre));
                    variables.add(new v_Boolean(variable_boolean, nombre));
                } else {
                    variable_boolean = false;
                    jl4.addElement(new v_Boolean(variable_boolean, nombre));
                    variables_boolean.add(new v_Boolean(variable_boolean, nombre));
                    variables.add(new v_Boolean(variable_boolean, nombre));
                }
            }
            if (type.equals("String")) {
                vs += "\"";
                vs += valor_variable.getText();
                vs += "\"";
                jl3.addElement(new v_String(vs, nombre));
                variables_string.add(new v_String(vs, nombre));
                variables.add(new v_String(vs, nombre));
            }
            jl_Int.setModel(jl);
            jl_Float.setModel(jl2);
            jl_Strings.setModel(jl3);
            jl_boolean.setModel(jl4);

            cb_variable1.setModel(cb2);
            cb_variable2.setModel(cb3);
            cb_variable3.setModel(cb4);

            valor_variable.setText("");
            nombre_variable.setText("");
            cont_figuras++;
        } else {
            JOptionPane.showMessageDialog(frame_dflujo, "No debe dejar casillas en blanco");
        }

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        frame_variables.show(true);
        frame_variables.setVisible(true);
        frame_variables.setLocationRelativeTo(frame_dflujo);
        frame_variables.pack();
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_tiposvariables.getModel();
        DefaultComboBoxModel cb2 = (DefaultComboBoxModel) cb_variable1.getModel();
        DefaultComboBoxModel cb3 = (DefaultComboBoxModel) cb_variable2.getModel();
        DefaultComboBoxModel cb4 = (DefaultComboBoxModel) cb_variable3.getModel();

        DefaultListModel jl = (DefaultListModel) jl_Int.getModel();
        DefaultListModel jl2 = (DefaultListModel) jl_Float.getModel();
        DefaultListModel jl3 = (DefaultListModel) jl_Strings.getModel();
        DefaultListModel jl4 = (DefaultListModel) jl_boolean.getModel();

        int index = cb_tiposvariables.getSelectedIndex();
        String type = (String) cb.getElementAt(index);
        String nombre = nombre_variable.getText();
        String x = "";
        String vs = "";
        cont_framevariables++;
        if (!nombre_variable.getText().isEmpty() && cont_framevariables > 0) {
            if (type.equalsIgnoreCase("Int")) {

                if (!valor_variable.getText().isEmpty()) {
                    variable_int = Integer.parseInt(valor_variable.getText());
                    jl.addElement(new v_Int(variable_int, nombre));
                    cb2.addElement(new v_Int(variable_int, nombre));
                    cb3.addElement(new v_Int(variable_int, nombre));
                    cb4.addElement(new v_Int(variable_int, nombre));
                    variables_int.add(new v_Int(variable_int, nombre));
                    variables.add(new v_Int(variable_int, nombre));
                } else {
                    variable_int = 0;
                    jl.addElement(new v_Int(variable_int, nombre));
                    cb2.addElement(new v_Int(variable_int, nombre));
                    cb3.addElement(new v_Int(variable_int, nombre));
                    cb4.addElement(new v_Int(variable_int, nombre));
                    variables_int.add(new v_Int(variable_int, nombre));
                    variables.add(new v_Int(variable_int, nombre));
                }

            }
            if (type.equals("Float")) {

                if (!valor_variable.getText().isEmpty()) {
                    variable_float = Float.parseFloat(valor_variable.getText());
                    jl2.addElement(new v_Float(variable_float, nombre));
                    cb2.addElement(new v_Float(variable_float, nombre));
                    cb3.addElement(new v_Float(variable_float, nombre));
                    cb4.addElement(new v_Float(variable_float, nombre));
                    variables_float.add(new v_Float(variable_float, nombre));
                    variables.add(new v_Float(variable_float, nombre));
                } else {
                    variable_float = 0;
                    jl2.addElement(new v_Float(variable_float, nombre));
                    cb2.addElement(new v_Float(variable_float, nombre));
                    cb3.addElement(new v_Float(variable_float, nombre));
                    cb4.addElement(new v_Float(variable_float, nombre));
                    variables_float.add(new v_Float(variable_float, nombre));
                    variables.add(new v_Float(variable_float, nombre));
                }

            }
            if (type.equals("Boolean")) {
                String value = valor_variable.getText();
                if (value.equalsIgnoreCase("true") || valor_variable.getText().isEmpty()) {
                    variable_boolean = true;
                    jl4.addElement(new v_Boolean(variable_boolean, nombre));
                    variables_boolean.add(new v_Boolean(variable_boolean, nombre));
                    variables.add(new v_Boolean(variable_boolean, nombre));
                } else {
                    variable_boolean = false;
                    jl4.addElement(new v_Boolean(variable_boolean, nombre));
                    variables_boolean.add(new v_Boolean(variable_boolean, nombre));
                    variables.add(new v_Boolean(variable_boolean, nombre));
                }
            }
            if (type.equals("String")) {
                vs += "\"";
                vs += valor_variable.getText();
                vs += "\"";
                jl3.addElement(new v_String(vs, nombre));
                variables_string.add(new v_String(vs, nombre));
                variables.add(new v_String(vs, nombre));
            }
            jl_Int.setModel(jl);
            jl_Float.setModel(jl2);
            jl_Strings.setModel(jl3);
            jl_boolean.setModel(jl4);

            cb_variable1.setModel(cb2);
            cb_variable2.setModel(cb3);
            cb_variable3.setModel(cb4);

            valor_variable.setText("");
            nombre_variable.setText("");

        } else {
            JOptionPane.showMessageDialog(frame_dflujo, "No debe dejar casillas en blanco");
        }

    }//GEN-LAST:event_jButton4MouseClicked

    private void cambiarColorFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarColorFontActionPerformed
        // TODO add your handling code here:
        Color color = JColorChooser.showDialog(frame_dflujo, "Escoja el nuevo color", Color.yellow);
        Label1.setForeground(color);
    }//GEN-LAST:event_cambiarColorFontActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel cb1 = (DefaultComboBoxModel) cb_procesos.getModel();
        DefaultComboBoxModel cb2 = (DefaultComboBoxModel) cb_variable1.getModel();
        DefaultComboBoxModel cb3 = (DefaultComboBoxModel) cb_variable2.getModel();
        DefaultComboBoxModel cb4 = (DefaultComboBoxModel) cb_variable3.getModel();

        JLabel label = new JLabel();
        canvas1.setBackground(Color.white);
        int x = evt.getX();
        int y = evt.getY();

        int index1 = cb_variable1.getSelectedIndex();
        int index2 = cb_variable2.getSelectedIndex();
        int index3 = cb_variable3.getSelectedIndex();
        int index4 = cb_procesos.getSelectedIndex();
        String v1 = "";
        String v2 = "";
        String v3 = "";
        String proceso = cb1.getElementAt(index4).toString();

        if (cb1.getElementAt(index1) instanceof v_Int || cb2.getElementAt(index2) instanceof v_Int || cb1.getElementAt(index1) instanceof v_Int) {
            v1 += ((v_Int) cb2.getElementAt(index1)).getNombre();
            v2 += ((v_Int) cb3.getElementAt(index2)).getNombre();
            v3 += ((v_Int) cb4.getElementAt(index3)).getNombre();

        } else {
            v1 += ((v_Float) cb2.getElementAt(index1)).getNombre();
            v2 += ((v_Float) cb3.getElementAt(index2)).getNombre();
            v3 += ((v_Float) cb4.getElementAt(index3)).getNombre();
        }
        String c = "";
        c += v3;
        c += " = ";
        c += v1;
        c += proceso;
        c += v2;

        r = new Rectangulo(Color.yellow, c, x, y);
        r.crearRectangulo(cont_rectangulo, label);
        figuras.add(r);
        cont_rectangulo++;
        Drag(label, 1);


    }//GEN-LAST:event_jButton7MouseClicked

    private void cb_tipovariable_decisionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipovariable_decisionesItemStateChanged
        // TODO add your handling code here:
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_tipovariable_decisiones.getModel();
        int index = cb_tipovariable_decisiones.getSelectedIndex();

        String type = (String) cb.getElementAt(index);

        DefaultComboBoxModel cb1 = (DefaultComboBoxModel) cb_variable1_decisiones.getModel();
        DefaultComboBoxModel cb2 = (DefaultComboBoxModel) cb_variable2_decisiones.getModel();
        DefaultComboBoxModel cb3 = (DefaultComboBoxModel) cb_evaluacion.getModel();

        if (type.equalsIgnoreCase("Valor numerico")) {
            cb1.removeAllElements();
            cb2.removeAllElements();
            cb3.removeAllElements();
            for (v_Int int1 : variables_int) {
                cb1.addElement(int1);
                cb2.addElement(int1);
            }
            for (v_Float float1 : variables_float) {
                cb1.addElement(float1);
                cb2.addElement(float1);
            }
            cb3.addElement("==");
            cb3.addElement("!=");
            cb3.addElement("<=");
            cb3.addElement(">=");
            cb3.addElement(">");
            cb3.addElement("<");

        }
        if (type.equalsIgnoreCase("Boolean")) {
            cb1.removeAllElements();
            cb2.removeAllElements();
            cb3.removeAllElements();
            for (v_Boolean boolean1 : variables_boolean) {
                cb1.addElement(boolean1);
                cb2.addElement(boolean1);
            }
            cb3.addElement("==");
            cb3.addElement("!=");
        }
        if (type.equalsIgnoreCase("Strings")) {
            cb1.removeAllElements();
            cb2.removeAllElements();
            cb3.removeAllElements();
            for (v_String string : variables_string) {
                cb1.addElement(string);
                cb2.addElement(string);
            }
            cb3.addElement("==");
            cb3.addElement("!=");
            cb3.addElement("<=");
            cb3.addElement(">=");
            cb3.addElement(">");
            cb3.addElement("<");

        }
        cb_variable1_decisiones.setModel(cb1);
        cb_variable2_decisiones.setModel(cb2);
        cb_evaluacion.setModel(cb3);

    }//GEN-LAST:event_cb_tipovariable_decisionesItemStateChanged

    private void bt_decisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_decisionMouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel cb1 = (DefaultComboBoxModel) cb_variable1_decisiones.getModel();
        DefaultComboBoxModel cb2 = (DefaultComboBoxModel) cb_variable2_decisiones.getModel();
        DefaultComboBoxModel cb3 = (DefaultComboBoxModel) cb_evaluacion.getModel();

        int index1 = cb_variable1_decisiones.getSelectedIndex();
        int index2 = cb_variable2_decisiones.getSelectedIndex();
        int index3 = cb_evaluacion.getSelectedIndex();

        Object v1 = cb1.getElementAt(index1);
        Object v2 = cb2.getElementAt(index2);
        String evaluacion = cb3.getElementAt(index3).toString();

        String code = "";

        if (rb_if.isSelected()) {
            if (v1 instanceof v_Int && v2 instanceof v_Int) {
                code += ((v_Int) v1).getNombre();
                code += " ";
                code += evaluacion;
                code += " ";
                code += ((v_Int) v2).getNombre();
            }
            if (v1 instanceof v_Float && v2 instanceof v_Float) {
                code += ((v_Float) v1).getNombre();
                code += " ";
                code += evaluacion;
                code += " ";
                code += ((v_Float) v2).getNombre();
            }
            if (v1 instanceof v_String && v2 instanceof v_String) {
                code += ((v_String) v1).getNombre();
                code += " ";
                code += evaluacion;
                code += " ";
                code += ((v_String) v2).getNombre();
            }
            if (v1 instanceof v_Boolean && v2 instanceof v_Boolean) {
                code += ((v_Boolean) v1).getNombre();
                code += " ";
                code += evaluacion;
                code += " ";
                code += ((v_Boolean) v2).getNombre();
            }

            JLabel label = new JLabel();
            canvas1.setBackground(Color.white);
            cont_rombo++;
            Rombo r = new Rombo(cont_rombo, Color.yellow, code, x, y);
            r.crearRombo(cont_rombo, label);
            figuras.add(r);
            ifs.add(r);

            Drag(label, 1);
        }
        if (rb_if2.isSelected()) {
            JLabel label2 = new JLabel();
            canvas1.setBackground(Color.white);
            cont_ifno++;
            if_no r2 = new if_no(cont_ifno, Color.yellow, "else", x, y);
            r2.crearRombo(cont_rombo, label2);
            figuras.add(r2);
            ifs.add(r2);
            Drag(label2, 1);

        }
        if (rb_if3.isSelected()) {
            JLabel label = new JLabel();
            canvas1.setBackground(Color.white);
            cont_iffin++;
            if_fin r = new if_fin(cont_iffin, Color.yellow, "Fin If", x, y);
            r.crearRombo(cont_rombo, label);
            figuras.add(r);
            ifs.add(r);

            Drag(label, 1);
        }

    }//GEN-LAST:event_bt_decisionMouseClicked

    private void bt_clasesimpleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_clasesimpleMouseClicked
        // TODO add your handling code here:

        if (metodos.isEmpty() || atributos.isEmpty()) {
            frame_Metodos.show(true);
            frame_Metodos.setVisible(true);
            frame_Metodos.setLocationRelativeTo(canvas_UML);
            frame_Metodos.pack();

            frame_Atributos.show(true);
            frame_Atributos.setVisible(true);
            frame_Atributos.setLocationRelativeTo(canvas_UML);
            frame_Atributos.pack();

        } else {
            Color color = JColorChooser.showDialog(canvas_UML, "Escoja el color de fondo", Color.yellow);
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la clase");
            CustomPanel panel = new CustomPanel(nombre, metodos, atributos);
            panel.setLabel(nombre);
            panel.setPreferredSize(new Dimension(150, 150));
            panel.setBackground(color);
            panel.setBounds(x, y, 200, 200);
            canvas_UML.add(panel, BorderLayout.CENTER);
            canvas_UML.revalidate();
            canvas_UML.repaint();
            clases.add(panel);
            System.out.println(panel.getLabel());
            DragPanel(panel, 1);
            metodos = new ArrayList();
            atributos = new ArrayList();
        }

    }//GEN-LAST:event_bt_clasesimpleMouseClicked

    private void pm_eliminarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pm_eliminarArbolActionPerformed
        // TODO add your handling code here:
        canvas_UML.remove(arbol_seleccionado);
        canvas_UML.repaint();
    }//GEN-LAST:event_pm_eliminarArbolActionPerformed

    private void pm_colorArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pm_colorArbolActionPerformed
        // TODO add your handling code here:
        arbol_seleccionado.setBackground(JColorChooser.showDialog(frame_uml, "Ingrese el color de fondo", Color.yellow));
    }//GEN-LAST:event_pm_colorArbolActionPerformed

    private void cb_fontsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fontsItemStateChanged
        // TODO add your handling code here:
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_fonts.getModel();
        int index = cb_fonts.getSelectedIndex();
        String font = (String) cb.getElementAt(index);
        try {
            Label1.setFont(new java.awt.Font(Fuentes.get(index).getFontName(), Label1.getFont().getStyle(), Label1.getFont().getSize()));
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_cb_fontsItemStateChanged

    private void cb_fontsizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fontsizeItemStateChanged
        // TODO add your handling code here:
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_fontsize.getModel();
        int index = cb_fonts.getSelectedIndex();
        int size = Integer.parseInt((String) cb.getElementAt(index));
        try {
            Label1.setFont(new java.awt.Font(Label1.getFont().getName(), Label1.getFont().getStyle(), size));
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_cb_fontsizeItemStateChanged

    private void cb_Font2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Font2ItemStateChanged
        // TODO add your handling code here:
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_Font2.getModel();
        int index = cb_Font2.getSelectedIndex();
        String font = (String) cb.getElementAt(index);
        try {
            arbol_seleccionado.getTextPane1().setFont(new java.awt.Font(Fuentes.get(index).getFontName(), arbol_seleccionado.getTextPane1().getFont().getStyle(), arbol_seleccionado.getTextPane1().getFont().getSize()));
            arbol_seleccionado.getTextPane2().setFont(new java.awt.Font(Fuentes.get(index).getFontName(), arbol_seleccionado.getTextPane2().getFont().getStyle(), arbol_seleccionado.getTextPane2().getFont().getSize()));
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_cb_Font2ItemStateChanged

    private void cb_fotnsize2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fotnsize2ItemStateChanged
        // TODO add your handling code here:
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_fotnsize2.getModel();
        int index = cb_fotnsize2.getSelectedIndex();
        int size = Integer.parseInt((String) cb.getElementAt(index));
        try {
            arbol_seleccionado.getTextPane1().setFont(new java.awt.Font(arbol_seleccionado.getTextPane1().getFont().getName(), arbol_seleccionado.getTextPane1().getFont().getStyle(), size));
            arbol_seleccionado.getTextPane2().setFont(new java.awt.Font(arbol_seleccionado.getTextPane2().getFont().getName(), arbol_seleccionado.getTextPane2().getFont().getStyle(), size));
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_cb_fotnsize2ItemStateChanged

    private void pm_colortextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pm_colortextoActionPerformed
        // TODO add your handling code here:
        Color color = JColorChooser.showDialog(frame_uml, "Escoja un color", Color.yellow);
        arbol_seleccionado.getTextPane1().setForeground(color);
        arbol_seleccionado.getTextPane2().setForeground(color);
        arbol_seleccionado.setColors(color);
    }//GEN-LAST:event_pm_colortextoActionPerformed

    private void bt_generarcodigo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_generarcodigo1MouseClicked
        // TODO add your handling code here:
        String Codigo = "";
        if (mapaOk(figuras) == true) {
            JOptionPane.showMessageDialog(frame_dflujo, "Revise que su diagrama contenga un inicio y un final");
        } else {
            /* int indexelse = indexElse(figuras);
            int indexfin = indexFin(figuras);
           
            int cont = 0;
            for (Figura figura : figuras) {
                if (figura instanceof paralelogramo) {
                    ((paralelogramo) figura).setVariables(variables);
                    codigo += figura.code();
                    codigo += "\n";

                } else if (figura instanceof Rombo) {
                    if (cont + 1 < figuras.size()) {
                        if (figuras.get(cont + 1) instanceof if_fin) {

                        } else {
                            ((Rombo) figura).setSi(figuras.get(cont + 1));
                            codigo += figura.code();
                            codigo += "\n\t";

                        }
                    }
                } else if (figura instanceof if_no) {
                    if (cont + 1 < figuras.size()) {
                        if (figuras.get(cont + 1) instanceof if_fin) {

                        } else {
                            ((if_no) figura).setProceso(figuras.get(cont + 1));
                            codigo += figura.code();
                            codigo += "\n\t";

                        }
                    }
                } else {
                    if (figuras.get(cont - 1) instanceof if_fin) {
                        codigo += figura.code();
                        codigo += "\n";

                    } else {
                        codigo += figura.code();
                        codigo += "\n\t";
                    }
                }

                cont++;
            }
            texto1.setText(codigo);*/
            try {
                DefaultTreeModel tm = (DefaultTreeModel) jTree1.getModel();

                String C = imprimirNodoDecision("", (DefaultMutableTreeNode) tm.getRoot(), "");
                texto1.setText(C);
                JOptionPane.showMessageDialog(canvas1, "Codigo Generado Exitosamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(canvas1, "Ha ocurrido un error, revise las variables de los elementos");
            }
        }

    }//GEN-LAST:event_bt_generarcodigo1MouseClicked

    private void bt_claseAbstractaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_claseAbstractaMouseClicked
        // TODO add your handling code here:
        if (atributos.isEmpty() || metodos.isEmpty()) {
            frame_Metodos.show(true);
            frame_Metodos.setVisible(true);
            frame_Metodos.setLocationRelativeTo(canvas_UML);
            frame_Metodos.pack();

            frame_Atributos.show(true);
            frame_Atributos.setVisible(true);
            frame_Atributos.setLocationRelativeTo(canvas_UML);
            frame_Atributos.pack();
        } else {
            Color color = JColorChooser.showDialog(canvas_UML, "Escoja el color de fondo", Color.yellow);
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la clase");
            CustomPanel panel = new CustomPanel("Abstract " + nombre, metodos, atributos);
            panel.setLabel(nombre);
            panel.setPreferredSize(new Dimension(150, 150));
            panel.setBackground(color);
            panel.setBounds(x, y, 200, 200);
            canvas_UML.add(panel, BorderLayout.CENTER);
            canvas_UML.revalidate();
            canvas_UML.repaint();
            clases.add(panel);
            DragPanel(panel, 1);
            metodos = new ArrayList();
            atributos = new ArrayList();
        }
    }//GEN-LAST:event_bt_claseAbstractaMouseClicked

    private void bt_claseHerenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_claseHerenciaMouseClicked
        // TODO add your handling code here:
        if (clases.isEmpty()) {
            JOptionPane.showMessageDialog(canvas_UML, "Antes de crear una clase con herencia debe crear una clase padre");
        } else {
            if (atributos.isEmpty() || metodos.isEmpty()) {
                frame_Metodos.show(true);
                frame_Metodos.setVisible(true);
                frame_Metodos.setLocationRelativeTo(canvas_UML);
                frame_Metodos.pack();

                frame_Atributos.show(true);
                frame_Atributos.setVisible(true);
                frame_Atributos.setLocationRelativeTo(canvas_UML);
                frame_Atributos.pack();
            } else {
                Color color = JColorChooser.showDialog(canvas_UML, "Escoja el color de fondo", Color.yellow);

                String padre = JOptionPane.showInputDialog(canvas_UML, "Ingrese el nombre de la clase padre: ");
                boolean verificar = verifyHerencia(padre);
                while (verificar == false) {
                    padre = JOptionPane.showInputDialog(canvas_UML, "Ingrese el nombre de la clase padre: ");
                    verificar = verifyHerencia(padre);
                }
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la clase");
                boolean verificar2 = verifyHerencia2(nombre);
                while (verificar2 == false) {
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre de la clase");
                    verificar2 = verifyHerencia2(nombre);
                }
                CustomPanel padrepanel = returnpadre(padre);
                ClaseHerencia panel = new ClaseHerencia(nombre + " extends " + padre, metodos, atributos);
                panel.setPadre(padrepanel);
                panel.setLabel(nombre);
                panel.setNombre_padre(padre);
                panel.setPreferredSize(new Dimension(150, 150));
                panel.setBackground(color);
                panel.setBounds(x, y, 200, 200);
                canvas_UML.add(panel, BorderLayout.CENTER);
                canvas_UML.revalidate();
                canvas_UML.repaint();
                clases.add(panel);
                DragPanel(panel, 1);
                metodos = new ArrayList();
                atributos = new ArrayList();
            }
        }

    }//GEN-LAST:event_bt_claseHerenciaMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        try {
            String x = "";
            int i = 0;
            for (CustomPanel clase : clases) {
                if (clase instanceof CustomPanel) {
                    x += clase.codigoo();
                    x += "\n";
                } else if (clase instanceof ClaseAbstracta) {
                    x += ((ClaseAbstracta) clase).codigoo22();
                    x += "\n";

                } else if (clase instanceof ClaseHerencia) {
                    x += ((ClaseHerencia) clase).codigoo3();
                    x += "\n";
                }

            }
            text2.setText(x);
            JOptionPane.showMessageDialog(canvas_UML, "Codigo Generado Exitosamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(canvas_UML, "Opsies! Algo falló en el proceso :(");
        }

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        String nombre = metodo_name.getText();
        String a1 = metodos_atributos.getText();
        Metodo n = new Metodo(a1, nombre);
        metodo_name.setText("");
        metodos_atributos.setText("");
        metodos.add(n);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        String a = atributo.getText();
        atributos.add(a);
        atributo.setText("");
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked

        JTree x;
        x = construirArbol2(figuras);
        DefaultTreeModel tm = (DefaultTreeModel) x.getModel();

        jTree1.setModel(tm);

        jDialog1.show(true);
        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(frame_uml);
        jDialog1.pack();
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
        String v1 = tf_v1.getText();
        String v2 = tf_v2.getText();
        String v3 = ta_variable3_bucle.getText();
        String op = ta_operador_bucle.getText();
        if (bucle_for.isSelected()) {
            JLabel label = new JLabel();
            canvas1.setBackground(Color.white);
            int x = evt.getX();
            int y = evt.getY();
            String code = "for " + v3 + " in range( " + v1 + "," + v2 + "): ";
            cont_rectangulo2++;
            Rectangulo2 r = new Rectangulo2(cont_rectangulo2, Color.yellow, code, x, y);
            r.crearRectangulo(cont_rectangulo2, label);
            figuras.add(r);

            Drag(label, 1);
        }
        if (bucle_while.isSelected()) {
            JLabel label = new JLabel();
            canvas1.setBackground(Color.white);
            int x = evt.getX();
            int y = evt.getY();
            String code = "while " + v1 + " " + op + " " + v2 + " :";
            cont_rectangulo2++;
            Rectangulo2 r = new Rectangulo2(cont_rectangulo2, Color.yellow, code, x, y);
            r.crearRectangulo(cont_rectangulo2, label);
            figuras.add(r);

            Drag(label, 1);
        }
        if (fin_bucle.isSelected()) {
            JLabel label = new JLabel();
            canvas1.setBackground(Color.white);
            int x = evt.getX();
            int y = evt.getY();
            String code = "Fin bucle";
            cont_finbucle++;
            fin_bucle r = new fin_bucle(cont_finbucle, Color.yellow, code, x, y);
            r.crearRectangulo(cont_rectangulo2, label);
            figuras.add(r);

            Drag(label, 1);

        }
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        text2.setText("");
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:

        if (metodos.isEmpty() || atributos.isEmpty()) {
            frame_Metodos.show(true);
            frame_Metodos.setVisible(true);
            frame_Metodos.setLocationRelativeTo(canvas_UML);
            frame_Metodos.pack();

            frame_Atributos.show(true);
            frame_Atributos.setVisible(true);
            frame_Atributos.setLocationRelativeTo(canvas_UML);
            frame_Atributos.pack();

        } else {
            Color color = JColorChooser.showDialog(canvas_UML, "Escoja el color de fondo", Color.yellow);
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la clase");
            CustomPanel panel = new CustomPanel(nombre, metodos, atributos);
            panel.setLabel(nombre);
            panel.setPreferredSize(new Dimension(150, 150));
            panel.setBackground(color);
            panel.setBounds(x, y, 200, 200);
            canvas_UML.add(panel, BorderLayout.CENTER);
            canvas_UML.revalidate();
            canvas_UML.repaint();
            clases.add(panel);
            System.out.println(panel.getLabel());
            DragPanel(panel, 1);
            metodos = new ArrayList();
            atributos = new ArrayList();
        }

    }//GEN-LAST:event_jButton13MouseClicked

    private void canvas_UMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas_UMLMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            pp_pegarclase.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_canvas_UMLMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        panelActual = canvas_UML;
        Dialogo_Actual = frame_uml;
        GuardarD("Diagrama de Clases", "uml", "Diagramas De Clase");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        GenerarPDF(text2.getText(), canvas_UML, 1);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        CrearIMG(canvas_UML, "png");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        CrearIMG(canvas_UML, "jpg");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        String Opcion = "";
        String[] Opciones = {"bmp", "gif", "jpeg"};
        Opcion = (String) JOptionPane.showInputDialog(null,
                "Seleccione un formato de imagen", //Mensaje
                "                                  IMAGEN",//TITULO
                JOptionPane.QUESTION_MESSAGE,
                null,
                Opciones,
                Opciones[0]);
        if (Opcion == null) {
            JOptionPane.showMessageDialog(canvas_UML, "No se ha seleccionado un formato");
        } else {
            CrearIMG(canvas_UML, Opcion);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        panelActual = canvas_UML;
        Dialogo_Actual = frame_uml;
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Diagramas de Clases", "uml");
        jfc.addChoosableFileFilter(filtro2);
        int seleccion = jfc.showOpenDialog(this.Dialogo_Actual);
        System.out.println(jfc.getSelectedFile().getPath());
        String Extension = jfc.getSelectedFile().getPath();
        String Extension2 = Extension.substring(Extension.length() - 5, Extension.length());
        if (Extension2.equalsIgnoreCase("uml")) {//Clases
            AbrirD(Extension);
            text2.setText("");
        } else {
            JOptionPane.showMessageDialog(Dialogo_Actual, "El Tipo de formato no es reconocible para este tipo de diagrama");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this.canvas_UML, "¿Seguro de que desea eliminar todos los elementos del panel?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.OK_OPTION) {
            canvas_UML.removeAll();
            canvas_UML.repaint();
            text2.setText("");
            panelActual.removeAll();
            panelActual.repaint();
            JOptionPane.showMessageDialog(canvas_UML, "Se ha Limpiado el area de trabajo");
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Diagramas UML (PDF)", "pdf");
        jfc.setFileFilter(filtro); // Configura el filtro en el JFileChooser

        int seleccion = jfc.showOpenDialog(null); // Abre el diálogo para seleccionar un archivo
        if (seleccion == JFileChooser.APPROVE_OPTION) { // El usuario seleccionó un archivo
            String Ruta = jfc.getSelectedFile().getPath(); // Obtiene la ruta del archivo seleccionado
            // Aquí puedes verificar si Ruta apunta a un archivo PDF antes de continuar
            if (Ruta.toLowerCase().endsWith(".pdf")) {
                GenerarPDF(text2.getText(), canvas_UML, 2);
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                java.io.File fichero = new java.io.File(Ruta);

                if (desktop.isSupported(Desktop.Action.PRINT)) {
                    Desktop desktop2 = Desktop.getDesktop();
                    File file = new File(Ruta);
                    if (file.exists()) {
                        try {
                            desktop2.open(file); // Abre el archivo PDF con la aplicación predeterminada
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo PDF para imprimir.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El archivo PDF no existe en la ubicación especificada.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La función de impresión no es compatible en este sistema.");
                }
            }
        }
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Diagramas de Flujo (PDF)", "pdf");
        jfc.setFileFilter(filtro); // Configura el filtro en el JFileChooser

        int seleccion = jfc.showOpenDialog(null); // Abre el diálogo para seleccionar un archivo
        if (seleccion == JFileChooser.APPROVE_OPTION) { // El usuario seleccionó un archivo
            String Ruta = jfc.getSelectedFile().getPath(); // Obtiene la ruta del archivo seleccionado
            // Aquí puedes verificar si Ruta apunta a un archivo PDF antes de continuar
            if (Ruta.toLowerCase().endsWith(".pdf")) {
                GenerarPDF(texto1.getText(), canvas1, 2);
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                java.io.File fichero = new java.io.File(Ruta);

                if (desktop.isSupported(Desktop.Action.PRINT)) {
                    Desktop desktop2 = Desktop.getDesktop();
                    File file = new File(Ruta);
                    if (file.exists()) {
                        try {
                            desktop2.open(file); // Abre el archivo PDF con la aplicación predeterminada
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo PDF para imprimir.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El archivo PDF no existe en la ubicación especificada.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La función de impresión no es compatible en este sistema.");
                }
            }
        }
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        GenerarPDF(texto1.getText(), canvas1, 1);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        panelActual = canvas1;
        Dialogo_Actual = frame_dflujo;
        Guardar("Diagrama de Flujo", "xd", "Diagramas De Flujo");
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        CrearIMG(canvas1, "png");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        String Opcion = "";
        String[] Opciones = {"bmp", "gif", "jpeg"};
        Opcion = (String) JOptionPane.showInputDialog(null,
                "Seleccione un formato de imagen", //Mensaje
                "                                  IMAGEN",//TITULO
                JOptionPane.QUESTION_MESSAGE,
                null,
                Opciones,
                Opciones[0]);
        if (Opcion == null) {
            JOptionPane.showMessageDialog(frame_dflujo, "No se ha seleccionado un formato");
        } else {
            CrearIMG(canvas1, Opcion);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        CrearIMG(canvas1, "jpg");
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this.canvas1, "¿Seguro de que desea eliminar todos los elementos del panel?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.OK_OPTION) {
            texto1.setText("");
            canvas1.removeAll();
            canvas1.repaint();
            JOptionPane.showMessageDialog(canvas1, "Se ha Limpiado el area de trabajo");
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        panelActual = canvas1;
        Dialogo_Actual = frame_dflujo;
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Diagramas De Flujo", "xd");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showOpenDialog(this.Dialogo_Actual);
        String Extension = jfc.getSelectedFile().getPath();//este comando obtiene la ruta completa del archivo seleccionado y la almacena en la variable Extension.
        String Extension2 = Extension.substring(Extension.length() - 4, Extension.length());// Esto se hace para obtener la extensión del archivo seleccionado.
        if (Extension2.equalsIgnoreCase("xd")) {
            Abrir(Extension);
            texto1.setText("");
        } else {
            JOptionPane.showMessageDialog(Dialogo_Actual, "El Tipo de formato no es reconocible para este tipo de diagrama");
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void pegar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegar2ActionPerformed
        // TODO add your handling code here:
        for (JLabel Label1 : ArrayCopiar) {
            if (Label1 == null) {
                JOptionPane.showMessageDialog(canvas1, "No se encuentra ningun elemento en memoria, seleccione un objeto para Copiar");
            } else {

                if (Label1 instanceof Rombo) {
                    Rombo P = new Rombo();
                    P.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof documento) {
                    documento P = new documento();
                    P.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof Rectangulo2) {
                    Rectangulo2 P = new Rectangulo2();
                    P.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof if_no) {
                    if_no P = new if_no();
                    P.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof if_fin) {
                    if_fin P = new if_fin();
                    P.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof Rectangulo) {
                    Rectangulo P = new Rectangulo();
                    P.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof fin_bucle) {
                    fin_bucle P = new fin_bucle();
                    P.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof Circulo) {
                    Circulo P = new Circulo();
                    P.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);

                } else if (Label1 instanceof paralelogramo) {
                    paralelogramo P = new paralelogramo();
                    P.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                }
                canvas1.repaint();
            }
        }
    }//GEN-LAST:event_pegar2ActionPerformed

    private void copiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar1ActionPerformed
        // TODO add your handling code here:
        //ArrayCopiar = new ArrayList();
        ArrayCopiar.add(Label1);
        JOptionPane.showMessageDialog(this.canvas1, "COPIADO");
        System.out.println(ArrayCopiar.toString());
    }//GEN-LAST:event_copiar1ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        for (JLabel Label1 : ArrayCopiar) {
            if (Label1 == null) {
                JOptionPane.showMessageDialog(canvas1, "No se encuentra ningun elemento en memoria, seleccione un objeto para Copiar");
            } else {
                Figura U = new Figura();
                if (Label1 instanceof paralelogramo) {

                    paralelogramo P = new paralelogramo();
                    U.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof documento) {
                    documento P = new documento();
                    U.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof Rombo) {
                    Rombo P = new Rombo();
                    U.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof Circulo) {
                   
                    Circulo P = new Circulo();
                    System.out.println(P.toString());
                    U.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof Rectangulo) {
                    Rectangulo P = new Rectangulo();
                    U.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof if_no) {
                    if_no P = new if_no();
                    U.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else if (Label1 instanceof Rectangulo2) {
                    Rectangulo2 P = new Rectangulo2();
                    U.Copiar(P, Label1);
                    Drag(P, 1);
                    canvas1.add(P);
                } else {

                    Figura P = new Figura();
                    U.Copiar(P, Label1);

                    Drag(P, 1);
                    this.canvas1.add(P);

                }
                canvas1.repaint();

            }
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void copiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar2ActionPerformed
        // TODO add your handling code here:
        ArrayCopiar.add(Label1);
        JOptionPane.showMessageDialog(this.canvas1, "COPIADO");
    }//GEN-LAST:event_copiar2ActionPerformed

    private String codigo2(JLabel x, String codigo) {
        String z = "";
        if (x instanceof paralelogramo) {
            paralelogramo P = ((paralelogramo) x);
            z = P.code();
        } else if (x instanceof Rectangulo) {
            Rectangulo P = ((Rectangulo) x);
            z = P.code();
        } else if (x instanceof Rectangulo2) {
            Rectangulo2 P = ((Rectangulo2) x);
            z = P.code();
        } else if (x instanceof documento) {
            documento P = ((documento) x);
            z = P.code();

        } else if (x instanceof Rombo) {

        }
        return z;
    }
    // <editor-fold defaultstate="collapsed" desc="Codigo Figuras">   

    private boolean estaDentroDelOvalo(int x, int y) {
        int centroX = 75;  // Posición x del centro del óvalo
        int centroY = 145; // Posición y del centro del óvalo
        int radioX = 25;   // Radio en la dirección x
        int radioY = 25;   // Radio en la dirección y
        return ((x - centroX) * (x - centroX)) / (radioX * radioX) + ((y - centroY) * (y - centroY)) / (radioY * radioY) <= 1;
    }

    private boolean estaDentroDelRombo(int x, int y) {
        int[] vx2 = {75, 100, 125, 100}; // Coordenadas x del rombo
        int[] vy2 = {200, 175, 200, 225}; // Coordenadas y del rombo
        Polygon rombo = new Polygon(vx2, vy2, 4);
        return rombo.contains(x, y);
    }

    private boolean mapaOk(ArrayList<Figura> x) {
        int cont = 0;
        for (Figura figura : x) {
            if (figura instanceof Circulo) {
                cont++;
            }
        }
        if (cont >= 2) {
            return false;
        } else {
            return true;
        }
    } // </editor-fold> 

    public void Drag(JLabel label, int n) {
        //se agrega un ml para escuchar los eventos del mouse que se den en el label
        Label1 = label;

        label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {

            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Label1 = label;

                if ((label.getLocation().x + evt.getX() - label.getWidth() / 2) >= 0
                        && (label.getLocation().x + evt.getX() - label.getWidth() / 2) <= 900) {
                    label.setLocation(label.getLocation().x + evt.getX() - label.getWidth() / 2,
                            label.getLocation().y + evt.getY() - label.getHeight() / 2);

                }
            }
        });
        label.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                Label1 = label;

                if (evt.isMetaDown()) {
                    Label1 = label;
                    // if (Label1 instanceof Circulo || Label1 instanceof Rectangulo || Label1 instanceof Rombo||Label1 instanceof paralelogramo||Label1 instanceof linea1||Label1 instanceof linea2||Label1 instanceof Rectangulo2||Label1 instanceof documento) {
                    pm_Figuras.show(evt.getComponent(), evt.getX(), evt.getY());
                    //} 

                }
            }

            public void mouseEntered(MouseEvent arg0) {

            }

            public void mouseExited(MouseEvent arg0) {

            }

            public void mousePressed(MouseEvent arg0) {

            }

            public void mouseReleased(MouseEvent arg0) {

            }
        });
        this.canvas1.add(label);
        if (n != 0) {
            Label1 = label;
        }
        canvas1.repaint();
    }

    public void DragPanel(CustomPanel arbol, int n) {

        arbol.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent evt) {
                arbol_seleccionado = arbol;

                if (evt.isMetaDown()) {
                    pm_UML.show(evt.getComponent(), evt.getX(), evt.getY());
                }

            }

            public void mouseEntered(MouseEvent arg0) {
                arbol_seleccionado = arbol;
            }

            public void mouseExited(MouseEvent arg0) {
                arbol_seleccionado = arbol;
            }

            public void mousePressed(MouseEvent arg0) {
                arbol_seleccionado = arbol;
            }

            public void mouseReleased(MouseEvent arg0) {
                arbol_seleccionado = arbol;
            }
        });
        arbol.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                arbol_seleccionado = arbol;
                if ((arbol.getLocation().x + evt.getX() - arbol.getWidth() / 2) >= 0
                        && (arbol.getLocation().x + evt.getX() - arbol.getWidth() / 2) <= 800) {
                    arbol.setLocation(arbol.getLocation().x + evt.getX() - arbol.getWidth() / 2,
                            arbol.getLocation().y + evt.getY() - arbol.getHeight() / 2);

                }// para que no se salga del rango
            }
        });
        this.canvas_UML.add(arbol);
        if (n != 0) {
            arbol_seleccionado = arbol;
        }
        canvas_UML.repaint();
    }

    public boolean verifyHerencia(String x) {
        int cont = 0;
        for (CustomPanel clase : clases) {
            String nombreclase = clase.getLabel();
            if (nombreclase.equalsIgnoreCase(x)) {
                cont++;
            }

        }
        if (cont <= 0) {
            return false;
        } else {
            return true;
        }

    }

    public boolean verifyHerencia2(String x) {
        int cont = 0;
        for (CustomPanel clase : clases) {
            String nombreclase = clase.getLabel();
            if (nombreclase.equalsIgnoreCase(x)) {
                cont++;
            }

        }
        if (cont <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public int construirArbolRecursivo(DefaultMutableTreeNode nodoPadre, ArrayList<Figura> figuras, int startIndex) {
        DefaultMutableTreeNode nodoActual = nodoPadre;

        for (int i = startIndex; i < figuras.size(); i++) {
            Object figura = figuras.get(i);

            if (figura instanceof Rombo) {
                DefaultMutableTreeNode romboNode = new DefaultMutableTreeNode(figura);
                nodoActual.add(romboNode);

                i = construirArbolRecursivo(romboNode, figuras, i + 1); // Llamada recursiva para procesar el rombo anidado
            } else if (figura instanceof if_fin) {
                return i; // Terminar la construcción de este rombo y devolver el nuevo índice
            } else {
                DefaultMutableTreeNode labelNode = new DefaultMutableTreeNode(figura);
                nodoActual.add(labelNode);
            }
        }

        return figuras.size() - 1;
    }

    public JTree construirArbol(ArrayList<Figura> figuras) {
        JTree x = new JTree();
        DefaultTreeModel tm = (DefaultTreeModel) x.getModel();
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Inicio");
        DefaultMutableTreeNode nodoActual = raiz;

        for (int i = 0; i < figuras.size(); i++) {
            if (i < figuras.size() - 1) {
                if (figuras.get(i) instanceof Rombo) {
                    Rombo P = (Rombo) figuras.get(i);
                    //  i += Sentencia(P, i);
                    DefaultMutableTreeNode romboNode = new DefaultMutableTreeNode(figuras.get(i));
                    nodoActual.add(romboNode);
                    // Aquí se agregarán elementos al romboNode según las reglas
                    while (i < figuras.size() - 1 && !(figuras.get(i + 1) instanceof if_no) && !(figuras.get(i + 1) instanceof if_fin)) {
                        i++;
                        DefaultMutableTreeNode labelNode = new DefaultMutableTreeNode(figuras.get(i));
                        romboNode.add(labelNode);
                    }
                } else if (figuras.get(i) instanceof Rectangulo2) {
                    Rectangulo2 P = (Rectangulo2) figuras.get(i);
                    P.getProcesos().removeAll(P.getProcesos());
                    //i = Bucle(P, i);
                } else {
                    // Si no es Rombo, Rectangulo2 ni if_no, crear un nuevo romboNode
                    DefaultMutableTreeNode romboNode = new DefaultMutableTreeNode(figuras.get(i));
                    nodoActual.add(romboNode);
                }
            }

            tm.setRoot(raiz);
            x.setModel(tm);
            System.out.println(i);
        }
        return x;

    }

    public JTree construirArbol2(ArrayList<Figura> elements) {
        JTree tree;
        DefaultMutableTreeNode rootNode;
        rootNode = new DefaultMutableTreeNode("Root");
        tree = new JTree(rootNode);
        assignIndex(figuras);
        for (int i = 0; i < elements.size(); i++) {
            Figura element = elements.get(i);
            System.out.println("i1: " + i);
            System.out.println(element.getCode());
            if (element instanceof Rombo) {
                DefaultMutableTreeNode hijo = new DefaultMutableTreeNode();
                hijo = construirArbol3(elements, i, hijo, element);
                hijo.setUserObject(element);
                i += returnIndice(i, elements, element) - 2;
                rootNode.add(hijo);
                System.out.println("1");
            } else if (element instanceof Rectangulo2) {
                DefaultMutableTreeNode hijo = new DefaultMutableTreeNode();
                hijo = construirArbol5(elements, i, hijo, element);
                hijo.setUserObject(element);
                i += returnIndice3(i, elements, element) - 2;
                rootNode.add(hijo);
                System.out.println("2");
            } else if (element instanceof paralelogramo) {
                rootNode.add(new DefaultMutableTreeNode(element));
                System.out.println("3");
            } else if (element instanceof documento) {
                rootNode.add(new DefaultMutableTreeNode(element));
                System.out.println("4");
            } else if (element instanceof if_no) {
                DefaultMutableTreeNode hijo = new DefaultMutableTreeNode();
                hijo = construirArbol4(elements, i, hijo, element);
                hijo.setUserObject(element);
                i += returnIndice2(i, elements, element) - 2;
                rootNode.add(hijo);
                System.out.println("5");
                cont_ifno--;
            } else if (element instanceof Rectangulo) {
                System.out.println("6");
                rootNode.add(new DefaultMutableTreeNode(element));
            }
            System.out.println("i: " + i);
            System.out.println(element.getCode());
        }
        return tree;
    }

    private CustomPanel returnpadre(String nombre) {
        CustomPanel y = new CustomPanel();
        for (CustomPanel clase : clases) {
            if (clase.getLabel().equalsIgnoreCase(nombre)) {
                y = clase;
                return y;
            }
        }
        return y;
    }

    public DefaultMutableTreeNode construirArbol3(ArrayList<Figura> elements, int i, DefaultMutableTreeNode hijo, Figura element) {
        for (int j = i + 1; j < elements.size() - 1; j++) {
            Figura element2 = elements.get(j);
            if (element2 instanceof if_no) {
                if (((Rombo) element).getIndex() != ((if_no) element2).getIndex() && cont_ifno > 0) {
                    DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode();
                    hijo2 = construirArbol3(figuras, j, hijo2, element2);
                    j += returnIndice2(j, elements, element2);
                    hijo2.setUserObject(element2);
                    hijo.add(hijo2);
                } else if (((Rombo) element).getIndex() == ((if_no) element2).getIndex()) {
                    break;
                }
            } else if (element2 instanceof if_fin) {
                if (((Rombo) element).getIndex() != ((if_fin) element2).getIndex() && cont_iffin > 0) {
                    continue;
                } else if (((Rombo) element).getIndex() == ((if_fin) element2).getIndex()) {
                    break;
                }
            } else if (element2 instanceof Rombo) {
                DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode();
                hijo2 = construirArbol3(figuras, j, hijo2, element2);
                j = returnIndice(j, elements, element2);
                hijo2.setUserObject(element2);
                hijo.add(hijo2);
            } else if (element2 instanceof Rectangulo2) {
                DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode();
                hijo2 = construirArbol5(figuras, j, hijo2, element2);
                j = returnIndice3(j, elements, element2);
                hijo2.setUserObject(element2);
                hijo.add(hijo2);
            } else {
                hijo.add(new DefaultMutableTreeNode(element2));
            }
            System.out.println("j:" + j);
        }
        return hijo;
    }

    public DefaultMutableTreeNode construirArbol4(ArrayList<Figura> elements, int i, DefaultMutableTreeNode hijo, Figura element) {
        for (int j = i + 1; j < elements.size() - 1; j++) {
            Figura element2 = elements.get(j);
            if (element2 instanceof Rombo) {
                if (((if_no) element).getIndex() != ((Rombo) element2).getIndex() && cont_rombo > 0) {
                    DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode();
                    hijo2 = construirArbol3(elements, i, hijo, element2);
                    hijo2.setUserObject(element2);
                    j += returnIndice(i, elements, element2) - 2;
                } else if (((if_no) element).getIndex() == ((Rombo) element2).getIndex()) {
                    break;
                }
            } else if (element2 instanceof if_fin) {
                if (((if_no) element).getIndex() != ((if_fin) element2).getIndex() && cont_iffin > 0) {
                    continue;
                } else if (((if_no) element).getIndex() == ((if_fin) element2).getIndex()) {
                    break;
                }
            } else if (element2 instanceof if_no) {
                DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode();
                hijo2 = construirArbol4(figuras, j, hijo2, element2);
                j += returnIndice2(j, elements, element2);
                hijo2.setUserObject(element2);
                hijo.add(hijo2);
            } else if (element2 instanceof Rectangulo2) {
                DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode();
                hijo2 = construirArbol5(figuras, j, hijo2, element2);
                j = returnIndice3(j, elements, element2);
                hijo2.setUserObject(element2);
                hijo.add(hijo2);
            } else {
                hijo.add(new DefaultMutableTreeNode(element2));
            }
        }
        return hijo;
    }

    public DefaultMutableTreeNode construirArbol5(ArrayList<Figura> elements, int i, DefaultMutableTreeNode hijo, Figura element) {
        for (int j = i + 1; j < elements.size() - 1; j++) {
            Figura element2 = elements.get(j);
            if (element2 instanceof Rombo) {

                DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode();
                hijo2 = construirArbol3(elements, i, hijo, element2);
                hijo2.setUserObject(element2);
                j += returnIndice(i, elements, element2) - 2;

            } else if (element2 instanceof if_no) {
                DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode();
                hijo2 = construirArbol4(figuras, j, hijo2, element2);
                j += returnIndice2(j, elements, element2);
                hijo2.setUserObject(element2);
                hijo.add(hijo2);
            } else if (element2 instanceof Rectangulo2) {
                if (((Rectangulo2) element).getIndex() != ((fin_bucle) element2).getIndex() && cont_finbucle > 0) {
                    DefaultMutableTreeNode hijo2 = new DefaultMutableTreeNode();
                    hijo2 = construirArbol5(elements, i, hijo, element2);
                    hijo2.setUserObject(element2);
                    j += returnIndice3(i, elements, element2) - 2;
                } else if (((Rectangulo2) element).getIndex() == ((fin_bucle) element2).getIndex()) {
                    break;
                }
            } else if (element2 instanceof fin_bucle) {
                if (((Rectangulo2) element).getIndex() != ((fin_bucle) element2).getIndex() && cont_finbucle > 0) {
                    continue;
                } else if (((if_no) element).getIndex() == ((if_fin) element2).getIndex()) {
                    break;
                }
            } else {
                hijo.add(new DefaultMutableTreeNode(element2));
            }
        }
        return hijo;
    }

    public void Guardar(String Nombre, String Extension, String Tipo) {
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(Tipo, Extension);
        jfc.addChoosableFileFilter(filtro);
        jfc.setSelectedFile(new File(Nombre + "." + Extension));
        int seleccion = jfc.showSaveDialog(this.Dialogo_Actual);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            System.out.println(jfc.getSelectedFile().getPath());
            admin_DFlujo ap = new admin_DFlujo(jfc.getSelectedFile().getPath());
            ap.CargarArchivo();
            ArrayList X = new ArrayList();//AGREGUE ESTA LINEA DE MAS.
            ap.setListaelementos(X);
            Object Obejtos[] = panelActual.getComponents();
            for (int i = 0; i < Obejtos.length; i++) {
                ap.AgregarUML((JLabel) Obejtos[i]);
                System.out.println(Obejtos[i]);
            }
            try {
                ap.escribirArchivo();
            } catch (IOException ex) {
                Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this.Dialogo_Actual, "Se ha guardado el Diagrama");
            System.out.println(ap.getListaelementos());
        }
    }

    public void Abrir(String Path) {
        panelActual.removeAll();
        panelActual.repaint();
        //ABRIMOS EL ArCHIVO
        admin_DFlujo ap = new admin_DFlujo(Path);
        ap.CargarArchivo();
        for (int i = 0; i < ap.getListaelementos().size(); i++) {
            JLabel P = ((JLabel) ap.getListaelementos().get(i));
            this.panelActual.add(P);
            panelActual.repaint();
            Drag(P, 0);
        }//Fin del For
        panelActual.repaint();
        JOptionPane.showMessageDialog(this.Dialogo_Actual, "Se han cargado los elementos en el panel");
    }

    public void GenerarPDF(String Codigo, JPanel Panel, int Bandera) {
        int seleccion = 100;
        String Ruta = "";
        if (Bandera == 1) {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Diagramas", "xd");
            seleccion = jfc.showSaveDialog(this.Dialogo_Actual);
            Ruta = jfc.getSelectedFile().getPath();
        } else if (Bandera == 2) {
            Ruta = ".\\Imprimir\\" + Nombre_Imprimir;
        }
        try {
            Dimension d = Panel.getSize();
            BufferedImage image = ScreenImage.createImage(Panel);
            Graphics2D g2d = image.createGraphics();
            Panel.print(g2d);
            g2d.dispose();
            try {
                ImageIO.write(image, "jpg", new File(Ruta + "1" + ".jpg"));
            } catch (IOException ex) {
                Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image imagen = Image.getInstance(Ruta + "1" + ".jpg");
            imagen.scaleAbsolute(400, 400);
            imagen.setAlignment(Element.ALIGN_CENTER);
//            CREAR EL DOCUMENTO SENCILLO
            FileOutputStream archivo = new FileOutputStream(Ruta + ".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            doc.add(new Paragraph("CODIGO GENERADO: "));
            doc.add(new Paragraph(Codigo));
            doc.add(imagen);

            doc.close();
            if (Bandera == 1) {
                JOptionPane.showMessageDialog(Dialogo_Actual, "PDF creado");
            }
        } catch (Exception e) {

        }
    }

    public void CrearIMG(JPanel panel, String Extension) {
        JFileChooser jfc = new JFileChooser();
        int seleccion = jfc.showSaveDialog(this.Dialogo_Actual);

        String Ruta = jfc.getSelectedFile().getPath() + "." + Extension;
        Dimension d = panel.getSize();
        BufferedImage image = ScreenImage.createImage(panel);
        Graphics2D g2d = image.createGraphics();
        panel.print(g2d);
        g2d.dispose();
        try {
            ImageIO.write(image, Extension, new File(Ruta));
        } catch (IOException ex) {
            Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(Dialogo_Actual, "Imagen Creada Exsitosamente");
    }

    public void GuardarD(String Nombre, String Extension, String Tipo) {
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter(Tipo, Extension);
            jfc.addChoosableFileFilter(filtro);
            jfc.setSelectedFile(new File(Nombre + "." + Extension));
            int seleccion = jfc.showSaveDialog(this.Dialogo_Actual);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                System.out.println(jfc.getSelectedFile().getPath());
                admin_UML ap = new admin_UML(jfc.getSelectedFile().getPath());
                ap.CargarArchivo();
                Object Obejtos[] = panelActual.getComponents();

                for (int i = 0; i < Obejtos.length; i++) {
                    ap.AgregarElemento((CustomPanel) Obejtos[i]);
                    System.out.println(Obejtos[i]);
                }
                try {
                    ap.EscribirArchivo();
                } catch (IOException ex) {
                    Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this.Dialogo_Actual, "Se han Guardado las Clases");
            }
        } catch (Exception e) {

        }
    }

    public void AbrirD(String Path) {
        //LIMPIAMOS LAS LISTAS, PANEL Y EL ARBOL
        panelActual.removeAll();
        panelActual.repaint();

        admin_UML ap = new admin_UML(Path);
        ap.CargarArchivo();

        for (int i = 0; i < ap.getElementos().size(); i++) {
            CustomPanel P = ((CustomPanel) ap.getElementos().get(i));
            this.panelActual.add(P);
            panelActual.repaint();
            DragPanel(P, i);
        }//Fin del For
        panelActual.repaint();
        JOptionPane.showMessageDialog(this.Dialogo_Actual, "Se han cargado los elementos en el panel");

    }

    public void assignIndex(ArrayList<Figura> figuras) {
        int cont1 = cont_ifno;
        int cont2 = cont_iffin;
        int cont3 = cont_finbucle;
        for (Figura figura : figuras) {
            if (figura instanceof if_no) {
                ((if_no) figura).setIndex(cont1);
                cont1--;
            }
            if (figura instanceof if_fin) {
                ((if_fin) figura).setIndex(cont2);
                cont2--;
            }
            if (figura instanceof fin_bucle) {
                ((fin_bucle) figura).setIndex(cont3);
                cont3--;
            }
        }
    }

    public int returnIndice(int i, ArrayList<Figura> elements, Figura element) {
        for (int j = i + 1; j < elements.size() - 1; j++) {
            Figura element2 = elements.get(j);
            if (element2 instanceof if_no) {
                if (((Rombo) element).getIndex() != ((if_no) element2).getIndex() && cont_ifno > 0) {
                    i++;
                } else if (((Rombo) element).getIndex() == ((if_no) element2).getIndex()) {
                    break;
                }
            } else if (element2 instanceof if_fin) {
                if (((Rombo) element).getIndex() != ((if_fin) element2).getIndex() && cont_iffin > 0) {
                    i++;
                } else if (((Rombo) element).getIndex() == ((if_fin) element2).getIndex()) {
                    break;
                }

            } else {
                i++;
            }
        }
        return i;
    }

    public int returnIndice2(int i, ArrayList<Figura> elements, Figura element) {
        for (int j = i + 1; j < elements.size() - 1; j++) {
            Figura element2 = elements.get(j);
            if (element2 instanceof if_fin) {
                if (((if_no) element).getIndex() != ((if_fin) element2).getIndex() && cont_iffin > 0) {
                    i++;
                } else if (((if_no) element).getIndex() == ((if_fin) element2).getIndex()) {
                    break;
                }
            } else {
                i++;
            }
        }
        return i;
    }

    public int returnIndice3(int i, ArrayList<Figura> elements, Figura element) {
        for (int j = i + 1; j < elements.size() - 1; j++) {
            Figura element2 = elements.get(j);
            if (element2 instanceof fin_bucle) {
                if (((Rectangulo2) element).getIndex() != ((fin_bucle) element2).getIndex() && cont_finbucle > 0) {
                    i++;
                } else if (((Rectangulo2) element).getIndex() == ((fin_bucle) element2).getIndex()) {
                    break;
                }
            } else {
                i++;
            }
        }
        return i;
    }

    public String imprimirNodoDecision(String tab, DefaultMutableTreeNode nodo, String code) {
        String Clases = "";
        for (int i = 0; i < nodo.getChildCount(); i++) {
            Object v1 = nodo.getChildAt(i);
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Figura) {
                String tab2 = tab + "\t";
                // code += tab + ((Figura) nodo_seleccionado.getUserObject()).code() + "\n";
                if (nodo_seleccionado.getChildCount() > 0) {
                    for (int j = 0; j < nodo_seleccionado.getChildCount(); j++) {
                        DefaultMutableTreeNode hijo = (DefaultMutableTreeNode) nodo_seleccionado.getChildAt(j);
                        code += imprimirNodoDecision(tab2, hijo, "") + "\n";
                    }

                }
            }
        }
        return Clases;
    }

    public static String tabulateString(String input) {
        StringBuilder tabulated = new StringBuilder();

        String[] lines = input.split("\n"); // Dividir el String en líneas

        for (String line : lines) {
            tabulated.append("\t"); // Agregar un tabulador al inicio de cada línea
            tabulated.append(line);  // Agregar el contenido de la línea
            tabulated.append("\n"); // Agregar un salto de línea al final de cada línea
        }

        return tabulated.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainp().setVisible(true);
            }
        });
    }
    DefaultMutableTreeNode nodo_seleccionado;
    ArrayList<Figura> figuras = new ArrayList();
    JLabel Label1 = null;
    int cont_circulo = 0;
    int cont_rectangulo = 0;
    int cont_rectangulo2 = 0;
    int cont_documneto = 0;
    int cont_rombo = 0;
    int cont_paralelo = 0;
    int cont_linea1 = 0;
    int cont_linea2 = 0;
    int variable_int = 0;
    float variable_float = 0;
    int cont_ifno = 0;
    int cont_iffin = 0;
    int cont_finbucle = 0;
    int cont_while = 0;
    boolean variable_boolean = true;
    int cont_figuras = 0;
    String variable_string = "";
    ArrayList<v_Int> variables_int = new ArrayList();
    ArrayList<v_Float> variables_float = new ArrayList();
    ArrayList<v_Boolean> variables_boolean = new ArrayList();
    ArrayList<v_String> variables_string = new ArrayList();
    ArrayList<Variables> variables = new ArrayList();
    String code = "";
    Rectangulo r;
    int x;
    int y;
    CustomPanel arbol_seleccionado;
    Style estilo;
    ArrayList<Font> Fuentes = new ArrayList();
    ArrayList<Rombo> ifs = new ArrayList();
    ArrayList<CustomPanel> clases = new ArrayList();
    int cont_framevariables = 0;
    ArrayList<Metodo> metodos = new ArrayList();
    ArrayList<String> atributos = new ArrayList();
    JPanel panelActual;
    JFrame Dialogo_Actual;
    String Nombre_Imprimir;
    ArrayList<JLabel> ArrayCopiar = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ab_panel1;
    private javax.swing.JTextField atributo;
    private java.awt.Panel barratareas1;
    private java.awt.Panel barratareas2;
    private javax.swing.ButtonGroup bg_ifs;
    private javax.swing.JButton bt_claseAbstracta;
    private javax.swing.JButton bt_claseHerencia;
    private javax.swing.JToggleButton bt_clasesimple;
    private javax.swing.JButton bt_decision;
    private javax.swing.JButton bt_generarcodigo1;
    private javax.swing.JRadioButton bucle_for;
    private javax.swing.JRadioButton bucle_while;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem cambiarColor;
    private javax.swing.JMenuItem cambiarColorFont;
    private javax.swing.JPanel canvas1;
    private javax.swing.JPanel canvas_UML;
    private javax.swing.JComboBox<String> cb_Font2;
    private javax.swing.JComboBox<String> cb_evaluacion;
    private javax.swing.JComboBox<String> cb_fonts;
    private javax.swing.JComboBox<String> cb_fontsize;
    private javax.swing.JComboBox<String> cb_fotnsize2;
    private javax.swing.JComboBox<String> cb_procesos;
    private javax.swing.JComboBox<String> cb_tiposvariables;
    private javax.swing.JComboBox<String> cb_tipovariable_decisiones;
    private javax.swing.JComboBox<String> cb_variable1;
    private javax.swing.JComboBox<String> cb_variable1_decisiones;
    private javax.swing.JComboBox<String> cb_variable2;
    private javax.swing.JComboBox<String> cb_variable2_decisiones;
    private javax.swing.JComboBox<String> cb_variable3;
    private javax.swing.JMenuItem copiar1;
    private javax.swing.JMenuItem copiar2;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JRadioButton fin_bucle;
    private javax.swing.JDialog frame_Atributos;
    private javax.swing.JDialog frame_Metodos;
    private javax.swing.JDialog frame_bucles;
    private javax.swing.JDialog frame_decisiones;
    private javax.swing.JFrame frame_dflujo;
    private javax.swing.JDialog frame_proceso;
    private javax.swing.JFrame frame_uml;
    private javax.swing.JDialog frame_variables;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTree jTree1;
    private javax.swing.JList<String> jl_Float;
    private javax.swing.JList<String> jl_Int;
    private javax.swing.JList<String> jl_Strings;
    private javax.swing.JList<String> jl_boolean;
    private javax.swing.JLabel jl_comienzo;
    private javax.swing.JLabel jl_documento;
    private javax.swing.JLabel jl_if;
    private javax.swing.JLabel jl_linea1;
    private javax.swing.JLabel jl_linea2;
    private javax.swing.JLabel jl_paralelogramo;
    private javax.swing.JLabel jl_proceso;
    private javax.swing.JLabel jl_proceso2;
    private javax.swing.JButton limpiar1;
    private javax.swing.JTextField metodo_name;
    private javax.swing.JTextField metodos_atributos;
    private javax.swing.JTextField nombre_variable;
    private javax.swing.JPanel paleta1;
    private javax.swing.JMenuItem pegar1;
    private javax.swing.JMenuItem pegar2;
    private javax.swing.JPopupMenu pm_Figuras;
    private javax.swing.JPopupMenu pm_UML;
    private javax.swing.JMenuItem pm_colorArbol;
    private javax.swing.JMenuItem pm_colortexto;
    private javax.swing.JMenuItem pm_eliminarArbol;
    private javax.swing.JPopupMenu pp_pegarclase;
    private javax.swing.JPopupMenu pp_pegarflujo;
    private javax.swing.JRadioButton rb_if;
    private javax.swing.JRadioButton rb_if2;
    private javax.swing.JRadioButton rb_if3;
    private javax.swing.JTextField ta_operador_bucle;
    private javax.swing.JTextField ta_variable3_bucle;
    private javax.swing.JTextArea text2;
    private javax.swing.JTextArea texto1;
    private javax.swing.JTextField tf_v1;
    private javax.swing.JTextField tf_v2;
    private javax.swing.JTextField valor_variable;
    // End of variables declaration//GEN-END:variables
}
/*
int Aumentar = 0;
            boolean Bandera = false;

            if (i + 1 <= figuras.size() - 1) {
                if (figuras.get(i + 1) instanceof Rectangulo2) {
                    P.setSi((Rectangulo2) figuras.get(i + 1));
                    //   i = Bucle((Rectangulo2) figuras[i + 1], figuras, i + 1);
                    DefaultMutableTreeNode c = new DefaultMutableTreeNode(figuras.get(i + 1));
                    raiz.add(c);
                    Bandera = true;
                } else {
                    P.setSi((Figura) figuras.get(i + 1));
                    DefaultMutableTreeNode c = new DefaultMutableTreeNode(figuras.get(i + 1));
                    raiz.add(c);
                    Aumentar++;
                }
            }

            if (i + 1 <= figuras.size() - 1) {

                if (figuras.get(i + 1) instanceof if_fin) {
                    // No hacer nada, continuar con el siguiente elemento

                } else {
                    // Verificar si Bandera es true (indicando un SubProceso anterior)
                    if (Bandera) {
                        P.setNo((JLabel) figuras.get(i + 1));
                    } else {
                        // Verificar si el siguiente elemento después del actual es Fin_If
                        if (figuras.get(i + 2) instanceof if_fin) {
                            // No hacer nada, continuar con el siguiente elemento
                        } else {
                            P.setNo((JLabel) figuras.get(i + 2));
                        }
                        Aumentar++;
                    }
                }
 */
