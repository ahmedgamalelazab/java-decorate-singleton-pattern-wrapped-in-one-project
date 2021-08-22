package concrete;

import java.util.ArrayList;

import abstractedC.*;

public class applicationMenuSingleton extends ApplicationMenu {

    private static final applicationMenuSingleton instance = new applicationMenuSingleton();

    private applicationMenuSingleton(){
        this.initialState = new ArrayList<String>();
        //some init data
        this.initialState.add("init coffee menu item");
        this.applicationMenu = this.initialState;
    }

    public static applicationMenuSingleton getInstance(){
        return instance;
    }


}
