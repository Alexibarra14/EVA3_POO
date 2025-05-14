/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_uso_exceptions_p6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Eva3_uso_exceptions_p6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int nume=0;
        while(true){
            try{
            Scanner captu = new Scanner(System.in);
        
            System.out.println("introduce el num");
               nume=captu.nextInt();
               break;
            }catch(InputMismatchException e){
                System.out.println("el valor no es valido vuelve a intyentarlo");
            }
            
           
       
            }
                System.out.println("EL VALOR ES:" + nume);
                    
                
              
            
            
            }
            
    }
    

