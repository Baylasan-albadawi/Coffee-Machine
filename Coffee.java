/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;




/**
 *
 * @author Baylasan
 */
public class  Coffee {
    private int waterlevel;
    private Grinder grindlevel;
    private int beans;
    private Beans b;
    private Water w;
    private String coffeetype;
    private Waste a;
    private int cupscounter;

    public Coffee(String coffeetype,Grinder grindlevel) {
        this.grindlevel = grindlevel;
        this.coffeetype = coffeetype;
        cupscounter++;
    }

    public Coffee() {
    }

   
    public String getCoffeetype() {
        return coffeetype;
    }

    public void setCoffeetype(String coffeetype) {
            this.coffeetype = coffeetype;
    }

    public Beans getB() {
        return b;
    }
    private int amount;
    public void setB(Beans b) {
        this.b = new Beans(amount);
    }

  
    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }
   
    public int getWaterlevel() {
        return waterlevel;
    }

    public int getCupscounter() {
        return cupscounter;
    }

    public void setCupscounter(int cupscounter) {
        this.cupscounter = cupscounter;
    }
    

    public void setWaterlevel(int waterlevel) {
        if (waterlevel>=30&&waterlevel<=220) {
            this.waterlevel = waterlevel;
        }
        else 
            System.out.println("Out of bound!");
        
    }

    public Grinder getGrindlevel() {
        return grindlevel;
    }

    public void setGrindlevel(Grinder grindlevel) {
        this.grindlevel = grindlevel;
    }
    public Water getW() {
        return w;
    }
    private int level;
    public void setW(Water w) {
        this.w = new Water(level);
    }
    public void checkContainers(){
        try {
            System.out.println("Checking...");
            b.getAmount();
            w.getWaterlevel();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    //To refill the containers
    public void FillContainers(){
        try {
        b.fillcoffeebeans();
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return;
    }
    try {
        w.fillwatercontainer();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
    int MAX_WATER_CAPACITY=220;//ml
    int MAX_BEANS_CAPACITY=14;//gram
    public void makecoffee(String type,int shots) throws Exception{
        switch (coffeetype) {
            case "espresso":
                waterlevel=30*shots;beans=7*shots;
                w.setWaterlevel(level-=30*shots);
                b.setAmount(amount-=7*shots);
                a.setCupsServed(cupscounter-=1);
                System.out.println("Making Espresso!");
            case "americano":
                if (shots==1) {
                    waterlevel=170;beans=7;
                    w.setWaterlevel(level-=170);
                    b.setAmount(amount-=7);
                }
                else
                    waterlevel=220;beans=14;
                    w.setWaterlevel(level-=220);
                    b.setAmount(amount-=14);
                    System.out.println("Making Americano !");
                    break;
                default:
                System.out.println("Invalid choice!"); 
            }
            if (waterlevel > MAX_WATER_CAPACITY || beans > MAX_BEANS_CAPACITY) {
            throw new Exception("Volume exceeds machine capacity!");
            
            }
            System.out.println("Ready");
    }
    
   //for caffiene and caloreis calculation:   //for caffiene and caloreis calculation:
    private final double EspressoCaffiene = 63.6; // mg
    private final double AmericanoCaffiene = 94; // mg
    private final double EspressoCalories= 3; // kcal
    private final double AmericanoCalories = 3; // kcal
    
    public void calculateCaffeineAndCalories( String coffeeType,int shots) {
        double caffeine;
        double calories;
        
        if (coffeeType.equalsIgnoreCase("espresso")) {
            caffeine = EspressoCaffiene* shots;
            calories = EspressoCalories * shots;
        } else if (coffeeType.equalsIgnoreCase("americano")) {
            caffeine = AmericanoCaffiene* shots;
            calories = AmericanoCalories * shots;
        } else {
            System.out.println("Invalid coffee type!");
            return;
        }
        
        System.out.println("Caffeine in " + shots + " shot(s) of " + coffeeType + ": " + caffeine + " mg");
        System.out.println("Calories in " + shots + " shot(s) of " + coffeeType + ": " + calories + " kcal");
    }

    public String getInfo() {
        try {
            return "Coffee{" + "waterlevel=" + w.getWaterlevel()+ ", Amount of Beans=" + b.getAmount() + '}';
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    
    
}
