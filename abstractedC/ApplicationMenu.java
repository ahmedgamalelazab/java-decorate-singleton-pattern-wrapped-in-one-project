package abstractedC;

import java.util.ArrayList;

public class ApplicationMenu {

    //section of data

    protected ArrayList<String>applicationMenu; // will work as state of my menu

    protected ArrayList<String>initialState; // this will work as initial state of my menu

    public ArrayList<String>getApplicationMenu(){
        return this.applicationMenu;
    }

    public void setApplicationMenu(ArrayList<String>appMenu){
        this.applicationMenu = appMenu;
    }

}

