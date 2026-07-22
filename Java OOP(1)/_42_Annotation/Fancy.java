package _42_Annotation;
/*
Annotation adalah menambahkan metadata ke kode program yang kita buat
Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat library / framework
Annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti
Untuk membuat annotation, kita bisa menggunakan kata kunci @interface
Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

    String name();

    String[] tags() default {};

}