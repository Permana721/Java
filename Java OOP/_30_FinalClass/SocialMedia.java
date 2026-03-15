package _30_FinalClass;
/*
Sebelumnya kita pernah menggunakan kata kunci final di Java
Jika digunakan di variable, maka variable tersebut tidak bisa berubah lagi datanya
Final pun bisa digunakan di class, dimana jika kita menggunakan kata kunci final sebelum class, maka kita menandakan bahwa class tersebut tidak bisa diwariskan lagi
Secara otomatis semua class child nya akan error, karena class parent nya sudah final, tidak bisa di extend lagi
 */
    class SocialMedia {
        String name;
    }

    final class Facebook extends SocialMedia {
        final void login(String username, String password) {
//        ISI METHOD
        }
    }

//    class FakeFacebook extends Facebook { ERROR, karena Facebook adalah final class, tidak bisa di extend
//    }
