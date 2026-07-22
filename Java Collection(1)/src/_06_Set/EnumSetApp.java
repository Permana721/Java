package _06_Set;
import java.util.EnumSet;
/*
EnumSet adalah Set yang elemen datanya harus Enum
Karena data Enum itu unik, sehingga sangat cocok menggunakan Set dibandingkan List
 */
public class EnumSetApp {
    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    static void main(String[] args) {
        // EnumSet<Gender> genders = EnumSet.allOf(Gender.class); print semua enum
        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE); // Print hanya beberapa dari enum

        for (var gender: genders) {
            System.out.println(gender);
        }
    }
}
