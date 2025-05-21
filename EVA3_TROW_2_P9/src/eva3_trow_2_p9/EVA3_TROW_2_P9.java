/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_trow_2_p9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleja
 */
public class EVA3_TROW_2_P9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso= null;
        try {
            perso = new Persona("alex", -5, "ibarra");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
        System.out.println(perso);
    }
    
}
class Persona{
    private String nombre;
    private int edad;
    private String apellidos;
    
       public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.apellidos = "";
    }

    public Persona(String nombre, int edad, String apellidos) throws Exception {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        setEdad(edad);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if( edad<0)
            throw new Exception("LA EDAD NO PUEDE SER MENOR QUE 0");
                    else
        this.edad = edad;
        
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String toString(){
        return "DATOS: "+ 
        "nombre:" +nombre+ "\n"+
        "apellido: "+apellidos+ "\n"+
        "edad: "+edad;
        
        
                
    }
    
}
