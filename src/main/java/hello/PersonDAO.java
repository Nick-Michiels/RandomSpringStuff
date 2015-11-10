package hello;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by nick on 05.11.15.
 */
@Component
public class PersonDAO {
    public static ArrayList<Person> persons;

    public PersonDAO() {
        persons = new ArrayList<Person>();
        persons.add(new Person("User", 18, "Pa$$w0rd"));
        persons.add(new Person("User2", 19, "Pa$$w1rd"));
        persons.add(new Person("User3", 20, "Pa$$w2rd"));
        persons.add(new Person("User4", 222, "Pass"));
    }

//    @Autowired
    public ArrayList<Person> getPersons() {
        return persons;
    }
}
