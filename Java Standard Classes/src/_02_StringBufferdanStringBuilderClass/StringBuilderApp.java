package _02_StringBufferdanStringBuilderClass;
/*
String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang dilakukan di Java adalah membuat String baru.
Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String,  karena akan memakan memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder
 */
public class StringBuilderApp {
    static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Permana");
        builder.append(" ");
        builder.append("Surya");
        builder.append(" ");
        builder.append("Dharma");

        String name = builder.toString();
        System.out.println(name);
    }
}
