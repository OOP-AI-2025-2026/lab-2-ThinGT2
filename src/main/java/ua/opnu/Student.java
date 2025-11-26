package ua.opnu;

import java.util.ArrayList;

public class Student {
    private String name;
    private int year;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, int year) {
        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Рік повинен бути від 1 до 4");
        }
        this.name = name;
        this.year = year;
    }

    public void addCourse(String courseName) {
        if (courseName != null && !courseName.isEmpty()) {
            courses.add(courseName);
        }
    }

    public void dropAll() {
        courses.clear();
    }

    public int getCourseCount() {
        return courses.size();
    }

    public String getName() {
        return name;
    }

    public double getTuition() {
        return year * 20000;
    }

    public int getYear() {
        return year;
    }
}
