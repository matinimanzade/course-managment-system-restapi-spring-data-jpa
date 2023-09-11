package az.cosmi.coursemanagmentsystem.exceptions.handler;

import az.cosmi.coursemanagmentsystem.exceptions.notfound.NotFoundException;
import az.cosmi.coursemanagmentsystem.exceptions.notfound.StudentNotFoundException;
import az.cosmi.coursemanagmentsystem.model.base.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NotFoundExceptionHandling {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<BaseResponse> handleNotFoundException(NotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(BaseResponse.builder().message(exception.getClass() + " --> not found : " + exception.getMessage()).build());
    }
}
