package srp;

public interface IEmployeeStore {

    Employee getEmployee(Long id);

    void saveEmployee(Employee employee);

}
