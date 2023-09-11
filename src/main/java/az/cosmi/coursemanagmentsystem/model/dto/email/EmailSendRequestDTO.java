package az.cosmi.coursemanagmentsystem.model.dto.email;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmailSendRequestDTO {
    String from;
    String to;
    String subject;
    String message;
}
