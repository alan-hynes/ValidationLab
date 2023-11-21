package ie.atu.validationlab;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) { this.personService = personService; }

    @GetMapping("/{employeeID}")
    public ResponseEntity<?> getPersonByEmployeeID(employeeID) {
        if (employeeID.length( > 5 || employeeID.isBlank()){
            return ResponseEntity.badRequest().body("Employee is invalid");
        }



        if (person == null) {
           return ResponseEntity.notFound().build;
        }

        return ResponseEntity.ok(person);
    }
}
