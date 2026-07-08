package case_study.entity;

import case_study.entity.enums.RentType;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, RentType rentType, int useCount, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentType, useCount);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() + "roomStandard='" + roomStandard + '\'' + ", numberOfFloors=" + numberOfFloors + '}';
    }
}
