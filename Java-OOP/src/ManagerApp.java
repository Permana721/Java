public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Permana");
        manager.sayHello("Surya");

        var vp = new VicePresident("Arido");
        vp.sayHello("Shifuka");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}