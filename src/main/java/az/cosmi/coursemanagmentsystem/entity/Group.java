package az.cosmi.coursemanagmentsystem.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.grammars.hql.HqlParser;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "group")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor // bu bos konstructor @Entity e lazimdir cunki,eger silsek compile time error alacayiq
@AllArgsConstructor // bu konstruktor ise @Builder e lazimdir,eger silsek compile time error alacayiq
public class Group {
    @Id
    private String id;
    private String name;
    @ManyToOne
    private Teacher teacher;
    @OneToMany
    private Set<Student> students;

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
