package file9;

import java.util.Objects;

public class Student extends Human {
    private String university;
    private String faculty;
    private String speciality;


    public Student(String firstName, String lastName, String patronymic, int age, Gender gender, String university, String faculty, String speciality) {
        super(firstName, lastName, patronymic, age, gender);
        setUniversity(university);
        setFaculty(faculty);
        setSpeciality(speciality);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(university, student.university) && Objects.equals(faculty, student.faculty) && Objects.equals(speciality, student.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), university, faculty, speciality);
    }
}
