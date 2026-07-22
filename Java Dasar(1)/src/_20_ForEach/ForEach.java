package _20_ForEach;
/*
Kadang kita biasa mengakses data array menggunakann perulangan
Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis

 */
public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Permana", "Surya", "Dharma",
                "Arido", "Shifuka"
        };

        // Tanpa For Each
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        // Dengan For Each
        for(var name : names){
            System.out.println(name);
        }
    }
}
