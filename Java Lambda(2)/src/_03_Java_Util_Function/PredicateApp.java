package _03_Java_Util_Function;

import java.util.function.Predicate;

public class PredicateApp {
    static void main(String[] args) {
        Predicate<String> predicateCheckBlank = value -> value.isBlank();

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Permana"));

    }
}
