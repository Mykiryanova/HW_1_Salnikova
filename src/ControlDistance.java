public class ControlDistance {
    int finish;
// Зададим переменную, в которой будем указывать расстояние, которое необходимо пройти

    public ControlDistance(int finish){
        this.finish = finish;
    }
    // Метод, который выводит расстояние, которое нужно пройти
    public void showDistance() { System.out.println("Нужно преодолеть дистанцию " + finish +" километров!");
    }
}
