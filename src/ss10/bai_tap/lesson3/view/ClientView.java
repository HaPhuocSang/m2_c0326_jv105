package ss10.bai_tap.lesson3.view;

import ss10.bai_tap.lesson3.entity.Client;
import ss10.bai_tap.lesson3.untils.InputUntil;

import java.util.List;

public class ClientView {
    public static void displayList(List<Client> clients) {
        System.out.println("------ Chức năng danh sách ------");
        System.out.printf("%-5s %-10s %-20s %-20s%n", "STT", "ID", "NAME", "ADDRESS");
        if (clients.isEmpty()) {
            System.out.println("------ Danh sách trống ------");
        }else {
            for (int i = 0; i < clients.size(); i++) {
                System.out.printf("%-5d %-10d %-20s %-20s%n", i + 1, clients.get(i).getId(), clients.get(i).getName(), clients.get(i).getAddress());
            }
        }
    }
    public static Client inputNewData() {
        System.out.println("------ Chức năng Thêm mới ------");
        int id = InputUntil.inputInt("Nhập id: ");
        String name = InputUntil.inputString("Nhập tên: ");
        String address = InputUntil.inputString("Nhập địa chỉ: ");
        return new Client(id, name, address);
    }

    public static Client editData() {
        System.out.println("------ Chức năng sửa ------");
        int idEdit = InputUntil.inputInt("Nhập id: ");
        String newName = InputUntil.inputString("Nhập tên: ");
        String newAddress = InputUntil.inputString("Nhập địa chỉ: ");
        return new Client(idEdit, newName, newAddress);
    }

    public static int deleteData() {
        System.out.println("------ Chức năng xoá ------");
        return InputUntil.inputInt("Nhập id: ");
    }

    public static String searchName() {
        System.out.println("------ Chức năng tìm kiếm ------");
        return InputUntil.inputString("Nhập tên: ");
    }
}
