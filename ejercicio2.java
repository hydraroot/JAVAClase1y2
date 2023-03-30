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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, introduce tu nombre: ");
        String nombre = input.nextLine();

        System.out.println("Hola, " + nombre + ". ¡Bienvenido!");
        
        
        
    }
    
}
