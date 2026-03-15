package programmer.zaman.now.application;

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
