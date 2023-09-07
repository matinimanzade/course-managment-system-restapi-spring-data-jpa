package az.cosmi.coursemanagmentsystem.entity;

import az.cosmi.coursemanagmentsystem.model.abstracts.AbstractModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Entity(name = "subject")
@Table(name = "subject")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subject extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "subject_teacher",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns =@JoinColumn(name = "teacher_id"))
    private Set<Teacher> teachers;

    @ManyToMany
    @JoinTable(name = "subject_student",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns =@JoinColumn(name = "student_id"))
    private Set<Student> students;

    @ManyToMany(mappedBy = "subjects")
    private Set<Group> groups;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(id, subject.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
