package edu.step.service;
import edu.step.model.Employee;
import edu.step.model.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class EmployeeServiceTest {

    EmployeeService service = new EmployeeService();

    static List<Employee> employeeTest = new ArrayList<>();


    @BeforeAll
    public static void ListInit(){
        employeeTest.add(new Employee(1, "Joe", LocalDate.of(1961, 5, 17), Gender.MALE, 2300.4343));
        employeeTest.add(new Employee(1, "Adam", LocalDate.of(1961, 5, 17), Gender.MALE, 2300.4343));
        employeeTest.add(new Employee(2, "Camila", LocalDate.of(1988, 5, 22), Gender.FEMALE, 2189.2));
        employeeTest.add(new Employee(3, "Elsa", LocalDate.of(1993, 3, 25), Gender.FEMALE, 1822.31));

    }

    @Test
    public void findMales_notNullMales(){

        Employee e1  = new Employee(1, "Ben", LocalDate.of(1961, 5, 17), Gender.MALE, 2300.4343);
        employeeTest.add(e1);

       List<String> newList = service.findMales(employeeTest);

        Assertions.assertNotNull(newList);
    }

    @Test
    public void findMales_listSizeMales(){
        List<String> newList = service.findMales(employeeTest);

        Assertions.assertEquals(2, newList.size());

    }

    @Test
    public void findNames_expectedName(){

        Employee e1 = employeeTest.get(0);
        Employee e2 = employeeTest.get(1);
        Employee e3 = employeeTest.get(2);
        Employee e4 = employeeTest.get(3);

        List<String> newList = service.findNames(employeeTest);

        Assertions.assertEquals(e1.getName(), newList.get(0));
        Assertions.assertEquals(e2.getName(), newList.get(1));
        Assertions.assertEquals(e3.getName(), newList.get(2));
        Assertions.assertEquals(e4.getName(), newList.get(3));

    }

    @Test
    public void findNames_expectedSize(){
        Assertions.assertEquals(4, employeeTest.size());

    }

    @Test
    public void findNames_containsObjectName(){
        List<String> newList = service.findNames(employeeTest);

        Assertions.assertTrue(newList.contains(employeeTest.get(0).getName()));
        Assertions.assertTrue(newList.contains(employeeTest.get(1).getName()));
        Assertions.assertTrue(newList.contains(employeeTest.get(2).getName()));
        Assertions.assertTrue(newList.contains(employeeTest.get(3).getName()));

    }

    @Test
    public void findUniqueBirthdate_expectedObjectDate (){
        List<LocalDate> newList = service.findUniqueBirthdate(employeeTest);

        Assertions.assertEquals(newList.get(0), employeeTest.get(0).getBirthdate());

    }

    @Test
    public void findUniqueBirthdate_expectedDate (){
      List<LocalDate> newList = service.findUniqueBirthdate(employeeTest);

        Assertions.assertEquals(LocalDate.of(1961, 5, 17), newList.get(0));

    }

    @Test
    public void findRequestedName_expectedName(){
        List<Employee> newList =  service.findRequestedName(employeeTest, "Adam");

        Assertions.assertEquals("Adam", newList.get(0).getName());
    }

    @Test
    public void calculateAverageSalary_expectedSalary(){
        Double newSalary = service.calculateAverageSalary(employeeTest);

        Assertions.assertEquals(2153.09465, newSalary);
    }

    @Test
    public void calculateAverageSalary_notExpectedSalary(){
        Double newList = service.calculateAverageSalary(employeeTest);

        Assertions.assertNotEquals(23, (double) newList, 0.0);
    }

}
