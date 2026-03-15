package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;

public class RecordApp {
    static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Permana", "Rahasia");
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Permana"));
        System.out.println(new LoginRequest("Permana", "Rahasia"));
    }
}
