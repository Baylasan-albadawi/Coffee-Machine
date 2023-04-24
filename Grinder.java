/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

/**
 *
 * @author Baylasan
 */
public class Grinder {
    private int grindlevel;

    public Grinder(int grindlevel) {
        this.grindlevel = grindlevel;
    }

    public int getGrindlevel() {
        return grindlevel;
    }

    public void setGrindlevel(int grindlevel) {
        if (grindlevel>=1&&grindlevel<=10) {//Grinding coffee has 10 levels 
         this.grindlevel = grindlevel;   
        }
    }
    public String getInfo() {
        return "Grinder{" + "grindlevel=" + grindlevel + '}';
    }
    
}
