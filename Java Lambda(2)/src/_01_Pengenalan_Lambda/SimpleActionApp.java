package _01_Pengenalan_Lambda;
/*
Lambda berasal dari lambda calculus, yang mengacu pada anonymous function (function tanpa nama)
Tapi, di Java, function/method tidak bisa berdiri sendiri.
Jadi kemungkinan pada prakteknya, lambda di Java dan di bahasa pemrograman lain akan berbeda

Di Java kita hanya mengenal Anonymous Class
Lambda di Java sebenarnya adalah versi sederhana membuat sebuah anonymous class



 */
public class SimpleActionApp {
    static void main(String[] args) {
        // Menggunakan anonymous function
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Permana";
            }
        };

        System.out.println(simpleAction1.action());

        // Dengan Lambda
        SimpleAction simpleAction2 = () -> {
          return "Surya";
        };

        System.out.println(simpleAction2.action());
    }

}
