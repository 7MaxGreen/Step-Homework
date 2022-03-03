import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gender gender = Gender.NOT_DEFINED;

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add("Felix", 3200, LocalDate.of(1961, 5, 17), gender.MALE);
        employeeList.add("Adam", 2100, LocalDate.of(2000, 3, 27), gender.MALE);
        employeeList.add("Jane", 2100, LocalDate.of(1977, 2, 7), gender.FEMALE);
        employeeList.add("Johana", 1200, LocalDate.of(2004, 1, 17), gender.FEMALE);
        employeeList.add("Elisabeth", 800, LocalDate.of(2005, 12, 22), gender.FEMALE);
        employeeList.add("Kelvin", 5400, LocalDate.of(1998, 11, 17), gender.MALE);

    }
}
