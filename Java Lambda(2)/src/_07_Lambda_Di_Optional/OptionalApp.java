package _07_Lambda_Di_Optional;

import java.util.Locale;
import java.util.Optional;

public class OptionalApp {
    static void main(String[] args) {
        String name = "Permana";

        sayHello(name);
    }

    public static void sayHello(String name){
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(value -> System.out.println("HELLO " + value),
                        () -> System.out.println("HELLO"));

//        Optional<String> optionalName = Optional.ofNullable(name);
//
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//
//       optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + name));
    }
}
