package ss10.bai_tap.lesson4.view;

import ss10.bai_tap.lesson4.entity.Motorbike;
import ss10.bai_tap.lesson4.untils.InputUntil;

import java.util.List;

public class MotorbikeView {
    public static void displayList(List<Motorbike> motorbikes) {
        System.out.println("------ Chức năng danh sách xe máy ------");
        System.out.printf("%-5s %-20s %-20s %-15s %-20s %-15s%n", "STT", "BIỂN KIỂM SOÁT", "HÃNG SẢN XUẤT", "NĂM SX", "CHỦ SỞ HỮU", "CÔNG XUẤT");
        if (motorbikes.isEmpty()) {
            System.out.println("------ Danh sách trống ------");
        }else {
            for (int i = 0; i < motorbikes.size(); i++) {
                System.out.printf("%-5s %-20s %-20s %-15s %-20s %-15s%n", i + 1, motorbikes.get(i).getLicensePlate(), motorbikes.get(i).getManufacturerName(), motorbikes.get(i).getYearOfManufacture(), motorbikes.get(i).getOwnerName(), motorbikes.get(i).getPower());
            }
        }
    }

    public static Motorbike inputNewData() {
        System.out.println("------ Chức năng thêm mới xe máy ------");
        String licensePlate = InputUntil.inputString("Nhập biển kiểm soát: ");
        String manufacturerName = InputUntil.selectManufacturerName();
        int yearOfManufacture = InputUntil.inputInt("Nhập năm sản xuất: ");
        String ownerName = InputUntil.inputString("Nhập chủ sở hữu: ");
        int power = InputUntil.inputInt("Nhập công xuất: ");
        return new Motorbike(licensePlate, manufacturerName, yearOfManufacture, ownerName, power);
    }

    public static Motorbike editData() {
        System.out.println("------ Chức năng cập nhật thông tin xe máy ------");
        String licensePlate = InputUntil.inputString("Nhập biển kiểm soát: ");
        String newManufacturerName = InputUntil.selectManufacturerName();
        int newYearOfManufacture = InputUntil.inputInt("Nhập năm sản xuất: ");
        String newOwnerName = InputUntil.inputString("Nhập chủ sở hữu: ");
        int newPower = InputUntil.inputInt("Nhập công xuất: ");
        return new Motorbike(licensePlate, newManufacturerName, newYearOfManufacture, newOwnerName, newPower);
    }

    public static String deleteData() {
        System.out.println("------ Chức năng xoá xe máy ------");
        return InputUntil.inputString("Nhập biển kiểm soát: ");
    }
}
