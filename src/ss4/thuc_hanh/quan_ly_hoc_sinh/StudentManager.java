package ss4.thuc_hanh.quan_ly_hoc_sinh;

public class StudentManager {
    Student[] students = new Student[100];

    public void showList() {
        System.out.printf("%-5s %-10s %-20s %-20s%n", "STT", "ID", "NAME", "ADDRESS");
        for (int i = 0; i < students.length; i++) {
            if (students[0] == null) {
                System.out.println("---Danh sách trống---");
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
                System.out.println("Id đã tồn tại!");
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

    public void deleteStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                System.out.println("Xóa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }
}
