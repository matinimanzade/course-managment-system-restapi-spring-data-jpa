package az.cosmi.coursemanagmentsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "Mail")
@Table(name = "mail")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    @Id
    private Long id;
    private String from;
    private String to;
    private String subject;
    private String message;
    private LocalDateTime createDate = LocalDateTime.now();
}
