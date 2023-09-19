/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package python2;

import java.io.EOFException;
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
public class admin_UML {
    
   private ArrayList <CustomPanel> elementos=new ArrayList();
    private File archivo=null;

    public admin_UML(String Path) {
      archivo = new File(Path);
    }

    public ArrayList<CustomPanel> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<CustomPanel> elementos) {
        this.elementos = elementos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void AgregarElemento(CustomPanel E){
        elementos.add(E);
    }
        public void EscribirArchivo() throws IOException{
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try{
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (CustomPanel Clase : elementos) {
               bw.writeObject(Clase);
            }
            bw.flush();
        }catch(Exception ex){
        }
        
        bw.close();

        fw.close();
    }
    
    
        public void CargarArchivo(){
        try{
            elementos=new ArrayList();
            CustomPanel temp;
            if (archivo.exists()) {
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto =new ObjectInputStream(entrada);
                try{
                    while((temp=(CustomPanel)objeto.readObject())!=null){
                        elementos.add(temp);
                    }
                }catch(EOFException e){
                    //SIEMPRE VA A TIRAR ERROR
                    //Encontro el final del archivo.
                }
                 objeto.close();//cierre del buffer
                 entrada.close();//cierre del canal , se abren inversamete a como se abren 
                 
            }//fin del if
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
