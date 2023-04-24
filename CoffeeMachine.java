/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeemachine;
import java.util.Scanner;
/**
 *
 * @author Baylasan
 */
public class CoffeeMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String t=scan.nextLine();
       Grinder g=new Grinder(scan.nextInt());
       Coffee c=new Coffee(t,g);
       int s=scan.nextInt();
        String menu = "1.Make coffee \n2.Calculate amount of caffiene and caloreis \n3.check the containers \n4.Fill the machine\n";
        do {
           try {
               System.out.println(menu);
               switch (scan.nextInt()) {
                   case 1:
                       System.out.println("Enter the type of coffee you want : \nEspresso/Americano with #of shots :");
                       c.makecoffee(t,s );
                       break;
                   case 2:
                       System.out.println("Calculating... ");
                       c.calculateCaffeineAndCalories(t,s);
                       break;
                   case 3:
                       System.out.println("");
                       c.checkContainers();
                       break;
                   case 4:
                       c.FillContainers();
                       break;
                   default:
                       System.out.println("Invalid choice!!");
               }
           } catch (Exception ex) {
               System.out.println(ex);
           }
        } while (true);
    }
   
    
}
