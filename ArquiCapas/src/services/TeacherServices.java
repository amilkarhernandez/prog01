package services;

import entities.Teacher;
import repositories.TeacherRepository;

import java.util.List;

public class TeacherServices {

    TeacherRepository teacherRepository = new TeacherRepository();

    public void register(Teacher t){

        //Validations

        if(t.getCode() <= 0){
            System.out.println("El codigo debe ser mayor a 0");
            return;
        }

        if(t.getName().length() < 3){
            System.out.println("El nombre debe ser mayor a 3");
            return;
        }

        teacherRepository.register(t);
        System.out.println("Se ha guardado el profesor correctamente");
    }

    public void getTeacherActive(){

        List<Teacher> list = teacherRepository.getAll();

        for (Teacher l : list){
            if(l.isStatus()) System.out.println(l);
        }

        //teacherRepository.getAll().forEach(t -> { if(t.isStatus()) System.out.println(t);});

    }

}
