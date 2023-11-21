package ie.atu.validationlab;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    // Placeholder method to save a person (add to Db in the next two weeks)
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
    }

    public Person getPersonByEmployeeID(String employeeId) {
        // fetch data from a database in future
        return new Person();
    }
}
