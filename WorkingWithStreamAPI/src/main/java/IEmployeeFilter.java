import java.time.LocalDate;
import java.util.List;

public interface IEmployeeFilter {
    void find3MaxSalaries(List<Employee> employeeList);
    void findWomenWithSpecificBirthdate(List<Employee> employeeList, LocalDate date);
    void printMen(List<Employee> employeeList);
    void printSalariesAsc(List<Employee> employeeList);
    void printUniqueSalaries(List<Employee> employeeList);
}
