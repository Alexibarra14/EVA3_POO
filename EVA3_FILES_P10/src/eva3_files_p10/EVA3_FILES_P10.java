/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_files_p10;

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
public class EVA3_FILES_P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        String ruta= "C:\\archivos\\prueba.txt";
        try {
            readUsingFiles(ruta);//recomendable para leer archivos pequeños, lee todo el contenido  del archivo
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("LECTURA DE ARCHIVOS USANDO FILES");
        Path path= Paths.get(ruta);
        String cade = Files.readString(path);
        System.out.println(cade);
    }
}
