package com.example.jspclassdemo.controller.servletController;

import com.example.jspclassdemo.model.*;
import com.example.jspclassdemo.controller.EmployeeManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "add", value = "/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String idnp = req.getParameter("idnp");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        Double salary = Double.parseDouble(req.getParameter("salary"));
        LocalDate birthdate = LocalDate.parse(req.getParameter("birthdate"));
        LocalDate hireDate = LocalDate.parse(req.getParameter("hireDate"));
        LocalDate dismissDate = LocalDate.parse(req.getParameter("dismissDate"));
        String department = req.getParameter("department");
        String profession = req.getParameter("profession");
        String streetNumber = req.getParameter("streetNumber");
        String streetName = req.getParameter("streetName");
        String apartmentNumber = req.getParameter("apartmentNumber");
        String houseNumber = req.getParameter("houseNumber");

        Gender gender = Gender.valueOf(req.getParameter("gender"));

//            if (Gender.valueOf(req.getParameter("gender")).equals(Gender.MALE)) {
//                gender = Gender.MALE;
//            } else if (Gender.valueOf(req.getParameter("gender")).equals(Gender.FEMALE)) {
//                 gender = Gender.FEMALE;
//            } else gender = Gender.NOT_DEFINED;

        System.out.println(gender);

        Address address = new Address(streetName, streetNumber, apartmentNumber, houseNumber);
        Department dep = new Department(department);
        Profession prof = new Profession(profession);

        EmployeeManager manager = EmployeeManager.getInstance();

        manager.create(new Employee(manager.nextId() , firstName, lastName, idnp, phoneNumber, email,  salary, birthdate, hireDate, dismissDate, dep, address , prof, gender));

        resp.sendRedirect("list");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("add.jsp");
        requestDispatcher.forward(req, resp);
    }

}
