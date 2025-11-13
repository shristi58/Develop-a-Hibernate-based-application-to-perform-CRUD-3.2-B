package com.example;

import com.example.dao.StudentDAO;
import com.example.model.Student;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student s1 = new Student("Amit Kumar", "CSE", 21);
        dao.saveStudent(s1);

        Student fetched = dao.getStudent(s1.getId());
        System.out.println("Fetched: " + fetched.getName());

        fetched.setAge(22);
        dao.updateStudent(fetched);

        dao.deleteStudent(fetched.getId());
    }
}
