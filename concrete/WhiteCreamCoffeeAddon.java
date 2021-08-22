package concrete;

import abstractedC.CoffeeBase;
import abstractedC.CoffeeBaseDecorator;

public class WhiteCreamCoffeeAddon extends CoffeeBaseDecorator{

    public WhiteCreamCoffeeAddon(CoffeeBase baseCoffee) {
        super(baseCoffee);
       //extra could be added
    }

    public String getDescription(){
        return super.getDescription()+" with White Cream";
    }

    public double cost(){
        return super.cost()+3.00;
    }
    
}
