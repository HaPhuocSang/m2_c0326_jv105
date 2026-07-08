package ss4.thuc_hanh.quan_ly_hoc_sinh.view;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Student;
import ss4.thuc_hanh.quan_ly_hoc_sinh.untils.InputUntil;

public class StudentView {
    public static void displayList(Student[] students) {
        System.out.println("------ Chức năng danh sách ------");
        System.out.printf("%-5s %-10s %-20s %-20s%n", "STT", "ID", "NAME", "ADDRESS");
        for (int i = 0; i < students.length; i++) {
            if (students[0] == null) {
                System.out.println("------ Danh sách trống ------");
                break;
            }
            if (students[i] != null) {
                System.out.printf("%-5d %-10d %-20s %-20s%n", i + 1, students[i].getId(), students[i].getName(), students[i].getAddress());
            } else {
                break;
            }
        }
    }

    public static Student inputNewData() {
        System.out.println("------ Chức năng Thêm mới ------");
        int id = InputUntil.inputInt("Nhập id: ");
        String name = InputUntil.inputString("Nhập tên: ");
        String address = InputUntil.inputString("Nhập địa chỉ: ");
        return new Student(id, name, address);
    }

    public static Student editData() {
        System.out.println("------ Chức năng sửa ------");
        int idEdit = InputUntil.inputInt("Nhập id: ");
        String newName = InputUntil.inputString("Nhập tên mới: ");
        String newAddress = InputUntil.inputString("Nhập địa chỉ mới: ");
        return new Student(idEdit, newName, newAddress);
    }

    public static int deleteData() {
        System.out.println("------ Chức năng xoá ------");
        return InputUntil.inputInt("Nhập id: ");
    }
}
