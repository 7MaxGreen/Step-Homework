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

@WebServlet(name = "edit", value = "/edit")
public class EditServlet extends HttpServlet {

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
        String id = req.getParameter("id");

        EmployeeManager manager = EmployeeManager.getInstance();
        Employee employee = manager.find(Integer.parseInt(id));
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setIdnp(idnp);
        employee.setBirthdate(birthdate);
        employee.setPhoneNumber(phoneNumber);
        employee.setEmail(email);
        employee.setHireDate(hireDate);
        employee.setDismissDate(dismissDate);
        employee.setSalary(salary);
        employee.setGender(gender);
        employee.setDepartment(new Department(department));
        employee.setProfession(new Profession(profession));
        employee.setAddress(new Address(streetName, streetNumber, apartmentNumber, houseNumber));
        manager.update(employee);

        resp.sendRedirect("list");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int intId = Integer.parseInt(req.getParameter("id"));
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee emp = manager.find(intId);

        req.setAttribute("employee", emp);

        RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
        dispatcher.forward(req, resp);
    }
}
