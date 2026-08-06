package _25_MethodOverloading;
/*
Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, enta jumlah atau tipe data parameternya
Jika ada yang sama, maka program Java kita akan error
 */
public class MethodOverloading {
    static void main(String[] args) {
        sayHello();
        sayHello("permana");
        sayHello("Arido", "Shifuka");
    }

    static void sayHello(){ // Tanpa parameter
        System.out.println("Hello World!");
    }

    static void sayHello(String name){ // Dengan parameter name
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName){ // Dengan parameter firstName dan lastName
        System.out.println("Hello " +  firstName + " " + lastName);
    }
}
