/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.defencesystem.mainControl;

/**
 *
 * @author Dahanayake
 */
public interface Observable {
    void setButtonFunctions(int power);
    void inboxFromControl(String text);
    void areaLabel(boolean status);
}
