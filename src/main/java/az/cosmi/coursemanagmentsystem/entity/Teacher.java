package az.cosmi.coursemanagmentsystem.entity;

import az.cosmi.coursemanagmentsystem.model.abstracts.AbstractModel;
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
    private String id;

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String address;

    @ManyToMany(mappedBy = "teachers")
    private Set<Student> students;

    @OneToMany(mappedBy = "teacher")
    private Set<Subject> subjects;

    @ManyToMany(mappedBy = "teachers")
    private Set<Group> groups;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
