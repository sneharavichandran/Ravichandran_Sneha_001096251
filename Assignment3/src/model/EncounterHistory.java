/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sneha
 */
public class EncounterHistory {

    List<Encounter> encounterHistory = new ArrayList();

    public List<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void addEncounter(Encounter encounter) {
        this.encounterHistory.add(encounter);
    }
    
    
}
