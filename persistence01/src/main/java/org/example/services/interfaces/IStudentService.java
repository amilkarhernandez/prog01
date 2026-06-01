package org.example.services.interfaces;

import org.example.entities.Students;

import java.util.ArrayList;
import java.util.List;

public interface IStudentService {
    void saveService(Students students);
    List<Students> listAllServices();
    void listAll();
    boolean deleteByCode(String code);
    double calculateAverage();
}
