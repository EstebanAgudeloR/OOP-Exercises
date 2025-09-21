/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesnsybclasese2;

/**
 *
 * @author esagudelor
 */

 class MountainBike extends Bicycle{
     
     
     public int seatHeight;
    
 public MountainBike(int startHeight,
         int startCadence,
         int startSpeed,
         int startGear) { 
     super (startCadence , startSpeed, startGear);
     seatHeight = startHeight;
     
     
 }
 
    public void setHeight (int newValue){
        seatHeight = newValue;
    }
}
