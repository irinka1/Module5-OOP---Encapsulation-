package DZ5;




public class CarDoor {
    private boolean door;   ///начальное положение двери - закрыта
    private boolean window;

    public CarDoor() {
        this.door = true;   ///начальное положение окна - закрыто
        this.window = true;

    }

    public void openDoor() {    //открыть дверь
        if (door) {
            System.out.println("Дверь открыли");
            door = false;
        }
    }


    public void closeDoor() {//закрыть дверь
        if (door = false) {
            System.out.println("Дверь закрыли");
            door = true;

        }
    }


    public void checkDoor() {    //открыть/закрыть дверь
        //(если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
        if (door) {
            System.out.println("Открыть закрытую дверь");
            door = false;

        } else {

            System.out.printf("Закрыть открытую дверь");
            door = true;
        }
    }

    public void openWindow() {
        if (window) {
            System.out.println("Открыть окно");
            window=false;

        }
    }

    public void closeWindow() {
        if (window = false) {
            System.out.println("Закрыть окно");

        }

    }

    //открыть/закрыть окно(если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
    public void checkWindow() {
        if (window = true) {
            System.out.println("необходимо открыть закрытое окно");
            window = false;
        } else {
            System.out.println("Необходимо зарыть открытое окно");
            window = true;

        }
    }

    //Вывести в консоль данные об объекте
    public void infoDoor() {
        if (door = true) {
            System.out.println("Дверь закрыта");
        } else {
            System.out.println("Дверь открыта");
        }
    }

    public void infoWindow() {
        if (window = true) {
            System.out.println("Окно закрыто");
        } else {
            System.out.println("Окно открыто");
        }
    }
}


