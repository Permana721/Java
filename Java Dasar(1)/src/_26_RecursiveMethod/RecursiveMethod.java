package _26_RecursiveMethod;
/*
Recursive method adalah kemampuan method memanggil method dirinya sendiri
Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial
akan tetapi, kita juga bisa menyelesaikan kasus factorial menggunakan loop, jadi tidak harus menggunakan recursive method, semua tergantung kebutuhan kita
 */
public class RecursiveMethod {
    static void main(String[] args) {
        System.out.println(factorialLoop(10));
        System.out.println(factorialRecursive(10));

        loop(1000000000);
    }

    // Factorial menggunakan Loop
    static int factorialLoop(int value){
        var result = 1;

        for(var counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }

//  Factorial menggunakan Recursive method
    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    /*
    Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
    Jika recursive terlalu dalam, maka  akan ada kemungkinan  terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java
    Kenapa problem ini  bisa terjadi? Karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain,
    maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow
     */
//  Error StackOverflow
    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop ke - " + value);
            loop(value - 1);
        }
    }
}