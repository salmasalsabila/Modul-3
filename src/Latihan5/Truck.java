/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author lenovo
 */
public class Truck 
{
    //the Truck has theree fields
    public int cadence;
    public int gear;
    public int speed;
        //the Truck class has one constuctor
    public Truck (int startCandence, int startSpeed, int startGear)
    {
       gear = startGear;
       cadence = startCandence;
       speed = startSpeed;
    }
    //the Truck class four methods
    public void setCadence (int newValue)
    {
        cadence = newValue;
    }
    public void setGear (int newValue)
    {
        gear = newValue;
    }
    public void applybrake (int decrement)
    {
        speed = decrement;
    }
    public void speedUp(int increment)
    {
        speed = increment;
    }
    
}
