package az.cosmi.coursemanagmentsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Entity(name = "Student")
@Table(name = "student")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private String finCode;

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String address;

    @ManyToOne
    private Teacher teacher;

    @OneToMany(mappedBy = "finCode")
    private Set<Subject> subjects;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(finCode, student.finCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finCode);
    }
}

