/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesnsybclasese2;

/**
 *
 * @author esagudelor
 */
public class Bicycle {
    //Attributes
    public int cadence;
    public int gear;
    public int speed;
     
    //Constructor method
    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear= startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    //Methods
    public void setCadence(int newValue){
        cadence = newValue;
    }
      public void setGear(int newValue){
        gear = newValue;
    }
     public void applyBrake (int decrement){
        speed -= decrement;
    }
     public void speedUp(int increment){
        speed += increment;
    }
    
    
}
