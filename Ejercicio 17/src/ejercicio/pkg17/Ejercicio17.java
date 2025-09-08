/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg17;

import java.util.Scanner;

/**
 *
 * @author esagudelor
 */
public class Ejercicio17 {

 
    public static void main(String[] args) {
        
         double radio, longitud, area;
         Scanner scanner = new Scanner(System.in);
         System.out.println ("Ingrese el valor del radio");
         radio = scanner.nextDouble();
         longitud = Calculos.calcular_longitud(radio);
         area = Calculos.calcular_area(radio);
         System.out.println("radio : " + radio);
         System.out.println("Longitud : " + longitud);
         System.out.println("Area : " + area);
         
         
      
         
    }
    
}
