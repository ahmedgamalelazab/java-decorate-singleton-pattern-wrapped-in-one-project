
import java.util.*;// with this we will be able to use the scanner

import java.util.ArrayList;

import abstractedC.CoffeeBase;
import concrete.*;

class CoffeeDemo {

    public static void main(String[] args) {

        ArrayList<String> applicationMenuReady = new ArrayList<String>();
        applicationMenuReady.add("Just Coffee [1]");
        applicationMenuReady.add("Dark Coffee [2]");
        applicationMenuReady.add("White Coffee [3]");
        applicationMenuReady.add("just Coffee with Wite Cream [4]");
        applicationMenuReady.add("just Coffee with Super Sugar [5]");
        applicationMenuReady.add("White Coffee with Cream [6]");
        applicationMenuReady.add("White Coffee with Super Sugar [7]");
        applicationMenuReady.add("Dark  Coffee with white Cream [8]");
        applicationMenuReady.add("Dark Coffee with Super Sugar [9]");
        applicationMenuReady.add("just Coffee with double Cream [10]");

        applicationMenuSingleton.getInstance().setApplicationMenu(applicationMenuReady);

        Scanner sc = new Scanner(System.in);

        int userInput = -100;

        do {
            System.out.println("Coffee Menu");
            System.out.println('\n');
            applicationMenuSingleton.getInstance().getApplicationMenu().forEach(c -> System.out.println(c));
            System.out.println("\n");
            System.out.println("Pleas Pick one of the numbers to Get Ur Coffee");
            System.out.print("your Coffee : ");
            userInput = sc.nextInt();
            System.out.println("\n");

            switch (userInput) {
                case 1:
                    // just Coffee
                    CoffeeBase justCoffee = new JustCoffee();
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + justCoffee.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + justCoffee.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    break;
                case 2:
                    // just Coffee
                    CoffeeBase darkCoffee = new DarkCoffee();
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + darkCoffee.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + darkCoffee.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    System.out.println("whatever");
                    break;
                case 3:
                    // just Coffee
                    CoffeeBase whiteCoffee = new WhiteCoffee();
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + whiteCoffee.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + whiteCoffee.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    System.out.println("whatever");
                    break;
                case 4:
                    CoffeeBase justCoffeeB = new JustCoffee();
                    CoffeeBase justCoffeeWithWhiteCream = new WhiteCreamCoffeeAddon(justCoffeeB);
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + justCoffeeWithWhiteCream.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + justCoffeeWithWhiteCream.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    break;
                case 5:
                    CoffeeBase justCoffeeBs = new JustCoffee();
                    CoffeeBase justCoffeeWithSuperSugar = new SuperSugar(justCoffeeBs);
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + justCoffeeWithSuperSugar.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + justCoffeeWithSuperSugar.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    break;
                case 6:
                    CoffeeBase whiteCoffeeC = new WhiteCoffee();
                    CoffeeBase whiteCoffeeWithCream = new WhiteCreamCoffeeAddon(whiteCoffeeC);
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + whiteCoffeeWithCream.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + whiteCoffeeWithCream.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    break;
                case 7:
                    CoffeeBase whiteCoffeeSS = new WhiteCoffee();
                    CoffeeBase whiteCoffeeWithSuperSugar = new SuperSugar(whiteCoffeeSS);
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + whiteCoffeeWithSuperSugar.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + whiteCoffeeWithSuperSugar.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    break;
                case 8:
                    CoffeeBase darkCoffeeWC = new DarkCoffee();
                    CoffeeBase DarkCoffeeWithCream = new WhiteCreamCoffeeAddon(darkCoffeeWC);
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + DarkCoffeeWithCream.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + DarkCoffeeWithCream.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    break;
                case 9:
                    CoffeeBase darkCoffeeWS = new DarkCoffee();
                    CoffeeBase darkCoffeeWithSugar = new SuperSugar(darkCoffeeWS);
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + darkCoffeeWithSugar.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + darkCoffeeWithSugar.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    break;
                case 10:
                    CoffeeBase justCoffeeWithDouble = new JustCoffee();
                    CoffeeBase justCoffeeWithDoubleCreamAddon = new WhiteCreamCoffeeAddon(new WhiteCreamCoffeeAddon(justCoffeeWithDouble));
                    System.out.println("==============================");
                    System.out.println("your Order Details : ");
                    System.out.print("your Order : " + justCoffeeWithDoubleCreamAddon.getDescription());
                    System.out.print("\n");
                    System.out.print("total Price : " + justCoffeeWithDoubleCreamAddon.cost() + " $");
                    System.out.print("\n");
                    System.out.println("==============================");
                    break;
                case -1:
                    System.out.println("system shut down ...");
                    break;
                default:
                    System.out.println("you have not pick any of the choices");
                    break;
            }

        } while (userInput != -1);

    }

}