package _02_GenericClass;

public class GenericClassApp {
    static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Permana");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        String integerValue = String.valueOf(integerMyData.getData());

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
