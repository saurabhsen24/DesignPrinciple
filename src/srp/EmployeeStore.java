package srp;

public class EmployeeStore implements IEmployeeStore {

    private IEmailSender emailSender;

    @Override
    public Employee getEmployee(Long id) {
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    public void sendEmailToAbc() {
        emailSender.sendEmail(getEmployee(1234L),new TextContent());
    }
}
