package az.cosmi.coursemanagmentsystem.entity;

import az.cosmi.coursemanagmentsystem.model.abstracts.AbstractModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Entity(name = "Group")
@Table(name = "groups")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor // bu bos konstructor @Entity e lazimdir cunki,eger silsek compile time error alacayiq
@AllArgsConstructor // bu konstruktor ise @Builder e lazimdir,eger silsek compile time error alacayiq
public class Group extends AbstractModel {
    @Id
    private String id;

    private String name;

    @ManyToMany
    @JoinTable(name = "group_teacher",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    private Set<Teacher> teachers;

    @OneToMany(mappedBy = "group")
    private Set<Student> students;

    @ManyToMany
    @JoinTable(name = "group_subject",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private Set<Subject> subjects;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
