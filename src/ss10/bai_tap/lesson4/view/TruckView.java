package ss10.bai_tap.lesson4.view;

import ss10.bai_tap.lesson4.entity.Motorbike;
import ss10.bai_tap.lesson4.entity.Truck;
import ss10.bai_tap.lesson4.untils.InputUntil;

import java.util.List;

public class TruckView {
    public static void displayList(List<Truck> trucks) {
        System.out.println("------ Chức năng danh sách xe tải ------");
        System.out.printf("%-5s %-20s %-20s %-15s %-20s %-15s%n", "STT", "BIỂN KIỂM SOÁT", "HÃNG SẢN XUẤT", "NĂM SX", "CHỦ SỞ HỮU", "TẢI TRỌNG");
        if (trucks.isEmpty()) {
            System.out.println("------ Danh sách trống ------");
        }else {
            for (int i = 0; i < trucks.size(); i++) {
                System.out.printf("%-5s %-20s %-20s %-15s %-20s %-15s%n", i + 1, trucks.get(i).getLicensePlate(), trucks.get(i).getManufacturerName(), trucks.get(i).getYearOfManufacture(), trucks.get(i).getOwnerName(), trucks.get(i).getPayload());
            }
        }
    }

    public static Truck inputNewData() {
        System.out.println("------ Chức năng thêm mới xe tải------");
        String licensePlate = InputUntil.inputString("Nhập biển kiểm soát: ");
        String manufacturerName = InputUntil.selectManufacturerName();
        int yearOfManufacture = InputUntil.inputInt("Nhập năm sản xuất: ");
        String ownerName = InputUntil.inputString("Nhập chủ sở hữu: ");
        int payload = InputUntil.inputInt("Nhập tải trọng: ");
        return new Truck(licensePlate, manufacturerName, yearOfManufacture, ownerName, payload);
    }

    public static Truck editData() {
        System.out.println("------ Chức năng cập nhật thông tin xe tải ------");
        String licensePlate = InputUntil.inputString("Nhập biển kiểm soát: ");
        String newManufacturerName = InputUntil.selectManufacturerName();
        int newYearOfManufacture = InputUntil.inputInt("Nhập năm sản xuất: ");
        String newOwnerName = InputUntil.inputString("Nhập chủ sở hữu: ");
        int newPayload = InputUntil.inputInt("Nhập tải trọng: ");
        return new Truck(licensePlate, newManufacturerName, newYearOfManufacture, newOwnerName, newPayload);
    }

    public static String deleteData() {
        System.out.println("------ Chức năng xoá xe tải ------");
        return InputUntil.inputString("Nhập biển kiểm soát: ");
    }
}
