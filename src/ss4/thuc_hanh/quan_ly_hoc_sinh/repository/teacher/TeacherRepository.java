package ss4.thuc_hanh.quan_ly_hoc_sinh.repository.teacher;

import ss4.thuc_hanh.quan_ly_hoc_sinh.entity.Teacher;

public class TeacherRepository implements ITeacherRepository {
    private final static Teacher[] teachers = new Teacher[100];

    static {
        teachers[0] = new Teacher(1, "Teacher 1", "DN", 20000000);
        teachers[1] = new Teacher(2, "Teacher 2", "DN", 10000000);
        teachers[2] = new Teacher(3, "Teacher 3", "DN", 10000000);
    }

    @Override
    public Teacher[] findAll() {
        return teachers;
    }

    @Override
    public void add(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }
    }

    @Override
    public void edit(Teacher newTeacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getId() == newTeacher.getId()) {
                teachers[i] = newTeacher;
                break;
            }
        }
    }

    @Override
    public void delete(int index) {
        for (int i = index; i < teachers.length - 1; i++) {
            teachers[i] = teachers[i + 1];
        }
        teachers[teachers.length - 1] = null;
    }
}
