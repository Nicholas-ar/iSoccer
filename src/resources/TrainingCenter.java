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

    @Override
    public void printInfo(){
        System.out.println("Identifier: " + this.getIdentifier());
        System.out.println("Dormitories: " + this.getDormitories());
        if(this.isAvailable()){
            System.out.println("This training center is currently available");
        }
        else System.out.println("This training center is not currently available");
    }

}
