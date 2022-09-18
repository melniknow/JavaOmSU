package file6;

public class Student extends Human {
    String facultyName;

    public Student(String name, String lastName, String patronymic, int age, String facultyName) {
        super(name, lastName, patronymic, age);
        setFacultyName(facultyName);
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
