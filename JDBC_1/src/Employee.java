
public class Employee {

    private Integer id;
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
