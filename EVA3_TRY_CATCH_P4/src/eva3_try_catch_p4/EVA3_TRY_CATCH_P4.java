/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_try_catch_p4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class EVA3_TRY_CATCH_P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap= new Scanner(System.in);
        try{
        System.out.println("INTRODUCE UN VALOR ENTERO:");
        int valor= cap.nextInt();
        System.out.println("EL VALOR ES = "+valor);}
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("FIN ");
    }
    
}
