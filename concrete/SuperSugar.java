package concrete;

import abstractedC.CoffeeBase;
import abstractedC.CoffeeBaseDecorator;

public class SuperSugar extends CoffeeBaseDecorator{

    public SuperSugar(CoffeeBase baseCoffee) {
        super(baseCoffee);
       
    }

    public String getDescription() {

        return super.getDescription()+" with super sugar addon";

    }

    public double cost(){
        return super.cost()+1.5;
    }
    
}
