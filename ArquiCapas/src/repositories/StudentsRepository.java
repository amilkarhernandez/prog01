package repositories;

import entities.Students;

import java.util.ArrayList;

public class StudentsRepository {

    private ArrayList<Students> list = new ArrayList<>();

    public void save(Students s){
        list.add(s);
    }

    public ArrayList<Students> listAll(){
        return list;
    }

    public Students findByCode(String code){
        for(Students s: list){
            if(s.getCode().equals(code)){
                return s;
            }
        }
        return null;
    }

    public boolean delete(String code){
        return list.removeIf(s -> s.getCode().equals(code));
    }
}
