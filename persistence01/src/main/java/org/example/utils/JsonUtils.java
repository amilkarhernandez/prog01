package org.example.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import org.example.entities.Students;

public class JsonUtils {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final String RUTE_FILE = "data/students.json";

    public static void create(List<Students> personList){
        try{
            new File("data").mkdirs();
            try(Writer writer = new FileWriter(RUTE_FILE)){
                gson.toJson(personList, writer);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar JSON", e);
        }
    }

    public static List<Students> leer() {
        try (Reader reader = new FileReader(RUTE_FILE)) {
            Type type = new TypeToken<List<Students>>(){}.getType();
            List<Students> list = gson.fromJson(reader, type);
            return list != null ? list : new ArrayList<>();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException("Error al leer JSON", e);
        }
    }
}
