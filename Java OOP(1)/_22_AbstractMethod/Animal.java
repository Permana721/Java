package _22_AbstractMethod;
/*
Saat kita membuat class yang abstract, kita bisa membuat abstract method juga di dalam class abstract tersebut
Saat kita membuat sebuah abstract method, kita tidak boleh membuat block method untuk method tersebut
Artinya, abstract method wajib di override di class child
Abstract method tidak boleh memiliki access modifier private
 */
public abstract class Animal {
    public String name;
    public abstract void run();
}
