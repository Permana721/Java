package _12_ExpressionStatementandBlock;
import java.util.Date;

/**
 * Statement bisa dibilang adalah kalimat lengkap dalam bahasa.
 * Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma
 * Ada beberapa jenis statement :
 * Assignment expression
 * Penggunaan ++ dan --
 * Method invocation
 * Object creation expression
 */
public class Statement {
    static void main(String[] args) {
        // assignment statement
        double aValue = 8933.243;
        // increment statement
        aValue++;
        // Method invocation
        System.out.println(aValue);
        // Object creation expression
        Date date = new Date();
    }
}
