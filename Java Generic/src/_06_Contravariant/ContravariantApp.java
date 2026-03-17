package _06_Contravariant;
import _02_GenericClass.MyData;
/*
Contravariant memungkinkan generic menerima supertype dari suatu tipe,
aman untuk operasi write, tetapi saat read hanya bisa diperlakukan sebagai Object.
Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci (? super SubClass)
Artinya saat kita membuat object Contoh<Object>, maka bisa disubtitusi menjadi Contoh<? super String>
 */
public class ContravariantApp {
    static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Permana");
//        objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData){
        Object value = myData.getData();
        System.out.println("Process parameter " + value);

//        myData.setData("Permana Surya");
    }
}
