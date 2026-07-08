package ss4.thuc_hanh.quan_ly_hoc_sinh.controller;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Student;
import ss4.thuc_hanh.quan_ly_hoc_sinh.service.student.IStudentService;
import ss4.thuc_hanh.quan_ly_hoc_sinh.service.student.StudentService;
import ss4.thuc_hanh.quan_ly_hoc_sinh.untils.InputUntil;
import ss4.thuc_hanh.quan_ly_hoc_sinh.view.StudentView;

import java.util.Scanner;

public class StudentController {
    private final IStudentService studentService = new StudentService();
    private final int DISPLAYLIST = 1;
    private final int ADD = 2;
    private final int EDIT = 3;
    private final int DELETE = 4;
    private final int EXIT = 5;

    public void showMenu() {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("""
                        ======== Quản lý sinh viên =========
                         1. Danh sách
                         2. Thêm mới
                         3. Sửa
                         4. Xoá
                         5. Quay lại
                    """);
            int choice = InputUntil.inputInt("------ Chọn chức năng ------");
            switch (choice) {
                case DISPLAYLIST:
                    Student[] students = studentService.findAll();
                    StudentView.displayList(students);
                    break;
                case ADD:
                    studentService.add(StudentView.inputNewData());
                    break;
                case EDIT:
                    studentService.edit(StudentView.editData());
                    break;
                case DELETE:
                    studentService.delete(StudentView.deleteData());
                    break;
                case EXIT:
                    isContinue = false;
                    break;
                default:
                    System.out.println("------ Không có chức năng này! ------");
            }
        }
    }
}
