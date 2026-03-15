package _40_StackTraceElementClass;
/*
Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari StackTraceElement object
StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error
Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi
Cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk memprint ke console detail error StackTraceElement nya
 */
public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names = {
                    "Permana", "Surya", "Dharma"
            };
            System.out.println(names[100]);
        }catch (Throwable throwable){
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}
