package _09_TypeErasure;
import _02_GenericClass.MyData;
/*
Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime
Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di compile menjadi binary file
Compiler akan mengubah generic parameter type menjadi tipe Object di Java
 */
public class TypeErasureApp {
    static void main(String[] args) {
        MyData myData = new MyData("Permana");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
