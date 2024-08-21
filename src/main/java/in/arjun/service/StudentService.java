package in.arjun.service;

import in.arjun.entity.Student;
import in.arjun.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private EmailService emailService;

    public String createStudent(Student student){
        studentRepository.save(student);
        String subject="Student Registration";
        String body="your registration successfull, Welcome!!!";
        String to=student.getEmail();
        emailService.sendEmail(subject,body,to);
        return "success";
    }
}
