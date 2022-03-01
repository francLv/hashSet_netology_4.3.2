package ru.netology;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> studentMap = new HashSet<>();
        Student student1 = new Student("Петров Петя", "123-Б", "123456");
        Student student2 = new Student("Иванов Иван", "123-Б", "1234567");
        studentMap.add(student1);
        studentMap.add(student2);
        System.out.println(studentMap);

    }
}