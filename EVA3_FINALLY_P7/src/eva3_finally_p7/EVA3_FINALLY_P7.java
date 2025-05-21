/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_finally_p7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class EVA3_FINALLY_P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner cap= new Scanner(System.in);
        
        System.out.println("INTRODUCE UN VALOR ENTERO");
        int valor= cap.nextInt();
        System.out.println("EL valor es:"+ valor);
        }catch(InputMismatchException e)
                {
                    System.out.println("el valor introducido no es un entero valido");
            
        }finally{//Siempre se ejecuta // BLOQUE DE CODIGO CON INSTRUCCIONES QUE DEBEN EJECUTARCE //Sin importar si hay o no excepciones
            System.out.println("ESTA LINEA SIEMPRE SE VA A EJECUTAR");
        }    
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
