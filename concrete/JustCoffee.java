package concrete;

import abstractedC.*;

public class JustCoffee extends CoffeeBase{

    //Override
    public String getDescription() {
        return "Just Coffee";
    }

    @Override
    public double cost() {
       //if it's just coffee i will calc it with total 5$
       return 5.00;
    }
    
}
