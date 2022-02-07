import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Dao - data access object
public class EmployeeDao {

    // 1. REGISTER DRIVER:
    // configure your project by adding jdbc (.jar file) to it;
    //    : https://jdbc.postgresql.org/download.html ;
    //    : https://dev.mysql.com/downloads/connector/j/ ;
    //    : https://www.oracle.com/database/technologies/appdev/jdbc-ucp-21-5-downloads.html ;
    // 1.1 File -> Project Structure -> Libraries -> Add your .jar file ;

    private Connection getConnection() throws SQLException{
    // 2. Get connection:
    //    Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    //    DB_URL consists of jdbc:DB_TYPE://DB_IP:DB_PORT/DB_NAME

        Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/TestEmployee", "postgres", "Hymenez800");
        return connection;
    }


    public Employee createWithResources(Employee emp) throws SQLException {
//
//        Connection connection = getConnection();
//
//        // 3. Create and prepare statement:
//        String insert = "INSERT INTO app.employee(name, surname) values(?,?)";
//        PreparedStatement statement = connection.prepareStatement(insert);
//
//        statement.setString(1, emp.getName());
//        statement.setString(2, emp.getSurname());
//
//        // 4. Execute statement(query):
//        int row = statement.executeUpdate(); // executes SQL DDL statement which returns nothing ( INSERT, UPDATE, DELETE);
//        if(row == 0){
//            System.out.println("Error: " + row + " rows were updated" );
//
//        }
//        // 5. Close statement and connection:
//        statement.close();
//        connection.close();
//        ______________________________________________________________________________________________________________

        // try-with-resources:

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


    public void updateWithResources(int id, String surname) throws SQLException{

        String update = "UPDATE app.employee SET surname = ? WHERE id = ?";
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(update)){
            statement.setString(1, surname);
            statement.setInt(2, id);

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
