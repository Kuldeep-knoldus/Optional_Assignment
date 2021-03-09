package com.knoldus;

import java.util.List;
import java.util.Optional;

public class ClassRoom {

    private final String roomID;
    private final Optional<List<Student>> studentsList;

    public ClassRoom(String roomID, Optional<List<Student>> studentList) {
        this.roomID = roomID;
        this.studentsList = studentList;
    }

    public Optional<List<Student>> getStudentList() {
        return studentsList;
    }

    public String getRoomId() {
        return roomID;
    }

    @Override
    public String toString() {
        return "\n ClassRoom [ RoomID=" + roomID + ", StudentList=" + studentsList + "]";
    }
}
