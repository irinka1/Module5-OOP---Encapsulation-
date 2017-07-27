import DZ5.CarDoor;
import DZ5.CarWheel;
import DZ5.Car;

import java.util.Scanner;

public class OOP {

    public static void main(String[] args) {
        CarWheel wheel1 = new CarWheel();
        Car car1 = new Car("12/05/2017","electric", 100, 15, 8, 1,50);

        wheel1.steretWheel(15);
        wheel1.infoWheel();
        car1.infoCar();



    }

}
