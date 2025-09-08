/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author esagudelor
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double suma , x , y ;
       
       Scanner scanner = new Scanner(System.in); //lectura de entrada teclado
        
        System.out.println("Ingresa un número para suma : ");
        suma= scanner.nextDouble();
        
        System.out.println("Ingresa un número para x : ");
        x= scanner.nextDouble();
        
        System.out.println("Ingresa un número para y : ");
        y= scanner.nextDouble();
        
        suma= Calculos.calcular_suma(suma,x);
        
        x= Calculos.calcular_x(y, x);
        
suma = suma + (x/y);
System.out.println ("El valor de la suma es: " + suma);
    
    }
    
}
