package edu.step.service;

import edu.step.model.Employee;
import java.time.LocalDate;
import java.util.List;
import static edu.step.model.Gender.MALE;
import java.util.stream.Collectors;


public class EmployeeService implements IEmployeeFilters{

    @Override
    public List<String> findMales(List<Employee> employeeList) {
       return employeeList.stream()
               .filter(emp -> emp.getGender() == MALE)
               .map(emp -> emp.getName())
               .collect(Collectors.toList());
    }

    @Override
    public List<String> findNames(List<Employee> employeeList) {
       return employeeList.stream()
                       .map(emp -> emp.getName())
                        .collect(Collectors.toList());
    }

    @Override
    public List<LocalDate> findUniqueBirthdate(List<Employee> employeeList) {
       return employeeList.stream()
                .map((Employee emp) -> emp.getBirthdate())
                .sorted((LocalDate e1, LocalDate e2) -> e1.compareTo(e2)).
                distinct().collect(Collectors.toList());
    }

    @Override
    public List<Employee> findRequestedName(List<Employee> employeeList, String name) {
      return  employeeList.stream().filter(emp -> emp.getName().equals(name))
              .collect(Collectors.toList());
    }

    @Override
    public double calculateAverageSalary(List<Employee> employeeList) {
       double result = employeeList.stream()
                        .map(emp -> emp.getSalary())
                        .reduce(0.0, (Double sum,  Double salary) -> sum += salary);
              return  result / employeeList.size();
    }
}
