package org.example.repositories;

import org.example.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {

    private List<Teacher> list = new ArrayList<>();

    public void register(Teacher t){
        list.add(t);
    }

    public void showTeachers(){
        list.forEach(System.out::println);
    }

    public List<Teacher> getAll(){
        return list;
    }
}
