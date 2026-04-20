package services;

import entities.Students;
import repositories.StudentsRepository;

import java.util.ArrayList;

public class StudentsService {

    private StudentsRepository repository = new StudentsRepository();

    public void saveService(Students students){

        if(students.getNote() >= 5){
            System.out.println("La nota debe ser Menor a 5");
            return;
        }

        Students find = repository.findByCode(students.getCode());
       if(find != null){
           System.out.println("El Estudiante se encuentra Registrado");
           return;
       }

        repository.save(students);
    }

    public ArrayList<Students> listAllServices(){
        return repository.listAll();
    }


}
