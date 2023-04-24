/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

/**
 *
 * @author Baylasan
 */
public class Water {
    int level;

    public Water(int waterlevel) {
        
        this.level = waterlevel;
    }

    public int getWaterlevel()throws Exception { 
        {
        if (level < 30) {
            throw new Exception("Not enough water. Please refill the water tank.");
        }
        return level;
    }
    }

    public void setWaterlevel(int waterlevel) {
        if (waterlevel<=1000&&30<=waterlevel) //milliliter
        {
          this.level = waterlevel;
        }
    }
    public void fillwatercontainer(){
    System.out.println("Filling water Container...");
        setWaterlevel(1000);
        System.out.println("Water Container Fillid !");
    
}
    public String getInfo() {
        return "Water{" + "level=" + level + '}';
    }
    
}
