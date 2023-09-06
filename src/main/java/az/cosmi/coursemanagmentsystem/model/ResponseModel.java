package az.cosmi.coursemanagmentsystem.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseModel<T> {
    T data;
    String message;
}
