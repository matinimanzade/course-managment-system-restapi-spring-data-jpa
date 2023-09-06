package az.cosmi.coursemanagmentsystem.enums;

import az.cosmi.coursemanagmentsystem.exceptions.StateNotFoundException;
import lombok.Getter;
import java.util.Arrays;

@Getter
public enum StateEnum {
    ACTIVE(1),
    DEACTIVE(0);

    private int statusCode;

    StateEnum(int statusCode) {
        this.statusCode = statusCode;
    }

    public StateEnum getEnumByStatusCode(int statusCode) throws StateNotFoundException {
        return Arrays.stream(StateEnum.values())
                .filter(e -> e.getStatusCode() == statusCode)
                .findFirst()
                .orElseThrow(() -> new StateNotFoundException(statusCode));
    }
}
