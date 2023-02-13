package org.todolist.main;

public class TodoItem {

    private String title;
    private String description;
    private String modifiedTime;
    private String modifiedDate;
    private boolean isComplete;

    public TodoItem(String title, String description, String modifiedTime, String modifiedDate, boolean isComplete) {
        this.title = title;
        this.description = description;
        this.modifiedTime = modifiedTime;
        this.modifiedDate = modifiedDate;
        this.isComplete = isComplete;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public boolean isComplete() {
        return isComplete;
    }
}
