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
public class VitalSignsHistory {
    
    private ArrayList<VitalSigns> vitalSignsHistory;
   
    
    public VitalSignsHistory() {
        this.vitalSignsHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
  
    public VitalSigns addVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        vitalSignsHistory.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSigns vitalSign) {
        vitalSignsHistory.remove(vitalSign);
    }
    
    
    
}
