/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion1javainheritence;

/**
 *
 * @author esagudelor
 */
public class EjercicioN1javaInheritence {

    public static void main(String[] args) {
        Car myCar = new Car();
        Vehicle myVehicle = new Vehicle();
        myVehicle.honk();
        myCar.brand = "Ford";
        myCar.modelName = "Fiesta";
        myCar.honk();
        
        System.out.println(myCar.brand + "" + myCar.modelName);

    }
    
}
