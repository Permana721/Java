package programmer.zaman.now.application;

import programmer.zaman.now.data.Avanza;
import programmer.zaman.now.data.Car;

public class CarApp {
    static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}