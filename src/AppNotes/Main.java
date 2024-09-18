package AppNotes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = TaskManager.getManager();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название задачи: ");
        String taskTitle = scanner.nextLine();
        System.out.print("Введите описание задачи: ");
        String taskDescription = scanner.nextLine();
        taskManager.addTask(taskTitle, taskDescription);
        scanner.close();
    }
}