package _03_Java_Util_Function;

import java.util.function.Consumer;

public class ConsumerApp {
    static void main(String[] args) {
//        Dengan Lambda
        Consumer<String> consumer = value -> System.out.println(value);

//        Anonymous Function 
        Consumer<String> consumer1 = new Consumer<String>() {
            public void accept(String value) {
                System.out.println(value);
            }
        };
    }
}
