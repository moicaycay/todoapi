package com.amee.todoapi.service.impl;

import com.amee.todoapi.model.BaseResponse;
import com.amee.todoapi.model.TaskModel;
import com.amee.todoapi.repository.TaskRepository;
import com.amee.todoapi.service.TaskService;
import com.amee.todoapi.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<TaskModel> getAllTask(Pageable pageable) {
        return this.taskRepository.findAll(pageable).getContent();
    }

    @Override
    public TaskModel getTaskById(int id) {
        return this.taskRepository.getOne(id);
    }

    @Override
    public BaseResponse insertTask(TaskModel tasks) {
         this.taskRepository.save(tasks);
         BaseResponse response = new BaseResponse();
         response.setCode(Constants.SUCCESS_CODE);
         response.setStatus(HttpStatus.OK);
         response.setMessage("Create new task success!");
         return response;
    }

    @Override
    public BaseResponse updateTask(TaskModel task) {

        BaseResponse response = new BaseResponse();
        final int id = task.getId();
        if(!this.taskRepository.existsById(id)) {
            response.setCode(Constants.ERROR_CODE);
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Task not found");
            return response;
        }

        this.taskRepository.save(task);
        response.setCode(Constants.ERROR_CODE);
        response.setStatus(HttpStatus.BAD_REQUEST);
        response.setMessage("Update task id " + task.getId() + " success!");
        return response;
    }

    @Override
    public BaseResponse deleteTask(int id) {
        BaseResponse response = new BaseResponse();
        if(this.taskRepository.existsById(id)) {
            this.taskRepository.delete(this.taskRepository.getOne(id));
            response.setCode(Constants.SUCCESS_CODE);
            response.setStatus(HttpStatus.OK);
            response.setMessage("Delete task id " + id +" success");
        } else {
            response.setCode(Constants.ERROR_CODE);
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Task not found");
        }
        return response;
    }
}
