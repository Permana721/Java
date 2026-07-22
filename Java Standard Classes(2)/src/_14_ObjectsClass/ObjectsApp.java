package _14_ObjectsClass;
import java.util.Objects;
/*
Awas jangan tertukar, ini class Objects, bukan Object
Objects adalah class utility yang berisikan banyak static method yang bisa kita gunakan untuk
operasi object atau melakukan pengecekan sebelum operasi nya dilakukan
 */
public class ObjectsApp {
    public static class Data {
        private String Data;

        public Data(String data) {
            Data = data;
        }

        public String getData() {
            return Data;
        }

        public void setData(String data) {
            this.Data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return Objects.equals(Data, data.Data);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(Data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "Data='" + Data + '\'' +
                    '}';
        }
    }

    static void main(String[] args) {
        execute(new Data("Permana"));
    }

    public static void execute(Data data){
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}
