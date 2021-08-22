package concrete;

import abstractedC.*;

public class DarkCoffee extends CoffeeBase{

    //Override
    public String getDescription() {
        return "Dark Coffee";
    }
    
    @Override
    public double cost() {
        return 15.00;
    }
    
}
