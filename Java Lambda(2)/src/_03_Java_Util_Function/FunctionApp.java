package _03_Java_Util_Function;

import java.util.function.Function;

public class FunctionApp {
    static void main(String[] args) {
        Function<String, Integer> functionLength = value -> value.length();

        System.out.println(functionLength.apply("Permana"));
    }
}
