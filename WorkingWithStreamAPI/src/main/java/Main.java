import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Felix", 3200, LocalDate.of(1961, 5, 17), Gender.MALE));
        employeeList.add(new Employee("Adam", 2100, LocalDate.of(2000, 3, 27), Gender.MALE));
        employeeList.add(new Employee("Jane", 2100, LocalDate.of(1977, 2, 7), Gender.FEMALE));
        employeeList.add(new Employee("Johana", 1200, LocalDate.of(2004, 1, 17), Gender.FEMALE));
        employeeList.add(new Employee("Elisabeth", 800, LocalDate.of(2005, 12, 22), Gender.FEMALE));
        employeeList.add(new Employee("Kelvin", 5400, LocalDate.of(1998, 11, 17), Gender.MALE));

        EmployeeFilter filter = new EmployeeFilter();

        filter.find3MaxSalaries(employeeList);
        filter.findWomenWithSpecificBirthdate(employeeList, LocalDate.of(1977, 2, 7));
        filter.printMen(employeeList);
        filter.printSalariesAsc(employeeList);
        filter.printUniqueSalaries(employeeList);

    }
}
