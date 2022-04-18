package com.example.jspclassdemo.controller;

import com.example.jspclassdemo.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeManager {

    private int pageSize = 10;

    List<Employee> employees = new ArrayList<>();

    // Singleton - design pattern
    private static EmployeeManager instance = new EmployeeManager();

    public static EmployeeManager getInstance() {
        return instance;
    }

    public int nextId() {
        return employees.size();
    }

    private EmployeeManager() {
        for (int i = 0; i < 10; i++) {
            employees.add(new Employee(i, "Employee " + i, "Trump", "12345678", "23-22-32", "em@em.com",
                    2323.32, LocalDate.now(), LocalDate.now(), LocalDate.now(),
                    new Department("IT"), new Address("Kingston", "89", "333/2", "-"), new Profession("Java dev"), Gender.MALE ));

        }
    }

    public Employee find(int id){
        Optional<Employee> foundEmployee = employees
                .stream()
                .filter(e -> e.getId() == id)
                .findAny();
        if(foundEmployee.isPresent()){
            return foundEmployee.get();
        } else{
            throw new IllegalArgumentException("Cannot find employee with id=" + id);
        }
    }

    public void create(Employee e) {
        employees.add(e);

    }

    public void update(Employee emp) {
        int index = employees.indexOf(emp);
        employees.set(index, emp);
    }

    public List<Employee> readPage(int page) {
        int to = page * pageSize;
        int from = to - pageSize;
        //???????????????????????????????????????

        return employees.subList(from, to);
    }

    private List<Employee> read() {
        return employees;
    }


    public void delete(int id) {
       for(int i=0; i<employees.size(); i++) {
        //cautam dupa id
           if(employees.get(i).getId() == id) {
               employees.remove(id);
               System.out.println(employees.get(i).getId());
           }
        }

    }

    public List<Employee> find(String query) {
        return employees.stream()
                .filter(e -> e.getFirstName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }

    public int getTotalPages() {

        int numberOfPages = employees.size() / pageSize ;

        int rest = employees.size() % pageSize;
        if( rest > 0 ) {
            numberOfPages ++;
        }
        return numberOfPages;
    }
}
