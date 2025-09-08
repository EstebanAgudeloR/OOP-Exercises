/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg17;

/**
 *
 * @author esagudelor
 */
public class Calculos {
         static double calcular_longitud(double radio) {
     double longitud = 2*Math.PI * radio;
     return longitud;
  
 }
             static double calcular_area(double radio) {
     double area = Math.PI * Math.pow(radio,2);
     return area;
  
 }
}
