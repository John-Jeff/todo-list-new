package org.todolist.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectList {

    Map<String, List<TodoItem>> projectList = new HashMap<>();

    public Map<String, List<TodoItem>> getProjectList() {
        return projectList;
    }

    public void addProject(Project newProject) {

        projectList.put(newProject.getTitle(), newProject.getTodoItemList());

    }

}
