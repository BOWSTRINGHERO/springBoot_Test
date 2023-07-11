package com.hj.w2.calc.todo;


import com.hj.w2.calc.todo.dto.TodoDTO;
import com.hj.w2.calc.todo.service.TodoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "todoReadController", urlPatterns = "/todo/read")

public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/read");

        Long tno = Long.parseLong(req.getParameter("tno"));
        TodoDTO dto = TodoService.INSTANCE.get(tno);
        req.setAttribute("dto", dto);
        req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req, resp);
    }
}
