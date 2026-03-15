package _01_StringClass;
/*
Seperti yang pernah dibahas di materi Java Dasar, String adalah object, artinya dia memiliki representasi class nya
Ada banyak sekali method yang bisa kita gunakan di String, kita bisa melihat detail method apa aja yang tersedia di halaman dokumentasi javadoc nya
 */
public class StringApp {
    static void main(String[] args) {
        String name = "Permana Surya Dharma";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Permana"));
        System.out.println(name.endsWith("Dharma"));

        String[] names = name.split(" ");
        for (var value : names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
    }
}
