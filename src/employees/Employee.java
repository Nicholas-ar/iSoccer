package employees;

public class Employee {
    private String fullName;
    private String email;
    private String cpf;
    private String phoneNumber;
    private double salary;

    public Employee(String fullName,String email, String cpf, String phoneNumber, double salary) {
        this.fullName = fullName;
        this.email = email;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }
}
