package az.cosmi.coursemanagmentsystem.model.dto.student.create;

import az.cosmi.coursemanagmentsystem.entity.Email;
import az.cosmi.coursemanagmentsystem.entity.Group;
import az.cosmi.coursemanagmentsystem.entity.Subject;
import az.cosmi.coursemanagmentsystem.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentWithTeacherCreateRequestDTO {
    private String id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String address;
    private Email email;
    private Set<Teacher> teachers;
}
