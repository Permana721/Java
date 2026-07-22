package _36_EnumClass;

public enum Level {
    STANDARD("Standard Edition"),
    PREMIUM("Premium Edition"),
    VIP("VIP Edition");

    private String description;

    Level(String description){
        this.description = description;
    }
}
