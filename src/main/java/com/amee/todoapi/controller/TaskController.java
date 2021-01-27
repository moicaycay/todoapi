package com.amee.todoapi.controller;

import com.amee.todoapi.model.TaskModel;
import com.amee.todoapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class TaskController {

    @Autowired
    private TaskService taskService;
    @GetMapping(path="/all")
    public @ResponseBody String getAllTask() {
        TaskModel task = taskService.getTaskById(1);
        System.out.println(task.getWorkName());
        return "Welcome";
    }

}
