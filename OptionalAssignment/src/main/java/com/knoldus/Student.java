package com.knoldus;

import java.util.List;
import java.util.Optional;

public class Student{

    private final String name;
    private final int rollNumber;
    private final Optional<List<String>> subject;

    public Student(String name, int rollNumber, Optional<List<String>> subject) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public Optional<List<String>> getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Student [ Name= " + name + ", RollNumber=" + rollNumber + ", Subject=" + subject + " ]";
    }
}
