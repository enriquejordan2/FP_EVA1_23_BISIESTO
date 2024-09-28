/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_23_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        int año,bis1,bis2,bis3;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el anno deseado");
        año = captu.nextInt();
        
        bis1 = año % 4;
        bis2 = año % 100;
        bis3 = año % 400;
        
        if (bis1 ==0 && bis2==0){
            System.out.println("Es bisiesto");
           }else if (bis2 ==0){
          System.out.println("No bisiesto");
                }else if (bis1 ==0 && bis3!=0){
            System.out.println("es bisiesto");
        }else{ 
           System.out.println("No es Bisiesto");
        }
        
        
    }
    
}
