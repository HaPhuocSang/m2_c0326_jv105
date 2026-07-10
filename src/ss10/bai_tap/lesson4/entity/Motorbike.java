package ss10.bai_tap.lesson4.entity;

public class Motorbike extends Vehicle{
    private int power;

    public Motorbike() {
    }

    public Motorbike(String licensePlate, String manufacturerName, int yearOfManufacture, String ownerName, int power) {
        super(licensePlate, manufacturerName, yearOfManufacture, ownerName);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motorbike{" + super.toString() + "power=" + power + '}';
    }
}
