package ss10.bai_tap.lesson4.entity.enums;

public enum CarType {
    TOURISM("Xe du lịch"),
    COACH("Xe khách");

    private final String name;

    CarType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
