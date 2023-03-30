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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la temperatura en grados centígrados: ");
        double celsius = input.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println(celsius + " grados centígrados equivalen a " + fahrenheit + " grados Fahrenheit.");
        
    }
    
}
