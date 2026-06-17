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
                 3. Xoá
                 4. Thoát
            """);
            System.out.println("-----Chọn chức năng------");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("--- Chức năng danh sách ---");
                    studentManager.showList();
                    break;
                case 2:
                    System.out.println("--- Chức năng Thêm mới ---");
                    System.out.println("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập địa chỉ: ");
                    String address = scanner.nextLine();
                    Student newStudent = new Student(id,name,address);
                    studentManager.addNew(newStudent);
                    break;
                case 3:
                    System.out.println("--- Chức năng xoá ---");
                    System.out.println("Nhập id: ");
                    int idOld = Integer.parseInt(scanner.nextLine());
                    studentManager.deleteStudent(idOld);
                    break;
                case 4:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có chức năng này!");
            }
        }
    }
}
