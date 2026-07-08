package ss4.thuc_hanh.quan_ly_hoc_sinh.repository.student;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Student;

public class StudentRepository implements IStudentRepository {

    private final static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "chánh", "DN");
        students[1] = new Student(2, "chánh2", "DN");
        students[2] = new Student(3, "chánh3", "DN");
    }

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public void edit(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == newStudent.getId()) {
                students[i] = newStudent;
                break;
            }
        }
    }

    @Override
    public void delete(int index) {
        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        students[students.length - 1] = null;
    }
}
