package resources;

public class Stadium extends Resource{
    private int supportedEspectators;
    private int restrooms;
    private int snackBars;

    public Stadium(boolean available, String identifier, int supportedEspectators, int restrooms, int snackBars) {
        super(available, identifier);
        this.supportedEspectators = supportedEspectators;
        this.restrooms = restrooms;
        this.snackBars = snackBars;
    }

    public int getSupportedEspectators() {
        return supportedEspectators;
    }

    public void setSupportedEspectators(int supportedEspectators) {
        this.supportedEspectators = supportedEspectators;
    }

    public int getRestrooms() {
        return restrooms;
    }

    public void setRestrooms(int restrooms) {
        this.restrooms = restrooms;
    }

    public int getSnackBars() {
        return snackBars;
    }

    public void setSnackBars(int snackBars) {
        this.snackBars = snackBars;
    }
}
