/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.pkg2;

/**
 *
 * @author esagudelor
 */
public class Planeta {
    
    //Atributos
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    tipoPlaneta tipo;
    boolean esObservable = false;
    

    Planeta(String nombre, int cantidadSatelites, double masa, double
    volumen, int diametro, int distanciaSol, tipoPlaneta tipo, boolean
    esObservable) {
    this.nombre = nombre;
    this.cantidadSatelites = cantidadSatelites;
    this.masa = masa;
    this.volumen = volumen;
    this.diametro = diametro;
    this.distanciaSol = distanciaSol;
    this.tipo = tipo;
    this.esObservable = esObservable;
    }
    void imprimir() {
    System.out.println("Nombre del planeta = " + nombre);
    System.out.println("Cantidad de satélites = "+ cantidadSatelites);
    System.out.println("Masa del planeta = " + masa);
    System.out.println("Volumen del planeta = " + volumen);
    System.out.println("Diámetro del planeta = " + diametro);
    System.out.println("Distancia al sol = " + distanciaSol);
    System.out.println("Tipo de planeta = " + tipo);
    System.out.println("Es observable = " + esObservable);
    }
    
    double calcularDensidad() {
    return masa/volumen;
    }
    
    boolean esPlanetaExterior(){
        float límite = (float) (149597870 * 3.4);
            if (distanciaSol > límite) {
                return true;
            }
            else {
                return false;
            }   
}
}
    

