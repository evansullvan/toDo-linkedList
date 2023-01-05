package com.company;

public class toDo {

     String title;
    String desc;
    boolean isCompleted;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public toDo(String title, String desc) {
        this.title = title;
        this.desc = desc;
        this.isCompleted = false;
    }
}
