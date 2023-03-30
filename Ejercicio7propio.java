/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author wds65
 */
public class Ejercicio7propio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = input.nextInt();

        int suma = num1 / num2;

        System.out.println("Dividir " + num1 + " por " + num2 + " es: " + suma);
        
    }
  
}
