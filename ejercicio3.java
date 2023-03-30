/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author wds657
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = input.nextLine();

        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();

        System.out.println("La frase en mayúsculas es: " + mayusculas);
        System.out.println("La frase en minúsculas es: " + minusculas);
        
    
    }
    
}
