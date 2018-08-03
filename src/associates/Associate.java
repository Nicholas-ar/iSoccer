package associates;

public class Associate {
    private String name;
    private String email;
    private String cpf;
    private String phoneNumber;
    private String address;
    private Boolean defaulter;

    public Associate(String name,String email, String cpf, String phoneNumber, String address, Boolean defaulter) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.defaulter = defaulter;
    }

    @Override
    public String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", defaulter=" + defaulter +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDefaulter(Boolean defaulter) {
        this.defaulter = defaulter;
    }

    public String getName() {

        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getDefaulter() {
        return defaulter;
    }
}
