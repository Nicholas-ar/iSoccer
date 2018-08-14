package viewMenus;

import resources.*;

import java.util.ArrayList;

public class ResourceView {

    public void checkBusAvailability(ArrayList<Resource> buses) {
        int availableBuses = 0;
        for (Resource buse : buses) {
            if (buse.isAvailable()) {
                availableBuses++;
            }
        }
        if (availableBuses == 0){
            System.out.println("No available buses.");
        }
        else System.out.println("There is(are) " + availableBuses +" available bus(es)");
    }


    public void checkStadiumAvailability(ArrayList<Stadium> stadiums) {
        int availableStadiums = 0;
        for (int i = 0; i<stadiums.size(); i++){
            if (stadiums.get(i).isAvailable()){
                availableStadiums++;
            }
        }
        if (availableStadiums == 0){
            System.out.println("No available stadiums.");
        }
        else System.out.println("There is(are) " + availableStadiums +" available stadium(s)");
    }

    public void checkTCAvailability(ArrayList<TrainingCenter> tcs) {
        int availableTCs = 0;
        for (int i = 0; i<tcs.size(); i++){
            if (tcs.get(i).isAvailable()){
                availableTCs++;
            }
        }
        if (availableTCs == 0){
            System.out.println("No available training centers.");
        }
        else System.out.println("There is(are) " + availableTCs +" available training center(s)");
    }

    public void showBusesInfo(ArrayList<Resource> buses) {

        for (int i = 0; i<buses.size(); i++){
            System.out.println("Bus number " + (i+1));
            buses.get(i).printInfo();
        }

    }

    public void showStadiumInfo(ArrayList<Stadium> stadiums) {

        for (int i = 0; i<stadiums.size(); i++){
            System.out.println("Stadium center number " + (i+1));
            stadiums.get(i).printInfo();
        }

    }

    public void showTCinfo(ArrayList<TrainingCenter> tcs) {

        for (int i = 0; i<tcs.size(); i++){
            System.out.println("Training center number " + (i+1));
            tcs.get(i).printInfo();
        }

    }

}
