package employees;

public class Medic extends Employee {
    private int crm;

    public Medic(String fullName, String email, String cpf, String phoneNumber, double salary, int crm) {
        super(fullName, email, cpf, phoneNumber, salary);
        this.crm = crm;
    }
}
