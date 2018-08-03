package resources;

public class TrainingCenter extends Resource{
    private int dormitories;

    public TrainingCenter(boolean available, String identifier, int dormitories) {
        super(available, identifier);
        this.dormitories = dormitories;
    }

    public int getDormitories() {
        return dormitories;
    }
}
