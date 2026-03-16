package _02_GenericClass;

public class PairApp {
    static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Permana", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
