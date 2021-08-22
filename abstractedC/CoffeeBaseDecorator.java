package abstractedC;

public abstract class CoffeeBaseDecorator extends CoffeeBase {
    
    protected CoffeeBase baseCoffee;

    public CoffeeBaseDecorator(CoffeeBase baseCoffee) {

        this.baseCoffee = baseCoffee;

    }

    public String getDescription(){
        return baseCoffee.getDescription();
    }

    
    public double cost(){
        return baseCoffee.cost();
    }

}
