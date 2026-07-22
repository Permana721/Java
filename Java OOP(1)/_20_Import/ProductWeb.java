package _20_Import;
/**
 * Import adalah kemampuan untuk menggunakan class yang berada di package yang berbeda
 * Syarat class yang bisa digunakan jika package nya berbeda adalah class yang harus public
 */

import _19_AccessModifiers.*; // Ini adalah contoh penggunaan Import

public class ProductWeb {
    static void main(String[] args) {
        Product product = new Product();
        // product.name = "Mie Sedap"; error, karena beda package
        // product.price = 3100; error, karena beda package
    }
}
