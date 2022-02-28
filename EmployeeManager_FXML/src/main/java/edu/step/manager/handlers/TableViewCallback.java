package edu.step.manager.handlers;

import edu.step.manager.model.Employee;
import javafx.beans.Observable;
import javafx.util.Callback;

public class TableViewCallback implements Callback<Employee, Observable[]> {
    @Override
    public Observable[] call(Employee param) {
        return new Observable[]{param.nameProperty(), param.birthdateProperty()};
    }
}
