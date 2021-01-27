package com.amee.todoapi.service;

import com.amee.todoapi.model.TaskModel;

import java.util.List;

public interface TaskService {

    List<TaskModel> getAllTask();

    TaskModel getTaskById(int id);

    TaskModel updateTask(TaskModel task);

    TaskModel insertTask(TaskModel task);

    void deleteTask(TaskModel task);

}
