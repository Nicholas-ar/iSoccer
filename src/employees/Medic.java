package employees;

public class Medic extends Employee {
    private int crm;

    public Medic(String fullName, String email, String cpf, String phoneNumber, double salary, int crm) {
        super(fullName, email, cpf, phoneNumber, salary);
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() + "CRM: " + crm + '\n';
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
}
