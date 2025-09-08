/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author esagudelor
 */
public class Calculos {
    static double calcular_edalber(double edjuan){
     double edalber = 2* (edjuan/3);
     return edalber ;
    
 }
    
 static double calcular_edana(double edjuan) {
     double edana = 4* (edjuan/3);
     return edana;
 }
 
 static double calcular_edmama (double edjuan, double edalber , double edana){
     
     double edmama = edjuan + edalber + edana;
     return edmama;
    
     
 }
    
}
