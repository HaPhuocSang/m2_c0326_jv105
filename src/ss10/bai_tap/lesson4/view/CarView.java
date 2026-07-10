package ss10.bai_tap.lesson4.view;

import ss10.bai_tap.lesson4.entity.enums.CarType;
import ss10.bai_tap.lesson4.untils.InputUntil;
import ss10.bai_tap.lesson4.entity.Car;

import java.util.List;

public class CarView {
    public static void displayList(List<Car> cars) {
        System.out.println("------ Chức năng danh sách xe ô tô ------");
        System.out.printf("%-5s %-20s %-20s %-15s %-20s %-20s %-15s%n", "STT", "BIỂN KIỂM SOÁT", "HÃNG SẢN XUẤT", "NĂM SX", "CHỦ SỞ HỮU", "KIỂU XE", "SỐ CHỖ NGỒI");
        if (cars.isEmpty()) {
            System.out.println("------ Danh sách trống ------");
        }else {
            for (int i = 0; i < cars.size(); i++) {
                System.out.printf("%-5s %-20s %-20s %-15s %-20s %-20s %-15s%n", i + 1, cars.get(i).getLicensePlate(), cars.get(i).getManufacturerName(), cars.get(i).getYearOfManufacture(), cars.get(i).getOwnerName(), cars.get(i).getCarType().getName(), cars.get(i).getNumberOfSeats());
            }
        }
    }
    public static Car inputNewData() {
        System.out.println("------ Chức năng thêm mới xe ô tô ------");
        String licensePlate = InputUntil.inputString("Nhập biển kiểm soát: ");
        String manufacturerName = InputUntil.selectManufacturerName();
        int yearOfManufacture = InputUntil.inputInt("Nhập năm sản xuất: ");
        String ownerName = InputUntil.inputString("Nhập chủ sở hữu: ");
        int numberOfSeats = InputUntil.inputInt("Nhập số chỗi ngồi: ");
        CarType carType = InputUntil.selectCarType();
        return new Car(licensePlate, manufacturerName, yearOfManufacture, ownerName, numberOfSeats, carType);
    }
    public static Car editData() {
        System.out.println("------ Chức năng cập nhật thông tin xe ô tô ------");
        String licensePlate = InputUntil.inputString("Nhập biển kiểm soát: ");
        String newManufacturerName = InputUntil.selectManufacturerName();
        int newYearOfManufacture = InputUntil.inputInt("Nhập năm sản xuất: ");
        String newOwnerName = InputUntil.inputString("Nhập chủ sở hữu: ");
        int newNumberOfSeats = InputUntil.inputInt("Nhập số chỗi ngồi: ");
        CarType newCarType = InputUntil.selectCarType();
        return new Car(licensePlate, newManufacturerName, newYearOfManufacture, newOwnerName, newNumberOfSeats, newCarType);
    }
    public static String deleteData() {
        System.out.println("------ Chức năng xoá xe ô tô ------");
        return InputUntil.inputString("Nhập biển kiểm soát: ");
    }
}
