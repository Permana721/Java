package _04_Invariant;
import _02_GenericClass.MyData;
/*
Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah invariant
Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
Artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Object>, begitupun sebaliknya, saat membuat object Contoh<Object>, maka tidak sama dengan Contoh<String>
 */
public class InvariantApp {
    static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Permana");
        // doIt(stringMyData); ERROR
        // MyData<Object> objectMyData = stringMyData; ERROR

        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; ERROR
//        doItInteger(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData){
        // Do nothing
    }

    public static void doItInteger(MyData<Object> objectMyData){
        // Do nothing
    }
}
