package com.booleanuk.core;

public class TodoItem {

    private String title;
    private String detail;
    private boolean isComplete;


    public TodoItem(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }

    public void changeStatus (){
        this.isComplete = !isComplete;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStatus() {
        if (isComplete){
            return "complete";
        }else {
            return "incomplete";
        }
    }


}