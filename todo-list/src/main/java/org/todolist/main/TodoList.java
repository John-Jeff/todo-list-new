package org.todolist.main;

import org.todolist.utility.DateAndTime;

public class TodoList {

    ProjectList pl = new ProjectList();
    DateAndTime dateTime = new DateAndTime();

    public void createNewProject(String newProjectTitle) {
        pl.addProject(new Project(newProjectTitle));
    }

    public ProjectList getPL() {
        return pl;
    }

}
