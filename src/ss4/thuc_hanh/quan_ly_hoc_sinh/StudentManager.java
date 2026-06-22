package ss4.thuc_hanh.quan_ly_hoc_sinh;

import java.util.Scanner;

public class StudentManager {
    Student[] students = new Student[100];

    public void showList() {
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

    public void addNew(Student newStudent) {
        for (Student student : students) {
            if (student != null && student.getId() == newStudent.getId()) {
                System.out.println("------ Id đã tồn tại! ------");
                return;
            }
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    public boolean checkId(int id) {
        int index = -1;
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id){
                index = i;
                break;
            }
        }
        if (index != -1){
            check = true;
        }
        return check;
    }

    public void updateStudent(int id, String newName, String newAddress) {
        for (Student student : students){
            if (student != null && student.getId() == id) {
                student.setName(newName);
                student.setAddress(newAddress);
                break;
            }
        }
        System.out.println("------ Sửa thành công! ------");
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                System.out.println("------ Xóa thành công! ------");
                return;
            }
        }
        System.out.println("------ Không tìm thấy! ------");
    }

    public static int inputInt(Scanner scanner, String message) {
        int value;
        while (true) {
            try {
                System.out.println(message);
                value = Integer.parseInt(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        }
    }

    public static String inputString(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Không được để trống, vui lòng nhập lại!");
        }
    }

}
