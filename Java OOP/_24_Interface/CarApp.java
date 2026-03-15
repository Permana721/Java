package _24_Interface;

public class CarApp {
    static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
