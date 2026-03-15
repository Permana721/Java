package _12_UUIDClass;
import java.util.UUID;
/*
Saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique, misal untuk kebutuhan data primary key misalnya
Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier.
UUID adalah format standard untuk membuat unique value yang telah terjamin
 */
public class UUIDApp {
    static void main(String[] args) {
        for (var i = 0; i < 100; i++){
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }
    }
}
