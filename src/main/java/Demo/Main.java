package Demo;

import Person.Person;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zakhar", "Kulyk");
        Gson gson = new Gson();

        System.out.println(gson.toJson(person));

    }
}
