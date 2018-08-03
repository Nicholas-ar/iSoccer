package employees;

public class Driver extends Employee {
    private int driverLicenseNumber;

    public Driver(String fullName, String email, String cpf, String phoneNumber, double salary, int driverLicenseNumber) {
        super(fullName, email, cpf, phoneNumber, salary);
        this.driverLicenseNumber = driverLicenseNumber;
    }
}
