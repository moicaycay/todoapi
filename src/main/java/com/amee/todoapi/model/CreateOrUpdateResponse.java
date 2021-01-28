package com.amee.todoapi.model;



import java.util.List;

/**
 * Decription for class
 *
 * @author vn02586
 * @since 8/11/2019
 */
public class CreateOrUpdateResponse extends BaseResponse {
    private int totalUpdate;
    private int totalInsert;

    private  List<TaskModel> toDoList;


    public int getTotalUpdate() {
        return totalUpdate;
    }

    public void setTotalUpdate(int totalUpdate) {
        this.totalUpdate = totalUpdate;
    }

    public int getTotalInsert() {
        return totalInsert;
    }

    public void setTotalInsert(int totalInsert) {
        this.totalInsert = totalInsert;
    }

    public List<TaskModel> getToDoList() {
        return toDoList;
    }

    public void setToDoList(List<TaskModel> toDoList) {
        this.toDoList = toDoList;
    }

}
