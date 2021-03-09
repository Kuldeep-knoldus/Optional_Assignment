package com.knoldus;

import java.util.*;

public class SubjectData {

    static Student student1 = new Student("Kuldeep", 1, Optional.of(Arrays.asList("DAA", "DBMS" , "DS")));
    static Student student2 = new Student("Dheeraj", 2, Optional.of(Arrays.asList("H.Values", "M.Eco.", "Sociology")));
    static Student student3 = new Student("Harshit", 3, Optional.of(Arrays.asList("C++", "Java", "Scala")));
    static Student student4 = new Student("Gaurav", 4, Optional.of(Collections.singletonList("HV 2.0")));
    static Student student5 = new Student("Jitendra", 5, Optional.empty());
    static Student student6 = new Student("Kuldeep", 6, Optional.empty());

    public static List<Student> StudentList() {

        List<Student> st = new ArrayList<>();
        st.add(student1);
        st.add(student2);
        st.add(student3);
        st.add(student4);
        st.add(student5);
        st.add(student6);
        return st;
    }

    public static List<ClassRoom> ClassList() {

        ClassRoom classRoom1 = new ClassRoom("A101", Optional.of(Arrays.asList(student1, student3)));
        ClassRoom classRoom2 = new ClassRoom("B102", Optional.of(Arrays.asList(student2, student4)));
        ClassRoom classRoom3 = new ClassRoom("C103", Optional.of(Arrays.asList(student5, student6)));
        ClassRoom classRoom4 = new ClassRoom("D104", Optional.empty());
        ClassRoom classRoom5 = new ClassRoom("xyz", Optional.of(Arrays.asList(student1, student3)));

        List<ClassRoom> c = new ArrayList<>();
        c.add(classRoom1);
        c.add(classRoom2);
        c.add(classRoom3);
        c.add(classRoom4);
        c.add(classRoom5);

        return c;
    }
}