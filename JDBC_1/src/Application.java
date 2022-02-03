import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDao dao = new EmployeeDao();

        //save
//        dao.create(new Employee("Al", "Pacino"));
//        dao.create(new Employee("Morgan", "Freeman"));
//        dao.create(new Employee("Daniel", "Day-Lewis"));
//        dao.create(new Employee("Samuel", "L.Jackson"));
//        dao.create(new Employee("Benicio", "Del Toro"));

        //read
        for(Employee emp : dao.readAll()){
            System.out.println(emp);
        };

        //update
        dao.update(3,"Negreanu");


        //delete
        dao.delete(10);
    }
}
