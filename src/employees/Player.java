package employees;

public class Player extends Employee {
    private String playerPosition;
    private boolean canPlay;

    public Player(String fullName, String email, String cpf, String phoneNumber, double salary, String playerPosition, boolean canPlay) {
        super(fullName, email, cpf, phoneNumber, salary);
        this.playerPosition = playerPosition;
        this.canPlay = canPlay;
    }
}
