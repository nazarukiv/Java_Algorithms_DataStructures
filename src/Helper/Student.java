package Helper;

public class Student {
    private String name;
    private int age;
    private String course;
    private double grade;

    public Student(String name, int age, String course, double grade){
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public String getName() { return name; }
    public double getGrade() { return grade; }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Course: " + course + ", Grade: " + grade;
    }
}
