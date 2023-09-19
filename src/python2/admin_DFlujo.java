/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Valeria Romero
 */
public class admin_DFlujo {
     private ArrayList<Object> listaelementos = new ArrayList();
    private File archivo = null;

    public admin_DFlujo(String path) {
        archivo = new File(path);
    }

    public void AgregarUML(JLabel UML) {
        listaelementos.add(UML);
    }

    public ArrayList<Object> getListaelementos() {
        return listaelementos;
    }

    public void setListaelementos(ArrayList<Object> listaelementos) {
        this.listaelementos = listaelementos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void CargarArchivo() {
        try {
            listaelementos = new ArrayList();
            JLabel temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);//Se crea un flujo de entrada (FileInputStream) llamado entrada para leer bytes del archivo especificado en la variable archivo.
                ObjectInputStream objeto = new ObjectInputStream(entrada);//Se crea un flujo de objetos (ObjectInputStream) llamado objeto que se asocia con el flujo de entrada entrada. Este flujo se utiliza para leer objetos serializados del archivo.
                try {
                    while ((temp = (JLabel) objeto.readObject()) != null) {
                        listaelementos.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object UML : listaelementos) {
                bw.writeObject(UML);
            }
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }
}
