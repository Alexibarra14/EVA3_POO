/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_files_p10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleja
 */
public class EVA3_FILES_P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        String ruta= "C:\\archivos\\prueba.txt";
        try {
            readUsingFiles(ruta);//recomendable para leer archivos pequeños, lee todo el contenido  del archivo
            readUsingScanner(ruta);//Recomendable cuando nesesitamos leer tokens(fragmentos) en otro tipo de variables
            readUsingBufferReader(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("LECTURA DE ARCHIVOS USANDO FILES");
        Path path= Paths.get(ruta);//paths genera la variable de tipo path
        String cade = Files.readString(path);
        System.out.println(cade);
        
    }
    public static void readUsingScanner(String ruta) throws FileNotFoundException{
        System.out.println("LECTURA DE ARCHIVOS USANDO SCANNER");
        File source= new File(ruta);
        Scanner leerArch= new Scanner(source);
        String cade;
        while (leerArch.hasNextLine()){//INDICA SI LLEGAMOS AL FINAL
       cade=  leerArch.nextLine();//LEE LA LINEA ACTUAL  Y NOS MUEVE A LA SIGUIENTE LINEA
            System.out.println(cade);
        }leerArch.close();
    }
    public static void readUsingBufferReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("LECTURA DE ARCHIVOS USANDO EL BUFFER READER");
        File file= new File(ruta);
        FileInputStream inStream= new FileInputStream(file);
       InputStreamReader in =new InputStreamReader(inStream);
        BufferedReader leerTxt = new BufferedReader(in);
        String cade;
       
        while ((cade=leerTxt.readLine())!=null){
            System.out.println(cade);
            
        }
        leerTxt.close();
    }
}
