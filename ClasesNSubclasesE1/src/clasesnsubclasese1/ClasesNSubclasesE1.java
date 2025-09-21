 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesnsubclasese1;

/**
 *
 * @author esagudelor
 */
public class ClasesNSubclasesE1 {

    public static void main(String[] args) {

        System.out.println("Prueba de clase y subclase");
        
        Car myCar = new Car();
        
  
        // Inherited method and attribute
        System.out.println(myCar.brand);
        myCar.honk();
        
        // Model name is an attribute from class Car
        System.out.println(myCar.modelName);
        
        
    }
    
}
