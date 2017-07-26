package DZ5;
/*Класс CarWheel
На прямую к переменным этого класса никто не может, только через методы
--------------------
Хранит:
Состояние целостности шины (дробное число от 0-стерта до 1-новая)

Конструктор
--------------------
Аналогичный принцип как в классе CarDoor

Методы
--------------------
Сменить шину на новую
Стереть шину на X%
Получить состояние (return)
Вывести в консоль данные об объекте
*/

import java.util.Scanner;

public class CarWheel {

    private double conditionWheel;
    private boolean newWheel;
    private double percent;

    // private double i = 0;
    // double[] array;
    // array = new double[i];
    // for (double i = 0; i < 1; i++) {
    // array[i] = ((int)(Math.random() * 12) - 15);

    public CarWheel(){
        this.conditionWheel = conditionWheel;
        this.newWheel = true; // новая шина
        //this.persent = persent;

    }

    //Сменить шину на новую
    public void changeWheel(){
        if (newWheel=false) {
            System.out.println("необходимо заменить шину на новую");
        }
    }

    //Стереть шину на X%
    public double steretWheel(double persent){
        Scanner sc = new Scanner(System.in);
        System.out.println("на сколько % стереть шину?");
        persent = sc.nextDouble();
        conditionWheel = 1-percent/100;
        System.out.println("Наша шина стерта на " + percent+ "% и теперь имеет состояние стертости " + conditionWheel);

        return conditionWheel;

    }

    //Вывести в консоль данные об объекте

    public void infoWheel(){
        if ( conditionWheel > 0 && conditionWheel <= 1){
            System.out.println("Шина новая, менять не надо.");
        }
        else {
            System.out.println("Шину необходимо заменить.");

        }
    }

}
