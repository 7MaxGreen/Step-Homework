package edu.step.manager.dao;

import edu.step.manager.model.*;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private Connection getConnection() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/TestEmployee", "postgres", "Hymenez800");
        return connection;
    }


    public Employee createWithResources(Employee emp) throws SQLException {

        String insert = "INSERT INTO app.employee(name, surname,  birthdate, gender, idnp, d.name, p.name, a.StreetName, a.StreetNumber, a.HouseNumber, a.ApartmentNumber) values(?,?,?,?,?,?,?,?,?,?,?)";

        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS); ){

            statement.setString(1,  emp.getName());
            statement.setString(2,  emp.getSurname());
            statement.setObject(3,  emp.getBirthdate());
            statement.setObject(4,  emp.getGender());
            statement.setString(5,  emp.getIdnp());
            statement.setObject(6,  emp.getDepartmentObjectProperty().getDepartmentName());
            statement.setObject(7,  emp.getProfessionObjectProperty().getProfessionName());
            statement.setObject(8,  emp.getAddressObjectProperty().getStreetName());
            statement.setObject(9,  emp.getAddressObjectProperty().getStreetNumber());
            statement.setObject(10, emp.getAddressObjectProperty().getHouseNumber());
            statement.setObject(11, emp.getAddressObjectProperty().getApartmentNumber());

            int row = statement.executeUpdate(); // executes SQL DDL statement which returns nothing ( INSERT, UPDATE, DELETE);
            if(row == 0){
                System.out.println("Error: " + row + " rows were updated" );
            } else{
                ResultSet result = statement.getGeneratedKeys();

                while(result.next()){
                    int idEmployee = result.getInt(1);
                    emp.setId(idEmployee);
                    System.out.println("Generated key:" + idEmployee);
                }
            }
        }
        return emp;
    }


    public List<Employee> readWithResources() throws SQLException{
        List<Employee> employees = new ArrayList<>();

        String select = "SELECT id, name, surname, birthdate, gender, idnp, d.name, p.name, a.StreetName, a.StreetNumber, a.HouseNumber, a.ApartmentNumber  FROM app.employee" +
                        "INNER JOIN department d on d.department_id = employee_id" +
                        "INNER JOIN profession p on p.profession_id = employee_id" +
                        "INNER JOIN address a on a.address_id = employee_id" +
                        "order by id asc";

        try(Connection connection = getConnection();
            Statement statement = connection.createStatement()){

            ResultSet result = statement.executeQuery(select);

            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                String surname = result.getString("surname");
                LocalDate birthdate = (LocalDate) result.getObject("birthdate");
                Gender gender = (Gender) result.getObject("gender");
                Department department = (Department) result.getObject("d.name");
                Profession function = (Profession) result.getObject("p.name");
                Address address = (Address) result.getObject("a.StreetName" + "a.StreetNumber" + "a.HouseNumber" + "a.ApartmentNumber");
                String idnp = result.getString("idnp");

                employees.add(new Employee(id, name, surname, birthdate, department , function, address, gender, idnp));
            }
        }
        return employees;
    }


    public void updateWithResources(Employee emp) throws SQLException{

        String update = "UPDATE app.employee SET surname = ?, name = ?, birthdate = ?, d.name = ?, p.name = ?, a.StreetName = ?," +
                   "a.StreetNumber = ?, a.HouseNumber = ?, a.ApartmentNumber = ? " +
                "INNER JOIN department d on d.department_id = employee_id" +
                "INNER JOIN profession p on p.profession_id = employee_id" +
                "INNER JOIN address a on a.address_id = employee_id" +
                "WHERE id = ?";

        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(update)){
            statement.setString(1, emp.getSurname());
            statement.setString(2, emp.getName());
            statement.setObject(3, emp.getBirthdate());
            statement.setObject(4, emp.getDepartmentObjectProperty().getDepartmentName());
            statement.setObject(5, emp.getProfessionObjectProperty().getProfessionName());
            statement.setObject(6, emp.getAddressObjectProperty().getStreetName());
            statement.setObject(7, emp.getAddressObjectProperty().getStreetNumber());
            statement.setObject(8, emp.getAddressObjectProperty().getHouseNumber());
            statement.setObject(9, emp.getAddressObjectProperty().getApartmentNumber());
            statement.setInt(10, emp.getId());

            int row = statement.executeUpdate(); // ( INSERT, UPDATE, DELETE);

            if(row == 0){
                System.out.println("Error: " + row + " rows were updated" );
            }
        }
    }


    public void deleteWithResources(int id) throws SQLException{
        String delete = "DELETE FROM app.employee where id = ?";
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(delete)){
            statement.setInt(1,id);

            int row = statement.executeUpdate(); // ( INSERT, UPDATE, DELETE);
            if(row == 0){
                System.out.println("Error: " + row + " rows were deleted" );
            }
        }
    }
}
