package _31_FinalMethod;
/*
Kata kunci final juga bisa digunakan di Method
Jika sebuah method kita tambahkan kata kunci final, maka artinya method tersebut tidak bisa di override lagi di class child nya
Ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi oleh class child nya
 */
    class SocialMedia {
        String name;
    }

    class Facebook extends SocialMedia {
        final void login(String username, String password) {
//        ISI METHOD
        }
    }

    class FakeFacebook extends Facebook {
//        void login(String username, String password) {} ERROR, tidak bisa override method login karena method login di class Facebook sudah di deklarasikan dengan kata kunci final

    }
