package az.cosmi.coursemanagmentsystem.controller;

import az.cosmi.coursemanagmentsystem.entity.Student;
import az.cosmi.coursemanagmentsystem.model.ResponseModel;
import az.cosmi.coursemanagmentsystem.service.inter.StudentServiceInter;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentServiceInter studentService;

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student) {
        studentService.create(student);
    }

    @GetMapping("/getAll")
    public Set<Student> getAllStudent() {
        return studentService.getAll();
    }

    @GetMapping("/getById")
    public ResponseModel<Student> getById(@RequestParam String id) {
        return studentService.getById(id);
    }

    @DeleteMapping("/delete")
    public void deleteById(@RequestParam String id) {
        studentService.delete(id);
    }

    @PutMapping("/update")
    public void updateStundentById(@RequestParam String id) {
        studentService.update(id);
    }

}
