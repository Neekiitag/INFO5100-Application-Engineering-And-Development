/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class CarHistory {
    
    private ArrayList<CarInfo> history;
    public CarHistory(){
    
        this.history = new ArrayList<CarInfo>();
    
    }

    public ArrayList<CarInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarInfo> history) {
        this.history = history;
    }
    
    
    public CarInfo addNewCars(){
        CarInfo newCars = new CarInfo();
        history.add(newCars);
        return newCars;
    
        
        
    }
    
    public void deleteCar(CarInfo ci){
        history.remove(ci);
    
    }
    
}
