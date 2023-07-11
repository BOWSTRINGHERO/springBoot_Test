package com.hj.w2.calc.todo;

import com.hj.w2.calc.todo.dto.TodoDTO;
import com.hj.w2.calc.todo.service.TodoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")

public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/list");

        List<TodoDTO> dtoList = TodoService.INSTANCE.getList();

        req.setAttribute("List", dtoList);

        req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req, resp);
    }
}
