package DZ5;
/ * CarWheel class
Directly to the variables of this class, no one can, only through methods
--------------------
Stores:
Bus integrity status (fractional number from 0-erased to 1-new)

Constructor
--------------------
A similar principle as in the CarDoor class

Methods
--------------------
Change the bus to a new one
Erase the tire by X%
Get the state (return)
Display information about the object in the console
* /

import java.util.Scanner;

public class CarWheel {

    private double conditionWheel;
    private boolean newWheel;


    public CarWheel(){
        this.conditionWheel = conditionWheel;
        this.newWheel = true;
        conditionWheel = 1;

    }

    //Сменить шину на новую
    public void changeWheel(){
        if (newWheel=false) {
            System.out.println("It is necessary to replace the wheel with a new one");
        }
    }

    //Стереть шину на X%
    public double steretWheel(double persent){

        conditionWheel *= (1 - (persent / 100));
        System.out.println("Our tire is worn out on" + persent+ "% and now has a state of erasure " + conditionWheel);

        return conditionWheel;

    }

    //Display information about the object in the console
    public void infoWheel(){
        if ( conditionWheel > 0 && conditionWheel <= 1){
            System.out.println("The tire is new, it is not necessary to change.");
        }
        else {
            System.out.println("The tire must be replaced.");

        }
    }

}
