package _16_ForLoop;
/*
For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi
 */
public class ForLoop {
    static void main(String[] args) {
        for(var counter = 1; counter <= 10 ;counter++){
            System.out.println("Perulangan ke " + counter);
        }
//        {
//            for(;;){
//                System.out.println("Perulangan tanpa henti");
//            }
//        }
    }
}
