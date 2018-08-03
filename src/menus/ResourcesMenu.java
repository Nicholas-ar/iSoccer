package menus;

import resources.Resource;
import resources.Stadium;
import resources.TrainingCenter;

import java.util.ArrayList;
import java.util.Scanner;

public class ResourcesMenu {


    public static String whichResource() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose amongst the resources");
        System.out.println("(1)Bus");
        System.out.println("(2)Stadium");
        System.out.println("(3)Training Center");
        String choice = input.nextLine();
        return choice;
    }

    public static Resource createBus() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the following info for the new bus");
        System.out.println("Is the bus currently available?");
        String availability = input.next();
        boolean available;
        if (availability.contains("y") || availability.contains("Y") ){
            available = true;
        }
        else available = false;
        System.out.println("Type the identifier for the bus");
        String identifier = input.nextLine();
        Resource bus = new Resource(available,identifier);
        return bus;
    }

    public static Stadium createStadium() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the following info for the new stadium");
        System.out.println("Is the stadium currently available?");
        String availability = input.next();
        boolean available;
        if (availability.contains("y") || availability.contains("Y") ){
            available = true;
        }
        else available = false;
        System.out.println("Type the identifier for the stadium");
        String identifier = input.nextLine();
        System.out.println("How many people does the stadium support?");
        int capacity = input.nextInt();
        System.out.println("How many restrooms does the stadium have?");
        int restrooms = input.nextInt();
        System.out.println("How many snack bars does the stadium have?");
        int snacks = input.nextInt();

        Stadium stadium = new Stadium(available,identifier,capacity,restrooms,snacks);
        return stadium;
    }

    public static TrainingCenter createTC() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the following info for the new training center");
        System.out.println("Is the training center currently available?");
        String availability = input.next();
        boolean available;
        if (availability.contains("y") || availability.contains("Y") ){
            available = true;
        }
        else available = false;
        System.out.println("Type the identifier for the training center");
        String identifier = input.nextLine();
        System.out.println("How many dormitories does the training center have?");
        int dormitories = input.nextInt();

        TrainingCenter tc = new TrainingCenter(available,identifier,dormitories);
        return tc;
    }

    public static String manageWhichResource() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("(1)Check buses availability");
        System.out.println("(2)Check stadiums availability");
        System.out.println("(3)Change supported people amount");
        System.out.println("(4)Change restrooms quantity");
        System.out.println("(5)Change snack bars quantity");
        System.out.println("(6)Check training centers availability");
        String option = input.nextLine();
        return option;
    }

    public static void checkBusAvailability(ArrayList<Resource> buses) {
        int availableBuses = 0;
        for (int i = 0; i<buses.size(); i++){
            if (buses.get(i).isAvailable()){
                availableBuses++;
            }
        }
        if (availableBuses == 0){
            System.out.println("No available buses.");
        }
        else System.out.println("There is(are) " + availableBuses +" available bus(es)");
    }


    public static void checkStadiumAvailability(ArrayList<Stadium> stadiums) {
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

    public static void checkTCAvailability(ArrayList<TrainingCenter> tcs) {
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

    public static ArrayList<Stadium> changeStadiumSupported(ArrayList<Stadium> stadiums) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the identifier of the stadium you wish to modify");
        String identifier = input.nextLine();
        for (int i = 0; i<stadiums.size(); i++){
            if (stadiums.get(i).getIdentifier().equals(identifier)){
                System.out.println("Stadium found! Type the new number of supported people");
                int supportedPeople = input.nextInt();
                stadiums.get(i).setSupportedEspectators(supportedPeople);
            }
        }
        return stadiums;
    }

    public static ArrayList<Stadium> changeStadiumRestrooms(ArrayList<Stadium> stadiums) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the identifier of the stadium you wish to modify");
        String identifier = input.nextLine();
        for (int i = 0; i<stadiums.size(); i++){
            if (stadiums.get(i).getIdentifier().equals(identifier)){
                System.out.println("Stadium found! Type the new number of restrooms");
                int restrooms = input.nextInt();
                stadiums.get(i).setRestrooms(restrooms);
            }
        }
        return stadiums;
    }

    public static ArrayList<Stadium> changeStadiumSnacks(ArrayList<Stadium> stadiums) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the identifier of the stadium you wish to modify");
        String identifier = input.nextLine();
        for (int i = 0; i<stadiums.size(); i++){
            if (stadiums.get(i).getIdentifier().equals(identifier)){
                System.out.println("Stadium found! Type the new number of snack bars");
                int snackBars = input.nextInt();
                stadiums.get(i).setSnackBars(snackBars);
            }
        }
        return stadiums;
    }
}

