package edu.step.manager.dao;

import edu.step.manager.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private Connection getConnection() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/TestEmployee", "postgres", "Hymenez800");
        return connection;
    }


    public Employee createWithResources(Employee emp) throws SQLException {

        String insert = "INSERT INTO app.employee(name, surname) values(?,?)";

        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS); ){

            statement.setString(1, emp.getName());
            statement.setString(2, emp.getSurname());

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

        String select = "SELECT id, name, surname FROM app.employee order by id asc";
        try(Connection connection = getConnection();
            Statement statement = connection.createStatement()){

            ResultSet result = statement.executeQuery(select);

            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                String surname = result.getString("surname");

                employees.add(new Employee(id, name, surname));
            }
        }
        return employees;
    }


    public void updateWithResources(Employee emp) throws SQLException{

        String update = "UPDATE app.employee SET surname = ?, name = ? WHERE id = ?";
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(update)){
            statement.setString(1, emp.getSurname());
            statement.setString(2, emp.getName());
            statement.setInt(3, emp.getId());

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
