/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.pkg3;

/**
 *
 * @author esagudelor
 */
public class Automóvil {
    String marca;

    int modelo;
    int motor;
    tipoCom tipoCombustible;
    tipoA tipoAutomóvil;
    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;
    tipoColor color;
    int velocidadActual = 0;
    Automóvil(String marca, int modelo, int motor, tipoCom
        tipoCombustible, tipoA tipoAutomóvil, int númeroPuertas, int cantidadAsientos, int velocidadMáxima, tipoColor color) {
              
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
    }
        
    String getMarca() {
        return marca;       
        }
    
    int getModelo() {
        return modelo;
        }
    
    int getMotor() {
        return motor;
        }
    tipoCom getTipoCombustible() {
        return tipoCombustible;
        }
    tipoA getTipoAutomóvil() {
        return tipoAutomóvil;
        }
    int getNúmeroPuertas() {
        return númeroPuertas;
        }
    int getCantidadAsientos() {
        return cantidadAsientos;
        }
    int getVelocidadMáxima() {
        return velocidadMáxima;
        }       
    tipoColor getColor() {
        return color;
        }
    int getVelocidadActual() {
        return velocidadActual;
        }
    void setMarca(String marca) {
        this.marca = marca;
        }
    void setModelo(int modelo) {
        this.modelo = modelo;
        }
    void setMotor(int motor) {
        this.motor = motor;
        }
    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
        }
    void setTipoAutomóvil(tipoA tipoAutomóvil) {
        this.tipoAutomóvil = tipoAutomóvil;
        }
    void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
        }
    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
        }   
    void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
        }
    void setColor(tipoColor color) {
        this.color = color;
        }
    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
        }
    void acelerar(int incrementoVelocidad) {
            if (velocidadActual + incrementoVelocidad < velocidadMáxima) {
                
                velocidadActual = velocidadActual + incrementoVelocidad;
                
            } else { 
                System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            }
    }
    void desacelerar(int decrementoVelocidad) {

            if ((velocidadActual - decrementoVelocidad) > 0) {
                velocidadActual = velocidadActual - decrementoVelocidad;
            } else { 
                System.out.println("No se puede decrementar a una velocidad negativa.");
            }
    }    
    
    void frenar() {
        velocidadActual = 0;
    }
    
    double calcularTiempoLlegada(int distancia) {
            return distancia/velocidadActual;
    }
    
    void imprimir() {
    System.out.println("Marca = " + marca);
    System.out.println("Modelo = " + modelo);
    System.out.println("Motor = " + motor);
    System.out.println("Tipo de combustible = " + tipoCombustible);
    System.out.println("Tipo de automóvil = " + tipoAutomóvil);
    System.out.println("Número de puertas = " + númeroPuertas);
    System.out.println("Cantidad de asientos = " +cantidadAsientos);
    System.out.println("Velocida máxima = "+ velocidadMáxima);
    System.out.println("Color = " + color);
    
    }  
}
