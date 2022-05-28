package srp;

public interface IEmailSender {

    void sendEmail(Employee employee, IEmailContent emailContent);

}
