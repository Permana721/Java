package _24_MethodVariableArgument;
/*
Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
 */
public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {50, 50, 50, 50, 50};
        sayCongrats("Permana", values);

        sayCongrats("Surya", 80, 80, 80, 80, 80);
    }

    static void sayCongrats(String name, int... values /* Contoh Variable Argument */){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }
}
