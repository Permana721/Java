package _17_VariableHiding;

public class ParentApp {
    static void main(String[] args) {
        Child child = new Child();
        child.childName = "Permana";
        child.doIt();
        System.out.println(child.childName);

        Parent parent = new Parent();
        parent.name = "Arido";
        parent.doIt();
        System.out.println(parent.name);
    }
}