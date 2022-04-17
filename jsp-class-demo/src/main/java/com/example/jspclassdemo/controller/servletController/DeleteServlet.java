package com.example.jspclassdemo.controller.servletController;

import com.example.jspclassdemo.model.Employee;
import com.example.jspclassdemo.controller.EmployeeManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "delete", value = "/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int intId = Integer.parseInt(req.getParameter("id"));

        EmployeeManager manager = EmployeeManager.getInstance();

        manager.delete(intId);

        resp.sendRedirect("list");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int intId = Integer.parseInt(req.getParameter("id"));

        EmployeeManager manager = EmployeeManager.getInstance();
        Employee emp = manager.find(intId);

        req.setAttribute("employee", emp);

        RequestDispatcher dispatcher = req.getRequestDispatcher("delete.jsp");
        dispatcher.forward(req, resp);
    }
}
