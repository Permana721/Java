package _07_BoundedTypeParameter;
/*
Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
Kita bisa menambahkan beberapa bounded type parameter dengan karakter & setelah bounded type pertama
Jika ingin menambahkan lagi, cukup gunakan karakter & diikuti bounded type nya lagi
 */
public class MultipleConstraintApp {
    static void main(String[] args) {
        // Data<Manager> managerData = new Data<>(new Manager()); ERROR Manager tidak implement CanSayHello
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Data(T data) {
            this.data = data;
        }
    }
}
