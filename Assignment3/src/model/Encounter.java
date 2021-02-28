/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class Encounter {
    int encounterId;
    private VitalSigns vitalSigns;
    EncounterHistory encounterHistory = new EncounterHistory();
    
    public Encounter(VitalSigns vitalSigns){
        this.vitalSigns = vitalSigns;
        encounterHistory.addEncounter(this);
    }
    
    public int getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }
    
}
