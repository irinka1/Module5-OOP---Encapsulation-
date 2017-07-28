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


    public CarWheel(){
        this.conditionWheel = conditionWheel;
        this.newWheel = true;
        conditionWheel = 1;

    }

    //Сменить шину на новую
    public void changeWheel(){
        if (newWheel=false) {
            System.out.println("необходимо заменить шину на новую");
        }
    }

    //Стереть шину на X%
    public double steretWheel(double persent){

        conditionWheel *= (1 - (persent / 100));
        System.out.println("Наша шина стерта на " + persent+ "% и теперь имеет состояние стертости " + conditionWheel);

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
