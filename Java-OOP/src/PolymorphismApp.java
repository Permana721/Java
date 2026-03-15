public class PolymorphismApp {
    static void main(String[] args) {
        Employee employee = new Employee("Permana");
        employee.sayHello("Surya");

        employee = new Manager("Arido");
        employee.sayHello("Shifuka");

        employee = new VicePresident("Purbo");
        employee.sayHello("Ruto");

        sayHello(new Employee("Kurosaki"));
        sayHello(new Employee("Katan"));
        sayHello(new Employee("Sabe"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        }  else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }   else {
            System.out.println("Hello " + employee.name);
        }
    }
}
