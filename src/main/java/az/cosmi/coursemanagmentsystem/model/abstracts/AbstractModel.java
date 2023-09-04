package az.cosmi.coursemanagmentsystem.model.abstracts;

import az.micos.coursemanagmentsystemspringandjpa.enums.StateEnum;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractModel {
    @Column(name = "created_time")
    private LocalDateTime createdTime;
    @Column(name = "state")
    private StateEnum state;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractModel that = (AbstractModel) o;
        return Objects.equals(createdTime, that.createdTime) && state == that.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdTime, state);
    }
}
