package _02_GenericClass;

public class PairApp {
    static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(100, "Permana");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
