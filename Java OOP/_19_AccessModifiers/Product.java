package _19_AccessModifiers;
/**
 * Access modifier adalah kemampuan membuat class, field, method dan constructor dapat diakses dari mana saja
 * Sebelumnya teman-teman sudah melihat 2 access modifier, yaitu public dan default (no-modifier)
 */
public class Product {
    protected String name;
    protected int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}