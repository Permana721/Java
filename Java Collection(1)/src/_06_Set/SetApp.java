package _06_Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/*
Set adalah salah satu collection yang berisikan elemen-elemen yang unik, atau tidak boleh duplicate
Set tidak memiliki index seperti di List, oleh karena itu tidak ada jaminan data yang ada di Set itu akan terurut sesuai dengan waktu kita memasukkan data ke Set
Set tidak memiliki method baru, jadi hanya menggunakan method yang ada di interface parent nya, yaitu Collection dan Iterable
Karena tidak memiliki index, untuk mengambil data di Set juga kita harus melakukan iterasi satu per satu
 */
public class SetApp {
    static void main(String[] args) {
//        Set<String> names = new HashSet<>(); Gak peduli urutan (Jadi kemungkinan hasil dari output acak)
        Set<String> names = new LinkedHashSet<>(); //Mengikuti urutan karena menggunakan LinkedList
        names.add("Permana");
        names.add("Permana");
        names.add("Permana");
        names.add("Surya");
        names.add("Surya");
        names.add("Surya");
        names.add("Dharma");
        names.add("Dharma");
        names.add("Dharma");

        for (var name : names){
            System.out.println(name);
        }
    }
}
