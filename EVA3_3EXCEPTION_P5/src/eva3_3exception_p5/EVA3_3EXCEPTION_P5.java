/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3exception_p5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * 
 * @author aleja
 */
public class EVA3_3EXCEPTION_P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int[] datos= new int[5];
            datos[7] = 0;
            int x=7, y=0;
            int resu=x/y;
            Scanner captu = new Scanner(System.in);
            System.out.println("introduce el num");
            int nume= captu.nextInt();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
       
    }
    
}
