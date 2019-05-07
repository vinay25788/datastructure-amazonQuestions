package com.generic;

import java.util.stream.*;
import java.util.*;

public class TestResults
{
    public static class Student {
        private String name;
        private int score;
        
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        
        public int getScore() {
            return score;
        }
        
        public String getName() {
            return name;
        }
    }
    
    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
        
        List<String> listOfStudent =  students.filter(s->s!=null).filter(st->st.score>passingScore).sorted((s1,s2)->s1.score>s2.score?1:(s1.score==s2.score)?0:-1).map(Student::getName).collect(Collectors.toList());
    return listOfStudent;
    }
    
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));

        studentsThatPass(students.stream(), 50).forEach(System.out::println);        
    }
}