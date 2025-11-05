/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio418;

/**
 *
 * @author esagudelor
 */
public class EquipoMaratonProgramacion {
    
    String nombreEquipo;
    String universidad;
    String lenguajeProgramación;
    Programador[] programadores;
    int tamañoEquipo;
    
    EquipoMaratonProgramacion(String nombreEquipo, String universidad, String lenguajeProgramación) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = this.universidad;
        this.lenguajeProgramación = this.lenguajeProgramación;
        this.programadores = this.programadores;
        tamañoEquipo = 0; // El tamaño del equipo inicialmente es cero
        programadores = new Programador[3]; 
    }
    
    boolean estáLleno() {
        return tamañoEquipo == programadores.length;
    }
    
    void añadir(Programador programador) throws Exception {
        if (estáLleno()) { 
            throw new Exception ("El equipo está completo. No se pudo agregar programador.");
        }

        programadores[tamañoEquipo] = programador;
        tamañoEquipo++;
    }
    static void validarCampo(String campo) throws Exception {
        for (int j = 0; j < campo.length(); j++) {
            char c = campo.charAt(j);
            if (Character.isDigit(c)) { 
                throw new Exception("El nombre no puede tener dígitos.");
            }
        }
    }
}

