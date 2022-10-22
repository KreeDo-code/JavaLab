package com.example.lb3;
import java.util.Arrays;
import java.util.ArrayList;

public class Student {
    private String name;
    private String groupNumber;

    public Student (String name, String groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public String getGroupNumber() {
            return groupNumber;}

    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays. asList(
                    new Student ("Орел Вадим","ІПЗ19-1"),
                    new Student ("Ванжа Микита", "ІПЗ19-1") ,
                    new Student ("Островський В'ячеслав", "ІПЗ19-1"),
                    new Student ("Мирогородський Данил", "ІПЗ19-1"),
                    new Student ("Лесніков Микита", "ІПЗ19-1"),
                    new Student ("Козлов Євген", "ІПЗ19-1"),
                    new Student ("Зелінський Володимир", "ІПЗ19-1"),
                    new Student ( "Пірогов Влад","ІПЗ19-2"),
                    new Student ( "Алісова Ксенія",  "ІПЗ19-2"),
                    new Student (  "Решетнік Катерина", "ІПЗ19-2"),
                    new Student (  "Смірнов Олексій","К19"),
                    new Student (  "Гуйдя Дмитро", "К19")
            ));

    public static ArrayList<Student> getStudents (String groupNumber) {
    ArrayList<Student> stList = new ArrayList<>();
    for (Student s: students) {
        if(s.getGroupNumber().equals(groupNumber)){
        stList.add(s);
    }}
            return stList;
    }

}
