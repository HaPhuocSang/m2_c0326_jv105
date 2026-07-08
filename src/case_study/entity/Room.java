package case_study.entity;

import case_study.entity.enums.RentType;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, RentType rentType, int useCount, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentType, useCount);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() + "freeService='" + freeService + '\'' + '}';
    }
}
