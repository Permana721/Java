package programmer.zaman.now.data;

class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {
//        ISI METHOD
    }
}

class FakeFacebook extends Facebook {
//    void login(String username, String password) {} //ERROR
}