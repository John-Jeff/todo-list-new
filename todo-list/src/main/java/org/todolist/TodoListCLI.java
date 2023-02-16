package org.todolist;

import java.util.Scanner;

import org.todolist.main.TodoList;

public class TodoListCLI {

    Scanner userInput = new Scanner(System.in);
    TodoList tl = new TodoList();

    public void run() {

        boolean isRunning = true;

        System.out.println("**************************");
        System.out.println(" Welcome to the todo list ");
        System.out.println("**************************\n");

        while (isRunning) {

            if (tl.getPL().getProjectList().isEmpty()) {
                System.out.print("It looks like you don't have any projects!\n" +
                        "Enter [N] to create one now\n" +
                        "Or enter [Q] to exit: ");

                String newInput = userInput.nextLine().toUpperCase();

                while (!newInput.matches("N|Q")) {
                    System.out.print("\nNot a valid option, please try again: ");
                    newInput = userInput.nextLine().toUpperCase();
                }

                switch (newInput) {
                    case "N":

                        isRunning = false;
                        break;
                    case "Q":
                        System.out.println("Goodbye...");
                        isRunning = false;
                        break;
                }

            }

        }

    }

    public void newProjectPrompt() {

        System.out.print("Enter new project title: ");

        String newProjectTitle = userInput.nextLine();
        tl.createNewProject(newProjectTitle);

    }

    public static void main(String[] args) {

        TodoListCLI tlc = new TodoListCLI();
        tlc.run();

    }
}