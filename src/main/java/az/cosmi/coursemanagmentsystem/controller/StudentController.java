package az.cosmi.coursemanagmentsystem.controller;

import az.cosmi.coursemanagmentsystem.entity.Student;
import az.cosmi.coursemanagmentsystem.exceptions.alredyexsist.StudentAlredyExsistException;
import az.cosmi.coursemanagmentsystem.model.base.BaseResponse;
import az.cosmi.coursemanagmentsystem.service.inter.StudentServiceInter;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/student")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class StudentController {
    StudentServiceInter studentService;

    @Autowired
    public StudentController(StudentServiceInter studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student) throws StudentAlredyExsistException {
        studentService.create(student);
    }

    @GetMapping("/get-all")
    public Set<Student> getAllStudent() {
        return studentService.getAll();
    }

    @GetMapping("/get-by-id")
    public BaseResponse<Student> getById(@RequestParam String id) {
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
