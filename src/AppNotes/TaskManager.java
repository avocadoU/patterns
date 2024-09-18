package AppNotes;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


// Паттерн Singleton
public class TaskManager {
    private static TaskManager manager;
    Connection connection = DatabaseConnection.connect();

    private TaskManager() {
    }
    
    public static TaskManager getManager() {
        if (manager == null) {
            manager = new TaskManager();
        }
        return manager;
    }

    public void addTask(String title, String description) {
        String insertQuery = "INSERT INTO tasks (title, description) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, title);
            preparedStatement.setString(2, description);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Задача успешно добавлена!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*public void removeTask() {

    }*/

    /*public void showTasks() {

    }*/
}