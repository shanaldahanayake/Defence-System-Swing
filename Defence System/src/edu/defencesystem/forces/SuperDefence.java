/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.defencesystem.forces;

import edu.defencesystem.mainControl.Observable;
import javax.swing.JFrame;

/**
 *
 * @author Dahanayake
 */
public class SuperDefence extends JFrame {
    private int power;
    private String inboxControl;
    private boolean status;
    
    public void setPower(int power){
        this.power=power;
        enableButtons();
    }
    
    public void setInboxFromControl(String inboxControl){
        this.inboxControl=inboxControl;
        enableMessagesFromControlToInbox();
        
    }
    
    public void setAreaFromControl(Boolean status){
       this.status=status;
       enableAreaClearanceFromControl();
    }
    
    
    
    Observable[] observes=new Observable[0];
    
    public void superDefenceObserver(Observable defenceObserve){
        Observable[] temp=new Observable[observes.length+1];
        for (int i = 0; i < observes.length; i++) {
            temp[i]=observes[i];
        }
        temp[temp.length-1]=defenceObserve;
        observes=temp;     
    }
    
    public void enableButtons(){
        for(Observable ob:observes){
            ob.setButtonFunctions(power);
        }
    }
    
    public void enableMessagesFromControlToInbox(){
        for(Observable ob:observes){
            ob.inboxFromControl(inboxControl);
        }
    }
    
    public void enableAreaClearanceFromControl(){
        for(Observable ob:observes){
            ob.areaLabel(status);
        }
    }
    
}
