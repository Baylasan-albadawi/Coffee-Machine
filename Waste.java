/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

/**
 *
 * @author Baylasan
 */
public class Waste {
    private final int CLEANING_INTERVAL = 10; // Clean the machine after every 10 cups
    private int cupsServed = 0;

public void serveCoffee() {
    Coffee coffee=new Coffee();
    cupsServed=coffee.getCupscounter();
    if (cupsServed == CLEANING_INTERVAL) {
        CleaningNeeded();
    }
}

    public void setCupsServed(int cupsServed) {
        this.cupsServed = cupsServed;
    }

    public int getCupsServed() {
        return cupsServed;
    }


private void CleaningNeeded() {
    // Display a message indicating that the water tray and waste need to be cleaned
    System.out.println("Please clean the water tray and waste bin.");
}
}
