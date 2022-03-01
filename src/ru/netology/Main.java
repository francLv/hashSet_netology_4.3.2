package ru.netology;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> studentMap = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите информацию о студенте: " +
                "\"ФИО, номер группы, номер студенческого билета\"");
        while (true) {
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Список студентов:");
                for (Student student : studentMap) System.out.println(student);
                break;
            } else {
                String[] split = input.split(",");
                String name = split[0];
                String group = split[1];
                String studentId = split[2];
                    Student student = new Student(name, group, studentId);
                    studentMap.add(student);
                }
            }
        }
    }
