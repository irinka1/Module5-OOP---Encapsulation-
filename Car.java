//import java.util.ArrayList;

package DZ5;
/*Класс Car.
На прямую к переменным этого класса никто не может, только через методы
        --------------------
        Хранит:
        дата производства (не изменна после создания объекта)
        тип двигателя
        максимальная скорость машины (если она новая)
        время разгона до 100км/ч
        пассажировместимость
        кол-во пасажиров внутри в данный момент
        текущая скорость
        массив колес
        массив дверей

        Конструктор
        --------------------
        Нет пустого конструктора. Так как есть поля в классе, которые нельзя изменять после создания объекта.
        Например дата производства.
        Конструктор с датой производства.
        Конструктор со всеми полями, кроме массива колес и массива дверей.

        Методы
        --------------------
        Изменить текущую скорость
        Посадить 1 пассажира в машину
        Высадить 1 пассажира
        Высадить всех пассажиров
        Получить дверь по индексу
        Получить колесо по индексу
        Снять все колеса с машины
        Установить на машину X новых колесу (в добаков к имеющимся, то есть если было 4 колеса,
        после вызова метода с Х аргументом равным трем, колес будет 4+3=7)

        Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так.
        Максимальная скорость новой машины множиться на самое стертое колесо в машине.
        Максимальная скорость равна 0 если в машине нет ни одного пассажира, так как некому ее вести)

        Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от целостности к
        олес и наличия водителя)

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
    private CarDoor[] cardoors = new CarDoor[4];     //масив з 4 дверей
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

    //Изменить текущую скорость
    public void speedNow(int newSpeed){
        speedNow = newSpeed;
        System.out.println("Теперь текущаю скороть равна = " + speedNow);
    }

    //Посадить 1 пассажира в машину
    public int PassangersPlus(){
        PassangersNow=PassangersNow+1;
        System.out.println("теперь количество пассажиров = "+PassangersNow);
        return PassangersNow;
    }
    // Высадить 1 пассажира
    public int PassangersMinus1(){
        PassangersNow=PassangersNow-1;
        System.out.println("теперь количество пассажиров = "+PassangersNow);
        return PassangersNow;
    }

    //Высадить всех пассажиров
    public int outPassangers(){
        PassangersNow=0;
        System.out.println("Высадили всех пассажиров. Теперь количество пассажиров = "+PassangersNow);
        return PassangersNow;
    }

    // Получить дверь и колесо по индексу
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
    // Снять все колеса с машины
    public void removeWheels(){
        countWheels = 0;
        System.out.println("Все колеса сняты");

    }

    //Установить на машину X новых колесу (в добаков к имеющимся, то есть если было 4 колеса,
    // после вызова метода с Х аргументом равным трем, колес будет 4+3=7)

    public int increseWheel(int w){

        countWheels=countWheels+w;
        System.out.println("Текущее количество колес = " + countWheels);
        return countWheels;

    }

    // Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так.
    // Максимальная скорость новой машины множиться на самое стертое колесо в машине.
    // Максимальная скорость равна 0 если в машине нет ни одного пассажира, так как некому ее вести)
    public void maxSpeed(int samoeStertoe){
        if(PassangersNow > 0) {
            speedNow = maxSpeed * samoeStertoe;
            System.out.println("Максимальная скорость сейчас = " + speedNow);
        }
        else {
            System.out.println("Максимальная скорость равна 0,  так как нет пассажиров");
        }

    }

    //Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от целостности
    // колес и наличия водителя)

    public void infoCar(){
        System.out.println("Дата производства: " +date);
        System.out.println("Тип двигателя: " + type);
        System.out.println("Максимальная скорость новой машины: " + maxSpeed);
        System.out.println("Время разгона до 100км/ч = " + timeToMax);
        System.out.println("Пассажировместимость = " + passangers);
        System.out.println("Кол-во пасажиров внутри в данный момент = " + PassangersNow);
        System.out.println("Текущая скорость = " + speedNow);
    }


}
