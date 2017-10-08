//import java.util.ArrayList;

package DZ5;
/*Класс Car.
Directly to the variables of this class, no one can, only through methods
        --------------------
        Stores:
        date of production (not changed after the creation of the object)
        engine's type
        the maximum speed of the machine (if it is new)
        acceleration time up to 100 km / h
        passenger capacity
        number of passengers inside at the moment
        current speed
        wheel array
        door array

       Constructor
        --------------------
        There is no empty constructor. Because there are fields in the class that can not be changed after the object is created.
        For example, the production date.
        Designer with the date of production.
        A constructor with all fields except the array of wheels and the array of doors.

        Methods
        --------------------
        Change the current speed
        To put 1 passenger in the car
        Disembark 1 passenger
        Disembark all passengers
        Get the door by index
        Get the wheel by index
        Remove all wheels from the car
        Install the new wheel on the machine X (in addition to the existing ones, that is, if there were 4 wheels,
        after calling the method with X argument equal to three, the wheel will be 4 + 3 = 7)
       Calculate the current possible maximum speed (The speed of the machine is calculated as follows.
        The maximum speed of the new machine is multiplied by the most worn out wheel in the car.
        The maximum speed is 0 if there is not one passenger in the car, since there is no one to drive it)

        Output to the console data about the object (all fields and the calculated maximum speed, depending on the integrity of the
        oles and driver availability)
        */
import java.util.ArrayList;

public class Car {
    private String date;
    private String type;
    private int maxSpeed;
    private int timeToMax;
    private int passangers;
    private int PassangersNow;
    private int speedNow;
    private CarDoor[] cardoors = new CarDoor[4];     
    private CarWheel[] carwheels = new CarWheel[4];
    private int countWheels;
    private int countDoors;

    public Car(String date){
        this.date = date;
    }

    public Car(String date, String type, int maxSpeed, int timeToMax, int passangers, int PassangersNow, int speedNow){

        this.date = date;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.timeToMax = timeToMax;
        this.passangers = passangers;
        this.PassangersNow = PassangersNow;
        this.speedNow = speedNow;
        this.countWheels=4;
        this.countDoors=4;
    }

    //Change the current speed
    public void speedNow(int newSpeed){
        speedNow = newSpeed;
        System.out.println("Now the current speed is= " + speedNow);
    }

    //To put 1 passenger in the car
    public int PassangersPlus(){
        PassangersNow=PassangersNow+1;
        System.out.println("now the number of passengers = "+PassangersNow);
        return PassangersNow;
    }
    // Out 1 passenger
    public int PassangersMinus1(){
        PassangersNow=PassangersNow-1;
        System.out.println("now the number of passengers = "+PassangersNow);
        return PassangersNow;
    }

    //Out all passengers
    public int outPassangers(){
        PassangersNow=0;
        System.out.println("now the number of passengers = "+PassangersNow);
        return PassangersNow;
    }

    // Get the door and wheel by the index
    public void setCarDoors(){
        for (int i = 0; i < 4; i++){
            cardoors[i] = new CarDoor();
        }
    }

    public void setCarWheels(){
        for (int i=0; i < 4; i++){
            carwheels[i] = new CarWheel();
        }
    }

        public CarDoor getCarDoor(int i) {
            if ((i >= 0) && (i <= 4 - 1)) {
               
            }
            return cardoors[i];
        }

    public CarWheel getCarWheel(int i) {
        if ((i >= 0) && (i <= 4 - 1)) {
           
        } 
        return carwheels[i];
    }
    // Remove all wheels from the car
    public void removeWheels(){
        countWheels = 0;
        System.out.println("Все колеса сняты");

    }

    //Install the new wheel on the machine X (in addition to the existing ones, that is, if there were 4 wheels,
    // after calling the method with X argument equal to three, the wheel will be 4 + 3 = 7)

    public int increseWheel(int w){

        countWheels=countWheels+w;
        System.out.println("Current number of wheels= " + countWheels);
        return countWheels;

    }

    // Calculate the current possible maximum speed (The speed of the machine is calculated as follows.
    // The maximum speed of the new machine is multiplied by the most worn out wheel in the car.
    // The maximum speed is 0 if there is not one passenger in the car, since there is no one to drive it)
    public void maxSpeed(int samoeStertoe){
        if(PassangersNow > 0) {
            speedNow = maxSpeed * samoeStertoe;
            System.out.println("Top speed now = " + speedNow);
        }
        else {
            System.out.println("The maximum speed is 0, since there are no passengers");
        }

    }

    //Output to the console data about the object (all fields and the calculated maximum speed depending on the integrity
    // wheels and driver availability)

    public void infoCar(){
        System.out.println("date of manufacture: " +date);
        System.out.println("engine's type: " + type);
        System.out.println("The maximum speed of a new machine: " + maxSpeed);
        System.out.println("Acceleration time to 100 km / h= " + timeToMax);
        System.out.println("Passenger capacity = " + passangers);
        System.out.println("Number of passengers inside at the moment = " + PassangersNow);
        System.out.println("Current speed = " + speedNow);
    }


}
