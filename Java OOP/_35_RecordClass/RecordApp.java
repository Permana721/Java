package _35_RecordClass;

public class RecordApp {
    static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Permana", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);
    }
}
