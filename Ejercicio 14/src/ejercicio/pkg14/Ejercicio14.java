/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;
import java.util.Scanner;
/**
 *
 * @author esagudelor
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        double numero, cubo, cuadrado;
         Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Ingresa un numero");
        numero = scanner.nextDouble();
        
        cuadrado= Calculos.calcular_cuadrado(numero);
        cubo = Calculos.calcular_cubo(numero);
        System.out.println("Numero : " + numero);
         System.out.println("Cuadrado : " + cuadrado);
          System.out.println("Cubo : " + cubo);
        
    }
    
}
