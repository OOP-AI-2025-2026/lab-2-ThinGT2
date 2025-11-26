package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student first = new Student("Max", 2);
        first.addCourse("Math");
        first.addCourse("IT");
        first.addCourse("Physics");
        System.out.println(first.getName() + ": кількість дисциплін - " + first.getCourseCount());
        System.out.println(first.getName() + ": рік навчання - " + first.getYear());
        System.out.println(first.getName() + ": сума грошей - " + first.getTuition());
    }
}
