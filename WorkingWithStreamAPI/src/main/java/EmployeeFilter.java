import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class EmployeeFilter implements IEmployeeFilter {
    @Override
    public void find3MaxSalaries(List<Employee> employeeList) {
        employeeList.stream().sorted((Employee e1, Employee e2) -> (int) (e2.getSalary() - e1.getSalary()))
                .limit(3).forEach((Employee emp) -> System.out.println("TOP SALARIES: " + emp.getSalary()));
    }


    @Override
    public void findWomenWithSpecificBirthdate(List<Employee> employeeList, LocalDate date) {
        employeeList.stream().filter((Employee emp) -> emp.getGender() == Gender.FEMALE )
                .filter((Employee female) -> female.getBirthdate().isAfter(date))
                .forEach((Employee female) -> System.out.println(female.getName() +" "+ female.getBirthdate()));
    }

    @Override
    public void printMen(List<Employee> employeeList) {
        employeeList.stream().filter((Employee emp) -> emp.getGender() == Gender.MALE)
                .forEach((Employee male) -> System.out.println("MEN: " + male.getName()));
    }

    @Override
    public void printSalariesAsc(List<Employee> employeeList) {
        employeeList.stream().sorted((Employee e1, Employee e2) -> (int) (e1.getSalary() - e2.getSalary()))
                .forEach((Employee e) -> System.out.println("ASC SALARIES: " + e.getSalary()));
    }


    @Override
    public void printUniqueSalaries(List<Employee> employeeList) {
        employeeList.stream().sorted((Employee e1, Employee e2) -> (int) (e1.getSalary() - e2.getSalary()))
                .distinct()
                .forEach((Employee emp) -> System.out.println("Unique salaries: " + emp.getSalary()));
    }


//    @Override
//    public int compare(Employee e1, Employee e2) {
//        return e1.getSalary().compareTo(e2.getSalary());
//    }
}
