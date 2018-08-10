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

    public void printInfo(){
        System.out.println("Full name: " + this.getFullName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Phone number: " + this.getPhoneNumber());
        System.out.println("Salary: " + this.getSalary());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
