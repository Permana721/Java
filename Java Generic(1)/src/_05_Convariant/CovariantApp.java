package _05_Convariant;
import _02_GenericClass.MyData;
/*
Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
Caranya agar generic object kita menjadi covariant adalah dengan menggunakan kata kunci (? extends ParentClass)
Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<? extends Object>
Covariant adalah read-only, jadi kita tidak bisa mengubah data generic nya
*/
public class CovariantApp {
    static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Permana");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

        // myData.setData("Permana"); tidak boleh, karena berbahaya
    }
}