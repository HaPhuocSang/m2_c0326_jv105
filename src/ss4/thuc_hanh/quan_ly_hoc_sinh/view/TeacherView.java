package ss4.thuc_hanh.quan_ly_hoc_sinh.view;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Teacher;
import ss4.thuc_hanh.quan_ly_hoc_sinh.untils.InputUntil;

public class TeacherView {
    public static void displayList(Teacher[] teachers) {
        System.out.println("------ Chức năng danh sách ------");
        System.out.printf("%-5s %-10s %-20s %-20s %-20s%n", "STT", "ID", "NAME", "ADDRESS", "SALARY");
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[0] == null) {
                System.out.println("------ Danh sách trống ------");
                break;
            }
            if (teachers[i] != null) {
                System.out.printf("%-5s %-10s %-20s %-20s %-20.0f%n", i + 1, teachers[i].getId(), teachers[i].getName(), teachers[i].getAddress(), teachers[i].getSalary());
            } else {
                break;
            }
        }
    }

    public static Teacher inputNewData() {
        System.out.println("------ Chức năng Thêm mới ------");
        int id = InputUntil.inputInt("Nhập id: ");
        String name = InputUntil.inputString("Nhập tên: ");
        String address = InputUntil.inputString("Nhập địa chỉ: ");
        double salary = InputUntil.inputDouble("Nhập tiền lương: ");
        return new Teacher(id, name, address, salary);
    }

    public static Teacher editData() {
        System.out.println("------ Chức năng sửa ------");
        int idEdit = InputUntil.inputInt("Nhập id: ");
        String newName = InputUntil.inputString("Nhập tên mới: ");
        String newAddress = InputUntil.inputString("Nhập địa chỉ mới: ");
        double newSalary = InputUntil.inputDouble("Nhập tiền lương mới: ");
        return new Teacher(idEdit, newName, newAddress, newSalary);
    }

    public static int deleteData() {
        System.out.println("------ Chức năng xoá ------");
        return InputUntil.inputInt("Nhập id: ");
    }
}
