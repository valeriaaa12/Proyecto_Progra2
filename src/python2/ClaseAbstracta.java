/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Valeria Romero
 */
public class ClaseAbstracta extends CustomPanel implements Serializable{

    public ClaseAbstracta() {
    }

    public ClaseAbstracta(String Label, ArrayList<Metodo> metodos, ArrayList<String> variables) {
        setLayout(new GridBagLayout());

        label = new JLabel(Label);
        l2 = new JLabel("Atributos");
        l3 = new JLabel("Metodos");

        this.metodos = metodos;
        this.variables = variables;
        String y = "";
        for (String variable : variables) {
            y += variable + "\n";
        }
        textPane1 = new JTextArea();
        textPane1.setText(y);
        JScrollPane scrollPane1 = new JScrollPane(textPane1);
        String x = "";
        for (Metodo metodo : metodos) {
            x += "def " + metodo.getNombre();
            x += "(";
            x += metodo.getAtributos();
            x += "):";
            x += "\n";
            x += "\tpass";
            x += "\n";
        }
        textPane2 = new JTextArea();
        textPane2.setText(x);
        JScrollPane scrollPane2 = new JScrollPane(textPane2);

        // Configurar las restricciones para el JLabel
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.gridx = 0;
        labelConstraints.gridy = 0;
        labelConstraints.anchor = GridBagConstraints.CENTER;
        labelConstraints.insets = new Insets(5, 5, 5, 5); // Márgenes

        // Configurar las restricciones para l2
        GridBagConstraints l2Constraints = new GridBagConstraints();
        l2Constraints.gridx = 0;
        l2Constraints.gridy = 1;
        l2Constraints.anchor = GridBagConstraints.CENTER;
        l2Constraints.insets = new Insets(5, 5, 5, 5); // Márgenes

        // Configurar las restricciones para el JScrollPane 1
        GridBagConstraints scrollPane1Constraints = new GridBagConstraints();
        scrollPane1Constraints.gridx = 0;
        scrollPane1Constraints.gridy = 2;
        scrollPane1Constraints.fill = GridBagConstraints.BOTH;
        scrollPane1Constraints.weightx = 1.0;
        scrollPane1Constraints.weighty = 0.25; // Reducir el peso vertical para dejar espacio para l3
        scrollPane1Constraints.insets = new Insets(5, 5, 5, 5); // Márgenes

        // Configurar las restricciones para l3
        GridBagConstraints l3Constraints = new GridBagConstraints();
        l3Constraints.gridx = 0;
        l3Constraints.gridy = 3; // Cambiar el valor del gridy para que l3 esté en medio
        l3Constraints.anchor = GridBagConstraints.CENTER;
        l3Constraints.insets = new Insets(5, 5, 5, 5); // Márgenes

        // Configurar las restricciones para el JScrollPane 2
        GridBagConstraints scrollPane2Constraints = new GridBagConstraints();
        scrollPane2Constraints.gridx = 0;
        scrollPane2Constraints.gridy = 4; // Cambiar el valor del gridy para que esté debajo de l3
        scrollPane2Constraints.fill = GridBagConstraints.BOTH;
        scrollPane2Constraints.weightx = 1.0;
        scrollPane2Constraints.weighty = 0.25; // Reducir el peso vertical para dejar espacio para l3
        scrollPane2Constraints.insets = new Insets(5, 5, 5, 5); // Márgenes

        // Agregar los componentes al panel con las restricciones
        add(label, labelConstraints);
        add(l2, l2Constraints);
        add(scrollPane1, scrollPane1Constraints);
        add(l3, l3Constraints);
        add(scrollPane2, scrollPane2Constraints);
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    public ArrayList<String> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<String> variables) {
        this.variables = variables;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodo> metodos) {
        this.metodos = metodos;
    }

    public JTextArea getTextPane1() {
        return textPane1;
    }

    public void setTextPane1(JTextArea textPane1) {
        this.textPane1 = textPane1;
    }

    public JTextArea getTextPane2() {
        return textPane2;
    }

    public void setTextPane2(JTextArea textPane2) {
        this.textPane2 = textPane2;
    }

    public JLabel getL2() {
        return l2;
    }

    public void setL2(JLabel l2) {
        this.l2 = l2;
    }

    public JLabel getL3() {
        return l3;
    }

    public void setL3(JLabel l3) {
        this.l3 = l3;
    }

    public String code() {
        String codigo = "";

        codigo += "class ";
        codigo += Label;
        codigo += "(";
        codigo += "ABC";
        codigo += "):";
        codigo += "\n";
        codigo += "\t";
        codigo += parseoMetodos();
        return codigo;
    }

    public String parseoMetodos() {
        String x = textPane2.getText();
        String[] lineas = x.split("\n");
        StringBuilder resultados = new StringBuilder();
        String textoParseado = "";
        for (String linea : lineas) {
            String z = "def";
            String[] palabras = linea.split("\\)");
            for (String palabra : palabras) {
                if (!palabra.trim().isEmpty()) {
                    resultados.append(palabra.trim()).append(") "); // Agregar ")" y espacio
                    z += resultados.toString();
                    z += "\n\tpass";
                }
            }

        }

        return textoParseado;

    }

    public String codigoo22() {
        String y = "";
        String z = "";
        for (String variable : variables) {
            int i = variables.indexOf(variable);
            if (i < variables.size()) {
                y += variable + ",";
            } else {
                y += variable;
            }

        }
        for (String variable : variables) {
            z += "\n";
            z += "\tself." + variable + " = " + variable;
        }

        String x = "";
        for (Metodo metodo : metodos) {
            x += "@abstractmethod\n";
            x += "  def " + metodo.getNombre();
            x += "(self,";
            x += metodo.getAtributos();
            x += "):";
            x += "\n";
            x += "\tpass";
            x += "\n";
        }
        String codigo = "from abc import ABC, abstractmethod";
        codigo += "\n";
        codigo = "class " + Label;
        codigo += "(";
        codigo += "ABC";
        codigo += "):";
        codigo += "\n";
        codigo += "  def _init_ (self," + y + "):";
        codigo += z;
        codigo += "\n";
        codigo += x;
        return codigo;
    }

}
