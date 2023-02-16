package org.todolist;

import java.util.Scanner;

import org.todolist.main.TodoList;

public class TodoListCLI {

    private final String MAIN_MENU_LIST_PROJECTS = "List projects";
    private final String MAIN_MENU_CREATE_PROJECT = "Create project";
    private final String MAIN_MENU_EXIT = "Exit";

    Scanner userInput = new Scanner(System.in);
    TodoList tl = new TodoList();

    // Main function to run program
    public void run() {

        boolean isRunning = true;

        System.out.println("**************************");
        System.out.println(" Welcome to the todo list ");
        System.out.println("**************************\n");

        while (isRunning) {

            // Run initially when program runs and project list is empty
            if (tl.getPL().getProjectList().isEmpty()) {
                System.out.print("It looks like you don't have any projects!\n" +
                        "Enter [N] to create one now\n" +
                        "Or enter [Q] to exit: ");

                String newInput = userInput.nextLine().toUpperCase();

                // Verify user input based on options
                while (!newInput.matches("N|Q")) {
                    System.out.print("\nNot a valid option, please try again: ");
                    newInput = userInput.nextLine().toUpperCase();
                }

                switch (newInput) {
                    case "N":
                        // Prompt user for project creation
                        newProjectPrompt();
                        isRunning = false;
                        break;

                    case "Q":
                        // Exit program
                        System.out.println("Goodbye...");
                        isRunning = false;
                        break;
                }

            }
            else {
                displayMainMenu();
            }

        }

    }

    public void displayMainMenu() {

        System.out.println("What would you like to do? ");


    }

    public void newProjectPrompt() {

        System.out.print("Enter new project title: ");

        String newProjectTitle = userInput.nextLine();

        while (!newProjectTitle.matches("[a-zA-Z0-9 ]+")) {
            System.out.println("Not a valid title, try again");
            newProjectTitle = userInput.nextLine();
        }

        System.out.println("Success");

//        tl.createNewProject(newProjectTitle);

    }

    public void listProjects() {

    }

    public static void main(String[] args) {

        TodoListCLI tlc = new TodoListCLI();
        tlc.run();

    }
}