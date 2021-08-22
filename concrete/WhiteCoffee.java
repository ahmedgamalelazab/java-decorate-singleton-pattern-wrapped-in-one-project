package concrete;

import abstractedC.*;

public class WhiteCoffee extends CoffeeBase{

    //Override
    public String getDescription() {

        return "White Coffee";

    }
    @Override
    public double cost() {
        return 10.00;
    }
    
}
