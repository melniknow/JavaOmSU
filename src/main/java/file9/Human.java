package file9;

import java.util.Objects;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private int age;
    private Gender gender;

    public Human(String firstName, String lastName, String patronymic, int age, Gender gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setPatronymic(patronymic);
        setAge(age);
        setGender(gender);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(patronymic, human.patronymic) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, patronymic, age, gender);
    }
}
