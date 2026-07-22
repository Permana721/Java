package _32_InnerClass;
/*
Di Java, kita bisa membuat class di dalam class, atau disebut dengan Inner Class
Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain
Misal kita perlu membuat class Employee, dimana membutuhkan class Company, maka kita bisa membuat class Employee sebagai inner class Company
Cara membuat inner class, cukup membuatnya di dalam blok class outer class nya
 */
public class Company {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {
        private String name;

        // Mengakses method getName() milik Company, karena Employee adalah inner class dari Company, maka dia bisa mengakses semua member milik Company
        public String getCompany(){
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
