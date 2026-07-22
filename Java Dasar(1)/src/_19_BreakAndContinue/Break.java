package _19_BreakAndContinue;
/*
Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
artinya, jika kita menggunakan break di dalam perulangan, maka perulangan akan berhenti dan tidak akan melakukan perulangan lagi, walaupun kondisi perulangan masih terpenuhi
 */
public class Break {
    public static void main(String[] args) {
        var counter = 1;

        while (true){
            System.out.println("Perulangan ke " + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }

        System.out.println("Perulangan berhenti");
    }
}
