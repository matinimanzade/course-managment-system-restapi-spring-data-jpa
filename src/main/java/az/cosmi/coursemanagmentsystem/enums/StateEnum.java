package az.cosmi.coursemanagmentsystem.enums;

import az.micos.coursemanagmentsystemspringandjpa.exceptions.StateNotFoundException;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.nimbus.State;
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
