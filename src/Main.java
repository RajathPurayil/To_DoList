import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public  class TodoList {
        private ArrayList<String> tasks;

        public TodoList() {
            this.tasks = new ArrayList<>();
        }

        public void addTask(String task) {
            tasks.add(task);
        }

        public void editTask(int index, String newTask) {
            if (index >= 0 && index < tasks.size()) {
                tasks.set(index, newTask);
            } else {
                System.out.println("Invalid task index");
            }
        }

        public void removeTask(int index) {
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
            } else {
                System.out.println("Invalid task index");
            }
        }

        public void displayTasks() {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }

         public void main(String[] args)
         {
            TodoList todoList =  new TodoList();
            Scanner scanner = new Scanner(System.in);
            todoList.addTask("Task 1");
            todoList.addTask("Task 2");
            todoList.addTask("Task 3");
            todoList.displayTasks();
            System.out.println("\n1. Add Task");
            System.out.println("2. Edit Task");
            System.out.println("3. Remove Task");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String newTask = scanner.next();
                    todoList.addTask(newTask);
                    break;
                case 2:
                    System.out.print("Enter the task index to edit: ");
                    int editIndex = scanner.nextInt();
                    System.out.print("Enter the new task: ");
                    String editedTask = scanner.next();
                    todoList.editTask(editIndex - 1, editedTask);
                    break;
                case 3:
                    System.out.print("Enter the task index to remove: ");
                    int removeIndex = scanner.nextInt();
                    todoList.removeTask(removeIndex - 1);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            todoList.displayTasks();
        }
    }


        }

