package az.cosmi.coursemanagmentsystem.model.base;

import lombok.Builder;
import lombok.Data;

@Data
public class ResponseModel<T> {
    T data;
    String message;
}
