package az.cosmi.coursemanagmentsystem.entity;

import az.micos.coursemanagmentsystemspringandjpa.model.abstracts.AbstractModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Entity(name = "Teacher")
@Table(name = "teacher")
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends AbstractModel {
    @Id
    private String finCode;

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String address;

    @OneToMany
    private Set<Student> students;

    @OneToMany(mappedBy = "finCode")
    private Set<Subject> subjects;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(finCode, teacher.finCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), finCode);
    }
}
