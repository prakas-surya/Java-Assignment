package university.faculty;

public class Faculty {
    private String facultyId;
    private String name;
    private String specialization;

    public Faculty(String facultyId, String name, String specialization) {
        this.facultyId = facultyId;
        this.name = name;
        this.specialization = specialization;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Faculty{" +
               "facultyId='" + facultyId + '\'' +
               ", name='" + name + '\'' +
               ", specialization='" + specialization + '\'' +
               '}';
    }
}
