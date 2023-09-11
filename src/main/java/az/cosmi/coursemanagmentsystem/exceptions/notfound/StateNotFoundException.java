package az.cosmi.coursemanagmentsystem.exceptions.notfound;

public class StateNotFoundException extends NotFoundException {
    public StateNotFoundException(int statusCode) {
        super("State not found for this code :" + statusCode);
    }
}
