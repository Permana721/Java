package _24_Interface;

public class Avanza implements Car {
    public void drive() {
        System.out.println("Avanza is driving...");
    }

    public int getTire(){
        return 4;
    }
}
