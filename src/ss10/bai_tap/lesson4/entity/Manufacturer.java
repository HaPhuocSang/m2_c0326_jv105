package ss10.bai_tap.lesson4.entity;

public class Manufacturer {
    private String manufacturerId;
    private String manufacturerName;
    private String countryName;

    public Manufacturer() {
    }

    public Manufacturer(String manufacturerId, String manufacturerName, String countryName) {
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
        this.countryName = countryName;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Manufacturer{" + "manufacturerId='" + manufacturerId + '\'' + ", manufacturerName='" + manufacturerName + '\'' + ", countryName='" + countryName + '\'' + '}';
    }
}
