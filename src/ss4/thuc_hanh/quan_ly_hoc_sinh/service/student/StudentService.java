package ss4.thuc_hanh.quan_ly_hoc_sinh.service.student;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Student;
import ss4.thuc_hanh.quan_ly_hoc_sinh.repository.student.IStudentRepository;
import ss4.thuc_hanh.quan_ly_hoc_sinh.repository.student.StudentRepository;

public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository = new StudentRepository();
    private final Student[] students = studentRepository.findAll();

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public void add(Student student) {
        if (checkId(student.getId())) {
            System.out.println("------ Id đã tồn tại! ------");
            return;
        }
        studentRepository.add(student);
        System.out.println("------ Thêm thành công! ------");
    }

    @Override
    public void edit(Student newStudent) {
        if (!checkId(newStudent.getId())) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        studentRepository.edit(newStudent);
        System.out.println("------ Sửa thành công! ------");
    }

    @Override
    public void delete(int id) {
        if (!checkId(id)) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        studentRepository.delete(findIndex(id));
        System.out.println("------ Xóa thành công! ------");
    }

    public boolean checkId(int id) {
        for (Student student : students) {
            if ((student != null) && (student.getId() == id)) {
                return true;
            }
        }
        return false;
    }

    public int findIndex(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
