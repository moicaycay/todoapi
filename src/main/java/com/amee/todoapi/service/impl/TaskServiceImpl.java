package com.amee.todoapi.service.impl;

import com.amee.todoapi.model.TaskModel;
import com.amee.todoapi.repository.TaskRepository;
import com.amee.todoapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<TaskModel> getAllTask() {
        return this.taskRepository.findAll();
    }

    @Override
    public TaskModel getTaskById(int id) {
        return this.taskRepository.getOne(id);
    }

    @Override
    public TaskModel insertTask(TaskModel task) {
        return this.taskRepository.save(task);
    }

    @Override
    public TaskModel updateTask(TaskModel task) {
        final Integer id = task.getId();

        TaskModel savedTask = this.taskRepository.getOne(id);
        task.setId(savedTask.getId());
        savedTask = taskRepository.save(task);
        return savedTask;
    }

    @Override
    public void deleteTask(TaskModel task) {
        this.taskRepository.delete(task);
    }
}
