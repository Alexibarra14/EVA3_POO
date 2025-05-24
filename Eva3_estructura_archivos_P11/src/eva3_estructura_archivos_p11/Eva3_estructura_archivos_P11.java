/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_estructura_archivos_p11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleja
 */
public class Eva3_estructura_archivos_P11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String ruta= "C:\\archivos\\";
        try {
            writeUsingFiles(ruta, "HOLA MUNDO \n Escribiendo archivos");
            writeUsingFileWriter(ruta, "HOLA MI NIÑA SE QUE VIENES TOMADA\n Escuche tu llegadaa");
            writeUsingBufferWriter(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void writeUsingFiles(String ruta, String texto) throws IOException{
        System.out.println("ESCRIBIR USANDO FILES");
        Path path= Paths.get(ruta+"files.txt");
        Files.write(path,texto.getBytes());//el texto se guarda como bytes
        
        
    }
    public static void writeUsingFileWriter(String ruta, String texto) throws IOException{
       File file= new File(ruta+"Filewriter.txt");
        FileWriter escArch = new FileWriter(file);
        escArch.write(texto);
        escArch.close();
        
    }
    public static void writeUsingBufferWriter(String ruta) throws IOException{
        System.out.println("ESCRITURA CON BUFFERED WRITER");
        File file = new File(ruta+ "natanael cano.txt");
        FileWriter out = new FileWriter(file);
        BufferedWriter escArch= new BufferedWriter(out);
        for(int i=0; i<10; i++){
            escArch.write("Escritura de archivos de buffered writer");
            escArch.write("\n");
            
        }     
        escArch.close();
    }
    
}
