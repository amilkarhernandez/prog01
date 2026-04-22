package services;

import entities.Students;
import repositories.StudentsRepository;

import java.util.ArrayList;

public class StudentsService {

    private StudentsRepository repository = new StudentsRepository();

    public void saveService(Students students){

        if(students.getNote() < 0 || students.getNote() > 5){
            System.out.println("La nota debe ser Menor a 5");
            return;
        }

        Students find = repository.findByCode(students.getCode());
       if(find != null){
           System.out.println("El Estudiante se encuentra Registrado");
           return;
       }

        /*if(repository.findByCode(students.getCode()) != null){
            System.out.println("El Estudiante se encuentra Registrado");
            return;
        }*/

        repository.save(students);
        System.out.println("Estudiante Registrado");
    }

    public ArrayList<Students> listAllServices(){
        return repository.listAll();
    }

    public void listAll(){
        repository.listAll().forEach(System.out::println);
    }

    public boolean deleteByCode(String code){
        return repository.delete(code);
    }

    public double calculateAverage(){
        ArrayList<Students> arrayList = repository.listAll();
        if(arrayList.isEmpty()) return 0;
        double average = 0;
        for (Students s : arrayList){
            average += s.getNote();
        }

        return average/arrayList.size();
    }

}
