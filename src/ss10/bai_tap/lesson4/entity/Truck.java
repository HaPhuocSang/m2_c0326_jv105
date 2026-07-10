package ss10.bai_tap.lesson4.entity;

public class Truck extends Vehicle{
    private int payload;

    public Truck() {
    }

    public Truck(String licensePlate, String manufacturerName, int yearOfManufacture, String ownerName, int payload) {
        super(licensePlate, manufacturerName, yearOfManufacture, ownerName);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() + "payload=" + payload + '}';
    }
}
