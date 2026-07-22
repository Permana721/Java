package _23_GetterSetter;

public class Main {
    static void main(String[] args) {
        Category category = new Category();

        // Setter dipanggil
        category.setId("FOOD");
        category.setExpensive(true);

        // Getter dipanggil
        System.out.println(category.getId());        // FOOD
        System.out.println(category.isExpensive());  // true

        // Test validasi
        category.setId(null);

        System.out.println(category.getId()); // tetap FOOD (tidak berubah)
    }
}
