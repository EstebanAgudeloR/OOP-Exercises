/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;
import java.util.Scanner;
/**
 *
 * @author esagudelor
 */

public class Ejercicio4 {

    public static void main(String[] args) {
   
    double edalber, edana, edmama, edjuan;
    Scanner scanner = new Scanner(System.in);
    System.out.println( "Ingrese la edad de Juan :");
    edjuan = scanner.nextDouble();
    edalber = Calculos.calcular_edalber(edjuan);
    edana = Calculos.calcular_edana(edjuan);
    edmama = Calculos.calcular_edmama(edjuan,edana,edalber);
    System.out.println( "Juan: " + edjuan);
    System.out.println(" Ana: " + edana);
    System.out.println(" Alberto: " + edalber);
    System.out.println(" Mama : " + edmama);
   
    }
    
}
