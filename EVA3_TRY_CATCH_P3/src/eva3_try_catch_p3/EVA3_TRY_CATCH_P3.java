/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_try_catch_p3;

import java.awt.BorderLayout;

/**
 *
 * @author aleja
 */
public class EVA3_TRY_CATCH_P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       try{ //BLOQUE DONDE INTENTAMOS EJECUTAR EL CODIGO
           //QUE POTENCIALMENTE GENERA UNA EXCEPCION
           int x= 5, y=0;
           int resu= x/y;
       System.out.println("RESULTADO: "+resu);}
       catch(ArithmeticException e){
           // AQUI TENEMOS QUE RESOLVER LA EXCEPCION
         e.printStackTrace();
           
       }
        System.out.println("TERMINO SI JALO ESTA VAINA");
           }
    
}
