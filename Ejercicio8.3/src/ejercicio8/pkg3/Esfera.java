/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8.pkg3;

/**
 *
 * @author esagudelor
 */
public class Esfera extends FiguraGeometrica {
    //Atributtes
    private double radio;
    
    //Methods
    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(calcularVolumen()); 
        this.setSuperficie(calcularSuperficie());
    }
    public double calcularVolumen() {
        double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
        return volumen;
    }
    public double calcularSuperficie() {
        double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
        return superficie;
    }
}
