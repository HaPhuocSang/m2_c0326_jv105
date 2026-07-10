package ss10.bai_tap.lesson4.entity;

import ss10.bai_tap.lesson4.entity.enums.CarType;

public class Car extends Vehicle{
    private int numberOfSeats;
    private CarType carType;

    public Car() {
    }

    public Car(String licensePlate, String manufacturerName, int yearOfManufacture, String ownerName, int numberOfSeats, CarType carType) {
        super(licensePlate, manufacturerName, yearOfManufacture, ownerName);
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "numberOfSeats=" + numberOfSeats + ", carType=" + carType + '}';
    }
}
