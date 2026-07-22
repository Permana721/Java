package _37_Exeception;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("Membuat object login request");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
