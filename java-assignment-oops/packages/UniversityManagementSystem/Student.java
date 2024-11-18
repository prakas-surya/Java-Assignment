package university.students;

public class Student {
    private String studentId;
    private String name;
    private String department;

    public Student(String studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId + '\'' +
               ", name='" + name + '\'' +
               ", department='" + department + '\'' +
               '}';
    }
}
