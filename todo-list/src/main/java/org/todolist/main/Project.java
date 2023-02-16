package org.todolist.main;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String title;
    private List<TodoItem> todoItemList = new ArrayList<>();

    public Project(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<TodoItem> getTodoItemList() {
        return todoItemList;
    }
}
