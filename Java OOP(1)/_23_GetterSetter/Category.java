package _23_GetterSetter;
/**
 * Di Java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan Getter dan Setter method.
 * Getter adalah function yang dibuat untuk mengambil data field
 * Setter ada function untuk mengubah data field
 */
public class Category {
    private String id;
    private boolean expensive;

    // Getter
    public String getId(){
        return id;
    }

    // Setter (dengan validasi)
    public void setId(String id) {
        if(id != null){
            this.id = id;
        }
    }

    // Getter boolean (pakai "is")
    public boolean isExpensive() {
        return expensive;
    }

    // Setter boolean
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}