package _02_Membuat_Lambda;

public class SimpleActionApp {
    static void main(String[] args) {
//        // Menggunakan anonymous function
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Permana";
//            }
//        };
//
//        System.out.println(simpleAction1.action("Permana"));
//
//        // Dengan Lambda
//        SimpleAction simpleAction2 = (name) -> {
//          return "Surya";
//        };
//
//        System.out.println(simpleAction2.action("Permana"));

        SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = (String value) -> "Hello " + value;

        SimpleAction simpleAction4 = (value) -> "Hello " + value;

        SimpleAction simpleAction5 = value -> "Hello " + value;
    }

}
