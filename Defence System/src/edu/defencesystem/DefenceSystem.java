/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.defencesystem;

import edu.defencesystem.forces.Helicopter;
import edu.defencesystem.forces.Submarine;
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
        ControlRoom controlRoom=new ControlRoom();
        controlRoom.setSubmarine(new Submarine(controlRoom));
        controlRoom.setHelicopter(new Helicopter(controlRoom));
        controlRoom.setTank(new Tank(controlRoom));
    }
    
}
