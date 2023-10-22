package com.hillel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {

    private Connection connection;

    public LessonDao(Connection connection) throws ClassNotFoundException, SQLException{
        this.connection = connection;
    }

    //  - метод додавання уроку
    public void addLesson(Lesson lesson) {
        try {
            String query = "insert into Lesson (name, homework_id) values (?, ?)";
            PreparedStatement preparedStatement= connection.prepareStatement(query);

            preparedStatement.setString(1, lesson.getName());
            preparedStatement.setInt(2, lesson.getHomework().getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // - метод видалення уроку
    public void deleteLesson(int lessonId) {
        try {
            String query = "DELETE FROM Lesson WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, lessonId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //- метод отримання всіх уроків
    public List<Lesson> getAllLessons() {
        List<Lesson> lessons = new ArrayList<>();
        try {
            String query = "SELECT * FROM Lesson";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int homeworkId = resultSet.getInt("homework_id");
                Homework homework = getHomeworkById(homeworkId);
                Lesson lesson = new Lesson(id, name, homework);
                lessons.add(lesson);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lessons;
    }

    //- метод отримання уроку за ID
    public Lesson getLessonById(int lessonId) {
        try {
            String query = "select * from Lesson where id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, lessonId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int homeworkId = resultSet.getInt("homework_id");
                Homework homework = getHomeworkById(homeworkId);
                return new Lesson(id, name, homework);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//- тримання Homework по homeworkId
    public Homework getHomeworkById(int homeworkId) {
        try {
            String query = "select * from homework where id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, homeworkId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                return new Homework(id, name, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
