package case_study.entity;

import case_study.entity.enums.RentType;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double usableArea;
    private double rentalCost;
    private int maxPeople;
    private RentType rentType;
    private int useCount;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, RentType rentType, int useCount) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.useCount = useCount;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public int getUseCount() {
        return useCount;
    }

    public void setUseCount(int useCount) {
        this.useCount = useCount;
    }

    @Override
    public String toString() {
        return "serviceCode='" + serviceCode + '\'' + ", serviceName='" + serviceName + '\'' + ", usableArea=" + usableArea + ", rentalCost=" + rentalCost + ", maxPeople=" + maxPeople + ", rentType=" + rentType + ", useCount=" + useCount;
    }
}
