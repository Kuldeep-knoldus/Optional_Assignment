package com.knoldus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

        // Case 1
        System.out.println(" The students associated with a room that have no subjects associated: ");

        List<Student> s = SubjectData.StudentList().stream()
                .filter(obj -> obj.getSubject().isEmpty())
                .collect(Collectors.toList());

        List<String> names = new ArrayList<>();

        for (Student t : s) {
            names.add(t.getName());
        }

        System.out.println(names);

        // Case 2
        System.out.println("\nThe unique subject list of the students associated with a room that has roomID \"xyz\": ");

        List<List<Student>> l1 = SubjectData.ClassList().stream()
                .filter(obj -> obj.getRoomId().equals("xyz"))
                .map(k -> k.getStudentList().get())
                .collect(Collectors.toList());

        List<List<String>> l2 = l1.get(0).stream()
                .map(a -> a.getSubject().get())
                .collect(Collectors.toList());

        Set<String> set = l2.stream().flatMap(Collection::stream)
                .collect(Collectors.toSet());

        System.out.println(set);

        //Case 3
        System.out.println("\nPrinting \"Hello Student\" if a room has students associated. ");

        List<ClassRoom> result = SubjectData.ClassList().stream()
                .filter(o -> o.getStudentList().isPresent())
                .collect(Collectors.toList());

        result.forEach(obj -> System.out.println(obj.getRoomId()+": Hello Student"));
    }
}

