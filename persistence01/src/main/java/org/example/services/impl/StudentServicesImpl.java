package org.example.services.impl;


import org.example.entities.Students;
import org.example.repositories.StudentsRepository;
import org.example.services.interfaces.IStudentService;

import java.util.List;

public class StudentServicesImpl implements IStudentService {

    private StudentsRepository repository = new StudentsRepository();

    @Override
    public void saveService(Students students) {
        if(students.getNote() < 0 || students.getNote() > 5){
            System.out.println("La nota debe ser Menor a 5");
            return;
        }

        Students find = repository.findByCode(students.getCode());
        if(find != null){
            System.out.println("El Estudiante se encuentra Registrado");
            return;
        }

        repository.save(students);
        System.out.println("Estudiante Registrado");
    }

    @Override
    public List<Students> listAllServices() {
        return repository.listAll();
    }

    @Override
    public void listAll() {
        repository.listAll().forEach(System.out::println);
    }

    @Override
    public boolean deleteByCode(String code) {
        return repository.delete(code);
    }

    @Override
    public double calculateAverage() {
        List<Students> arrayList = repository.listAll();
        if(arrayList.isEmpty()) return 0;
        double average = 0;
        for (Students s : arrayList){
            average += s.getNote();
        }

        return average/arrayList.size();
    }
}
