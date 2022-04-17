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
import java.util.List;

@WebServlet(name = "list", value = "/list")
public class ListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String query = req.getParameter("query");
        List<Employee> found = EmployeeManager.getInstance().find(query);
        req.setAttribute("activeFilter", query);
        req.setAttribute("employees", found);

        OpenListPage(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EmployeeManager manager = EmployeeManager.getInstance();
        int page = getPageNumber(req);
        req.setAttribute("employees", manager.readPage(page));
        req.setAttribute("totalPages", manager.getTotalPages());
        req.setAttribute("currentPage", page);

        OpenListPage(req, resp);
    }

    private void OpenListPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("list.jsp");
        requestDispatcher.forward(req, resp);
    }

    private int getPageNumber(HttpServletRequest req) {
        int pageNumber;
        String pageParam = req.getParameter("p");
        if(pageParam == null || pageParam.isEmpty()) {
            pageNumber =1;
        } else {
            pageNumber = Integer.parseInt(pageParam);
        }
        return pageNumber;
    }
}
