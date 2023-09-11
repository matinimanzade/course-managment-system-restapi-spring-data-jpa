package az.cosmi.coursemanagmentsystem.model.base;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseResponse<T> {
    T data;
    String message;
}
