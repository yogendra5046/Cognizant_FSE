package Main;
public class App {

    public static void main(String[] args) {

        Engine engine = new Engine();

        Car car = new Car(engine);

        car.drive();
    }

}