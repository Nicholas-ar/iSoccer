package employees;

public class Player extends Employee {
    private String playerPosition;
    private boolean canPlay;

    public Player(String fullName, String email, String cpf, String phoneNumber, double salary, String playerPosition,
                  boolean canPlay) {
        super(fullName, email, cpf, phoneNumber, salary);
        this.playerPosition = playerPosition;
        this.canPlay = canPlay;
    }

    @Override
    public String toString() {
        if(canPlay)
            return super.toString() + "Player position: " + playerPosition + '\n' + "This player can currently play" + '\n';
        else
            return super.toString() + "Player position: " + playerPosition + '\n' + "This player can't currently play" + '\n';
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public boolean isCanPlay() {
        return canPlay;
    }

    public void setCanPlay(boolean canPlay) {
        this.canPlay = canPlay;
    }

}
