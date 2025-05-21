/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_trow_p8;

/**
 *
 * @author aleja
 */
public class EVA3_TROW_P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
       try{
           Persona perso = new Persona("alex", -5, "ibarra");
       
        System.out.println(perso);}catch(RuntimeException e){
            System.out.println("Datos capturados de manera erronea");
        }
        System.out.println("El programa a finalizado");
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

    public Persona(String nombre, int edad, String apellidos) {
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

    public void setEdad(int edad) {
        if( edad<0)
            throw new RuntimeException("LA EDAD NO PUEDE SER MENOR QUE 0");
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