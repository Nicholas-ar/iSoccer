package resources;

public class Resource {
    private boolean available;
    private String identifier;

    public Resource(boolean available, String identifier) {
        this.available = available;
        this.identifier = identifier;
    }

    public void printInfo(){
        System.out.println("Identifier: " + this.getIdentifier());
        if(this.isAvailable()){
            System.out.println("This bus is currently available");
        }
        else System.out.println("This bus is not currently available");
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }






}
