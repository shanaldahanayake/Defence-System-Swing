/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.defencesystem;

import edu.defencesystem.forces.Helicopter;
import edu.defencesystem.forces.Submarine;
import edu.defencesystem.forces.SuperDefence;
import edu.defencesystem.forces.Tank;
import edu.defencesystem.mainControl.ControlRoom;


/**
 *
 * @author Dahanayake
 */
public class DefenceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperDefence superD=new SuperDefence();
        superD.superDefenceObserver(new Helicopter());
        superD.superDefenceObserver(new Tank());
        superD.superDefenceObserver(new Submarine());
        
        ControlRoom ctr=new ControlRoom(superD);
    }
    
}
