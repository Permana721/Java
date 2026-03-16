package _10_ComparableInterface;
/*
Sebelumnya kita sudah tahu bahwa operator perbandingan object menggunakan method equals
Bagaimana dengan operator perbandingan lainnya? Seperti kurang dari atau lebih dari?
Operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic Comparable
Ini banyak sekali digunakan seperti untuk proses pengurutan data misalnya
 */
public class Person implements Comparable<Person>{
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
