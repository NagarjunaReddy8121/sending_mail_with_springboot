package in.arjun.controller;

import in.arjun.entity.Student;
import in.arjun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> saveStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return new ResponseEntity<>("successfully saved", HttpStatus.CREATED);
    }
}
