package ss4.thuc_hanh.quan_ly_hoc_sinh;

import java.util.Scanner;

public class Menu {
    StudentManager studentManager = new StudentManager();
    public  void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("""
                ======== Quản lý sinh viên =========
                 1. Danh sách
                 2. Thêm mới
                 3. Sửa
                 4. Xoá
                 5. Thoát
            """);
            int choice = StudentManager.inputInt(scanner,"------ Chọn chức năng ------");
            switch (choice) {
                case 1:
                    System.out.println("------ Chức năng danh sách ------");
                    studentManager.showList();
                    break;
                case 2:
                    System.out.println("------ Chức năng Thêm mới ------");
                    int id = StudentManager.inputInt(scanner, "Nhập id: ");
                    if (studentManager.checkId(id)) {
                        System.out.println("------ Id đã tồn tại! ------");
                        break;
                    }
                    String name = StudentManager.inputString(scanner, "Nhập tên: ");
                    String address = StudentManager.inputString(scanner, "Nhập địa chỉ: ");
                    Student newStudent = new Student(id,name,address);
                    studentManager.addNew(newStudent);
                    break;
                case 3:
                    System.out.println("------ Chức năng sửa ------");
                    int idEdit = StudentManager.inputInt(scanner, "Nhập id cần sửa: ");
                    if (!studentManager.checkId(idEdit)) {
                        System.out.println("------ Id không tồn tại! ------");
                        break;
                    }
                    String newName = StudentManager.inputString(scanner, "Nhập tên mới: ");
                    String newAddress = StudentManager.inputString(scanner, "Nhập địa chỉ mới: ");
                    studentManager.updateStudent(idEdit, newName, newAddress);
                    break;
                case 4:
                    System.out.println("------ Chức năng xoá ------");
                    int idOld = StudentManager.inputInt(scanner, "Nhập id: ");
                    studentManager.deleteStudent(idOld);
                    break;
                case 5:
                    isContinue = false;
                    break;
                default:
                    System.out.println("------ Không có chức năng này! ------");
            }
        }
    }
}
