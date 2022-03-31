package edu.step.model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;

public class EmployeeTest {

    Employee employee = new Employee();

    @Test
    public void setName_expectedName() {
        employee.setName("Felix");
        Assertions.assertEquals("Felix", employee.getName());
    }

    @Test
    public void setName_caseSensitiveName() {
        employee.setName("FelIX");
        Assertions.assertEquals("Felix", employee.getName());
    }

    @Test
    public  void setBirthdate_expectedBirthdate(){
        LocalDate date = LocalDate.of(2000, 11, 9);
        employee.setBirthdate(LocalDate.of(2000, 11, 9));
        Assertions.assertTrue(date.equals(employee.getBirthdate()) );
    }

    @Test
    public void setGender_expectedGender()  {
        employee.setGender(Gender.FEMALE);
        Assertions.assertEquals(Gender.FEMALE, employee.getGender());
    }


    @Test
    public void setSalary_expectedSalary()  {
        employee.setSalary(8738293.393);
        Assertions.assertTrue(8738293.393 == employee.getSalary());
    }

    @Test
    public void setSalary_notNumberSalary() {
        employee.setSalary(Double.valueOf(234.0+"666"));
        Assertions.assertEquals(234.0666, employee.getSalary());
    }

    @Test
    public void setSalary_exceptionHandler() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> employee.setSalary(8.0));
    }

    @Test
    public void setId_lowerThan0()  {
        Assertions.assertThrows(IllegalArgumentException.class, () -> employee.setId(-3));
    }
}
