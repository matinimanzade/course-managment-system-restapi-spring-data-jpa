package az.cosmi.coursemanagmentsystem.controller;

import az.micos.coursemanagmentsystemspringandjpa.entity.Student;
import az.micos.coursemanagmentsystemspringandjpa.repository.inter.StudentRepoInter;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepoInter studentRepo;

    @PostMapping("/create")
    public void createstudent(@RequestBody Student student) {
        studentRepo.create(student);
    }

    @GetMapping("all")
    public Set<Student> getAllStudent() {
        return studentRepo.getAll();
    }
}
