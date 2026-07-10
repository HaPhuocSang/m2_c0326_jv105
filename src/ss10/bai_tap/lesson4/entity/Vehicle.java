package ss10.bai_tap.lesson4.entity;

import ss10.bai_tap.lesson4.common.HasLicensePlate;

public abstract class Vehicle implements HasLicensePlate {
    private String licensePlate;
    private String manufacturerName;
    private int yearOfManufacture;
    private String ownerName;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String manufacturerName, int yearOfManufacture, String ownerName) {
        this.licensePlate = licensePlate;
        this.manufacturerName = manufacturerName;
        this.yearOfManufacture = yearOfManufacture;
        this.ownerName = ownerName;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "licensePlate='" + licensePlate + '\'' + ", manufacturerName='" + manufacturerName + '\'' + ", yearOfManufacture=" + yearOfManufacture + ", ownerName='" + ownerName + '\'';
    }
}
