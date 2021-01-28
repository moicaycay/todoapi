package com.amee.todoapi.service;

import com.amee.todoapi.model.BaseResponse;
import com.amee.todoapi.model.TaskModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TaskService {

    List<TaskModel> getAllTask(Pageable pageable);

    TaskModel getTaskById(int id);

    BaseResponse updateTask(TaskModel task);

    BaseResponse insertTask(TaskModel task);

    BaseResponse deleteTask(int id);

}
