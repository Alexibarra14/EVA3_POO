/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_stack_p2;

/**
 *
 * @author aleja
 */
public class EVA3_STACK_P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA MAIN");
        A();
        System.out.println("TERMINA MAIN");
        
    }
        public static void A(){
            System.out.println("INICIA A");
            B();
            System.out.println("TERMINA A");
        }
        public static void B(){
            System.out.println("INICIA B");
            C();
            System.out.println("TERMINA B");
        }
        public static void C(){
            System.out.println("INICIA C");
               int x = 5, y=0;
        int resu= x/y;// divicion entre 0
        System.out.println("resultado: "+ resu);
            System.out.println("TERMINA C");
        }
}
