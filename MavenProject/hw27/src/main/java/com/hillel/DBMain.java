package com.hillel;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DBMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection connection = DataBaseConnection.getConnection();

        // Створюю об'єкти Homework
        Homework homework1 = new Homework(1, "Homework 1", "Description 1");
        Homework homework2 = new Homework(2, "Homework 2", "Description 2");
        Homework homework3 = new Homework(2, "Homework 3", "Description 3");

        // Створюю об'єкти Lesson
        Lesson lesson1 = new Lesson(1, "Lesson 1", homework1);
        Lesson lesson2 = new Lesson(2, "Lesson 2", homework2);
        Lesson lesson3 = new Lesson(3, "Lesson 3", homework3);

        LessonDao lessonDao = new LessonDao(connection);

        // Додаю уроки
        lessonDao.addLesson(lesson1);
        lessonDao.addLesson(lesson2);
        lessonDao.addLesson(lesson3);

        // Видаляю уроки
//        lessonDao.deleteLesson(1);


        // Отримую всі уроки
        List<Lesson> lessons = lessonDao.getAllLessons();
        for (Lesson lesson : lessons) {
            System.out.println("Lesson ID: " + lesson.getId());
            System.out.println("Lesson Name: " + lesson.getName());
            System.out.println("Homework ID: " + lesson.getHomework().getId());
            System.out.println("Homework Name: " + lesson.getHomework().getName());
            System.out.println("Homework Description: " + lesson.getHomework().getDescription());
            System.out.println();
        }

        DataBaseConnection.closeConnection();
    }


}
