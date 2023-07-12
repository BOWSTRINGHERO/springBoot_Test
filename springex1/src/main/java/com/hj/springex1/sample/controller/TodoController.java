package com.hj.springex1.sample.controller;

import com.hj.springex1.sample.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
@Log4j2

public class TodoController {

    @RequestMapping("/list")
    public void list() {
        log.info("todo list......");
    }

    //    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void register() {
        log.info("Get todo register......");
    }

    @PostMapping("/register")
    public void registerPost(TodoDTO todoDTO) {
        log.info("POST todo register......");
        log.info(todoDTO);
    }

    @GetMapping("/register")
    public void registerGET() {
        log.info("Get todo register......");
    }
}
