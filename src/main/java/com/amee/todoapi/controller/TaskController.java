package com.amee.todoapi.controller;

import com.amee.todoapi.model.BaseResponse;
import com.amee.todoapi.model.TaskModel;
import com.amee.todoapi.service.TaskService;
import com.amee.todoapi.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path=Constants.URL_BASE)
public class TaskController extends AbstractBaseController{

    @Autowired
    private TaskService taskService;


    @GetMapping(path=Constants.URL_GET_TODO)
    public List<TaskModel> getAllTask(@RequestParam(name = "page", required = false, defaultValue = Constants.PAGE_DEFAULT) Integer page,
                                                    @RequestParam(name = "size", required = false, defaultValue = Constants.SIZE_PAGE_DEFAULT) Integer size,
                                                    @RequestParam(name = "sort", required = false, defaultValue = Constants.SORT_ASC) String sort ) {
        Sort sortable = Sort.by("work_name").ascending();
        if (sort.equals(Constants.SORT_ASC)) {
            sortable = Sort.by("work_name").ascending();
        }
        if (sort.equals(Constants.SORT_DESC)) {
            sortable = Sort.by("work_name").descending();
        }
        Pageable pageable = PageRequest.of(page, size, sortable);
        return taskService.getAllTask(pageable);
    }

    @PostMapping(path = Constants.URL_INSERT_TODO)
    public  ResponseEntity<BaseResponse> insertTask(@Valid @RequestBody TaskModel task) {
        BaseResponse result = this.taskService.insertTask(task);
        BaseResponse response = new BaseResponse(result.getMessage());
        return new ResponseEntity<>(response, result.getStatus());
    }

    @PostMapping(path = Constants.URL_UPDATE_TODE)
    public  ResponseEntity<BaseResponse> updateTask(@Valid @RequestBody TaskModel task) {
        BaseResponse result = this.taskService.updateTask(task);
        BaseResponse response = new BaseResponse(result.getMessage());
        return new ResponseEntity<>( response, result.getStatus());
    }

    @PostMapping(path = Constants.URL_DELETE_TODO)
    public ResponseEntity<BaseResponse> deleteTask(@PathVariable int id) {
        BaseResponse result = this.taskService.deleteTask(id);
        BaseResponse response = new BaseResponse(result.getMessage());
        return new ResponseEntity<>( response, result.getStatus());
    }
}
