package _02_GenericClass;
/*
Generic class adalah class atau interface yang memiliki parameter type
Tidak ada ketentuan dalam pembuatan generic parameter type, namun biasanya kebanyakan orang menggunakan 1 karakter sebagai generic parameter type
Nama generic parameter type yang biasa digunakan adalah :
E - Element (biasa digunakan di collection atau struktur data)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
 */
public class MyData<T> {
    private T data;

    public MyData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
}
