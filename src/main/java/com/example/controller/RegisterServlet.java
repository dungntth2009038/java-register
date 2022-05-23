package com.example.controller;

import com.example.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/user/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String birthday = req.getParameter("birthday");
        LocalDate date = LocalDate.parse(birthday);
//        req.setAttribute();
//        resp.getWriter().printf("Action success. Username %s, Fullname %s, Email %s, Phone %s  ", username, fullname, email, phone);
        Student student = new Student();
        student.setUsername(username);
        student.setFullname(fullname);
        student.setEmail(email);
        student.setPhone(phone);
        student.setBirthday(birthday);
        req.setAttribute("studentNgoaiView", student);
        req.getRequestDispatcher("/user/register-success.jsp").forward(req, resp);
    }
}
