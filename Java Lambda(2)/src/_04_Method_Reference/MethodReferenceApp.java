package _04_Method_Reference;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    static void main(String[] args) {
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase; // Method Reference

        System.out.println(predicateIsLowerCase.test("permana"));
        System.out.println(predicateIsLowerCase.test("Permana"));

        // Method Reference di Parameter
//        Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

    }

    public void run(){
        Predicate<String> predicateIsLowerCase = this::isLowerCase;
        System.out.println(predicateIsLowerCase.test("permana"));
        System.out.println(predicateIsLowerCase.test("Permana"));
    }

    public void run2(){
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase;
        System.out.println(predicateIsLowerCase.test("permana"));
        System.out.println(predicateIsLowerCase.test("Permana"));
    }


    public boolean isLowerCase(String value){
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
