/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio406;

/**
 *
 * @author esagudelor
 */
public class Vendedor {
    String nombre; 
    String apellidos; 
    int edad;
    
    Vendedor(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    }

    void imprimir() {
    System.out.println("Nombre del vendedor = " + nombre);
    System.out.println("Apellidos del vendedor = " + apellidos);
    System.out.println("Edad del vendedor = " + edad);
    }
 
}
