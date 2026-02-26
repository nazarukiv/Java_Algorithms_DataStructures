package Basics;

import  Helper.Student;
import java.util.HashMap;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        HashMap<String, Integer> studentsAge = new HashMap<>();
        studentsAge.put("Ivan", 19);
        studentsAge.put("Dima", 20);

        System.out.println(studentsAge.get("Ivan"));

        //iteration inside studentsAge HashMap
        for (Map.Entry<String, Integer> entry: studentsAge.entrySet()){
            System.out.println("Key: "+ entry.getKey());
            System.out.println("Value: " + entry.getValue() + "\n");
        }

        //student task

        HashMap<Integer, Student> studentsMap = new HashMap<>();

        studentsMap.put(101, new Student("Ivan", 19, "Java", 85.5));
        studentsMap.put(102, new Student("Dima", 20, "Python", 92.0));
        studentsMap.put(103, new Student("Marta", 21, "UI/UX", 98.2));
        studentsMap.put(104, new Student("Oleg", 18, "Java", 74.0));
        studentsMap.put(105, new Student("Anna", 22, "Data Science", 95.5));
        studentsMap.put(106, new Student("Max", 19, "C++", 88.0));
        studentsMap.put(107, new Student("Yulia", 20, "Java", 91.3));
        studentsMap.put(108, new Student("Igor", 21, "Testing", 65.0));
        studentsMap.put(109, new Student("Katia", 18, "Python", 89.9));
        studentsMap.put(110, new Student("Vova", 22, "JS", 77.4));


        findStudentByID(studentsMap, 110);

        studentsMap.remove(107);

        findTheBestStudent(studentsMap);



    }

    public static void findStudentByID(HashMap<Integer, Student> studentsList, int studentid){
        for (Map.Entry<Integer, Student> entry: studentsList.entrySet()){
            if (entry.getKey() == studentid){
                System.out.println("Name: " + entry.getValue().getName() + "Grade: " + entry.getValue().getGrade());
            }
        }
    }

    public static void findTheBestStudent(HashMap<Integer, Student> studentsList){
        double maxGrade = 1;
        Student bestStudent = null;
        for (Map.Entry<Integer, Student> entry: studentsList.entrySet()){
            if (entry.getValue().getGrade() > maxGrade){
                maxGrade = entry.getValue().getGrade();
                bestStudent = entry.getValue();
            }
        }
        System.out.println(bestStudent);
    }



}
