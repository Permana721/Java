package programmer.zaman.now.application;

import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hallo ");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld Indonesia = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hallo ");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("English");

        Indonesia.sayHello();
        Indonesia.sayHello("Indonesia");
    }
}
