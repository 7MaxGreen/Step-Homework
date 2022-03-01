package edu.step.manager.handlers;

import edu.step.manager.dao.EmployeeDao;
import edu.step.manager.model.Employee;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public class TableViewChangeListener implements ListChangeListener<Employee> {

    ObservableList<Employee> list;
    EmployeeDao dao = new EmployeeDao();

    public TableViewChangeListener(ObservableList<Employee> employeeData) {
        list = employeeData;
    }

    @Override
    public void onChanged(Change<? extends Employee> change) {
        while (change.next()){
            if(change.wasAdded()) {
                for (int i = change.getFrom(); i < change.getTo(); i++) {
                    System.out.println("Added");
                    System.out.println(list.get(i));
                    try {
                        dao.createWithResources(list.get(i));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            else if(change.wasUpdated()){
                for (int i = change.getFrom(); i < change.getTo(); i++) {
                    System.out.println("Updated");
                    System.out.println(list.get(i));
                    try {
                        dao.updateWithResources(list.get(i));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            else if(change.wasRemoved()){
                for(Employee emp: change.getRemoved()) {
                    System.out.println("removed: " + emp);
                    try {
                        dao.deleteWithResources(emp.getId());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
