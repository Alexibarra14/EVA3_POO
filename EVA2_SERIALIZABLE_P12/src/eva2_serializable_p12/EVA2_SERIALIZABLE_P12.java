/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_serializable_p12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleja
 */
public class EVA2_SERIALIZABLE_P12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            escribirArchObj();
            leerArchObj();
        }catch(IOException EX){
            System.out.println("error");;
        }  catch (ClassNotFoundException ex) {
            System.out.println("catch nout founs");
        }
        
    }
    public static void leerArchObj() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream in = new FileInputStream("C:\\archivos\\POO.txt");
        
        ObjectInputStream leerArch = new ObjectInputStream(in);
        while (true){
            Persona perso = (Persona)leerArch.readObject();
            System.out.println(perso);
        }
        
    }
    public static void escribirArchObj() throws IOException{
        FileOutputStream out = new FileOutputStream("C:\\archivos\\POO.txt",true);
        ObjectOutputStream guardarObj = new ObjectOutputStream(out);
        guardarObj.writeObject(new Persona("juan","perez",50));
        guardarObj.writeObject(new Persona("Pedor","Fernandez",31));
        guardarObj.writeObject(new Persona("Alex","ibarra",5));
        guardarObj.writeObject(new Persona("Raul","Orbañanos",35));
        guardarObj.flush();
        guardarObj.close();
    }
}
class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;

    
     public Persona( ) {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad;
    }
    
    
}