package ru.netology;

import java.util.Objects;

public class Student {

    private final String name;
    private final String group;
    private final String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "Имя '" + name + '\'' +
                ", группа '" + group + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Student.class)) return false;
        Student student = (Student) obj;
        return Objects.equals(name, student.name) && Objects.equals(group, student.group) &&
                Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, studentId);
    }
}



