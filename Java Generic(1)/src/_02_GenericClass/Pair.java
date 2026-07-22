package _02_GenericClass;
/*
Parameter type di Generic class boleh lebih dari satu
Namun harus menggunakan nama type berbeda
Ini sangat berguna ketika kita ingin membuat generic parameter type yang banyak
 */
public class Pair<T, U> {
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
