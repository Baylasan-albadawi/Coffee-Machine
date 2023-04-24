/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

/**
 *
 * @author Baylasan
 */
public class Beans {
   private int amount;

    public Beans(int amount) {
        this.amount = amount;
    }
   
    public int getAmount() throws Exception { 
        {
            if (amount < 7) {
            throw new Exception("Not enough coffee beans. Please add more coffee beans.");
        }
        return amount;
    }
    }
    public void setAmount(int amount) {
        if (amount>=7&&amount<=1000) //gram
           this.amount = amount;
    }
    public void fillcoffeebeans(){
       System.out.println("Filling Beans Container..."); 
       setAmount(1000);
       System.out.println("Beans Container Filled !"); 
    }
    
   
    public String getInfo() {
        return "Beans{" + "amount=" + amount +'}';
    }
            
   
}
