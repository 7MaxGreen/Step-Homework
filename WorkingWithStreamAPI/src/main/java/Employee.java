import java.time.LocalDate;

public class Employee{

    private String name;
    private Integer salary;
    private LocalDate birthdate;
    private Gender gender;

    public Employee(String name, Integer salary, LocalDate birthdate, Gender gender) {
        this.name = name;
        this.salary = salary;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
