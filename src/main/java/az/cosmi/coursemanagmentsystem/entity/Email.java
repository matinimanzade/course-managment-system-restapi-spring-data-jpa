package az.cosmi.coursemanagmentsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "Email")
@Table(name = "email")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "email")
    private Student _from;

    private String _to;
    private String subject;
    private String message;
    private LocalDateTime createDate = LocalDateTime.now();
}
