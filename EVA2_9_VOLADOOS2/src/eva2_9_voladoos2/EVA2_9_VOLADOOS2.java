/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_voladoos2;

import java.util.Scanner;

/**
 *
 * @author troyx
 */
public class EVA2_9_VOLADOOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para Aguila coloque (1) y para Sello coloque un (2): ");
        int Yo = scanner.nextInt();

        // Generar aleatoriamente cara (1) o cruz (2)
        int CPU = (int) (Math.random() * 2) + 1;

        if (Yo == CPU) 
            if (Yo == 1) 
                System.out.println("¡Elegiste Aguila y has ganado!");
             else 
                System.out.println("¡Elegiste Sello y has ganado!");
            
         else 
            if (Yo == 1) 
                System.out.println("¡Elegiste Aguila pero has perdido!");
             else 
                System.out.println("¡Elegiste Sello pero has perdido!");
            
        
    }

    
 
     
            
        
    

}
