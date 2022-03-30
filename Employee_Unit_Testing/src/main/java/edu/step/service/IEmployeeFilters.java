package edu.step.service;

import edu.step.model.Employee;

import java.time.LocalDate;
import java.util.List;

public interface IEmployeeFilters {

    List<String>  findMales(List<Employee> employeeList);
    List<String> findNames(List<Employee> employeeList);
    List<LocalDate> findUniqueBirthdate(List<Employee> employeeList);
    List<Employee> findRequestedName(List<Employee> employeeList, String name);
    double calculateAverageSalary(List<Employee> employeeList);
}
