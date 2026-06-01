package services.interfaces;

import entities.Students;

import java.util.ArrayList;

public interface IStudentService {
    void saveService(Students students);
    ArrayList<Students> listAllServices();
    void listAll();
    boolean deleteByCode(String code);
    double calculateAverage();
}
