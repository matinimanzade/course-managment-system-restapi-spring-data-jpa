package az.cosmi.coursemanagmentsystem.model.dto.student.create;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OnlyStudentCreateRequestDTO {
    private String id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String address;
}
