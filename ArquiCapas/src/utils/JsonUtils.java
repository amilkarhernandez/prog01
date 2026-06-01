package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.entities.Person;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;

public class JsonUtils {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final String RUTE_FILE = "data/persons.json";

    public static void create(List<Person> personList){
        try{
            new File("data").mkdirs();
            try(Writer writer = new FileWriter(RUTE_FILE)){
                gson.toJson(personList, writer);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar JSON", e);
        }
    }

    public static List<Person> leer() {
        try (Reader reader = new FileReader(RUTE_FILE)) {
            Type type = new TypeToken<List<Person>>(){}.getType();
            List<Person> list = gson.fromJson(reader, type);
            return list != null ? list : new ArrayList<>();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException("Error al leer JSON", e);
        }
    }
}
