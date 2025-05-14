/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_uncheacked_p1;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class EVA3_UNCHEACKED_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ARITMETHIX EXCEPTION --> DIVICION ENTRE 0
       int x = 5, y=1;
        int resu= x/y;// divicion entre 0
        System.out.println("resultado: "+ resu);
        
        
        //NUlL POINTER EXCEPTION
        prueba prue= null;
        prue.toString(); // usar un objeto que no existe
        
        
        
       //INDEXOUTBOUNDS EXCEPTION
       //ARREGLOS: LEER UNA POSICION QUE NO EXISTE
       int[] arreglo = new int[5];
        System.out.println(arreglo[10]);
        
       
        
       //INPUTMISMATCH EXCEPTION
       //PIDEN UN DATO DE UN TIPO Y LES MANDA UNO DIFERENTE
       Scanner cap= new Scanner(System.in);
        System.out.println("CAPTURA UN ENTERO");
        int valor;
        valor= cap.nextInt();
        System.out.println("Valor: "+valor);
        
        
    }
    
}
class prueba{}