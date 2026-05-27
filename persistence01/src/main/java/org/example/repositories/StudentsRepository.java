package org.example.repositories;

import org.example.entities.Students;
import org.example.utils.JsonUtils;

import java.util.List;

public class StudentsRepository {

    public void save(Students s){

        //Save Students
        List<Students> studentsList = JsonUtils.leer();

        //Autoincrement
        int idNew = studentsList.stream().mapToInt(Students::getId).max().orElse(0) + 1;
        s.setId(idNew);
        studentsList.add(s);

        JsonUtils.create(studentsList);
        System.out.println("Se ha guardado el studiante en la lista");

    }

    public List<Students> listAll(){
        return JsonUtils.leer();
    }

    public Students findByCode(String code){
        List<Students> studentsList = JsonUtils.leer();
        for(Students s: studentsList){
            if(s.getCode().equals(code)){
                return s;
            }
        }
        return null;
    }

    public boolean delete(String code){
        List<Students> studentsList = JsonUtils.leer();
        return studentsList.removeIf(s -> s.getCode().equals(code));
    }
}
