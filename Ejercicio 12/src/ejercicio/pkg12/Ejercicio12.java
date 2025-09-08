/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12;

import java.util.Scanner;

/**
 *
 * @author esagudelor
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        double horas_trabajadas, valor_hora , retencion , salario_bruto, salario_neto; 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Ingresa las horas trabajadas: ");
        horas_trabajadas = scanner.nextDouble();
        
        System.out.println("Ingresa el valor_hora");
        valor_hora = scanner.nextDouble();
        
        System.out.println("Ingresa el valor de la retencion: ");
        retencion = scanner.nextDouble();
        
        
        salario_bruto= Calculos.calcular_salario_bruto(horas_trabajadas , valor_hora);
        retencion = Calculos.calcular_porcentaje_retencion(retencion);
        double valor_retencion_fuente = Calculos.calcular_valor_retencion_fuente(retencion , salario_bruto);
        salario_neto = Calculos.calcular_salario_neto(salario_bruto, valor_retencion_fuente);
        
        
        System.out.println("El salario bruto es: "+ salario_bruto);
        System.out.println("Valor retencion en la fuente:  " + valor_retencion_fuente);
        System.out.println ("salario Neto : " + salario_neto);
    }
}
