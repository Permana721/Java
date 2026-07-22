package _26_DefaultMethod;

public class Avanza implements Car, isMaintenance {

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }

    public void drive() {
        System.out.println("Avanza is driving...");
    }

    public int getTire(){
        return 4;
    }
}
