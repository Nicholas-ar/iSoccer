package menus;

import associates.Associate;
import employees.*;
import resources.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean on = true;
        boolean logged = false;

        ArrayList<Driver> drivers = new ArrayList();
        ArrayList<Medic> medics = new ArrayList();
        ArrayList<Player> players = new ArrayList();
        ArrayList<Employee> coaches = new ArrayList();
        ArrayList<Employee> cooks = new ArrayList();
        ArrayList<Employee> lawyers = new ArrayList();
        ArrayList<Employee> physicalPreparers = new ArrayList();
        ArrayList<Employee> presidents = new ArrayList();

        ArrayList<Associate> juniors = new ArrayList();
        ArrayList<Associate> seniors = new ArrayList();
        ArrayList<Associate> elites = new ArrayList();
        double contributionAmounts[];
        contributionAmounts = new double[3];//0 for junior, 1 for Senior, 2 for Elite

        ArrayList<Resource> buses = new ArrayList();
        ArrayList<Stadium> stadiums = new ArrayList();
        ArrayList<TrainingCenter> tcs = new ArrayList();

        while (on) {

            while (!logged) {
                logged = MainMenus.loginMenu();
            }
            while (logged)
            {
                MainMenus.mainMenu();
                String type;
                String searchCpf;
                int associateType;
                double contributionAmount;
                String option = input.nextLine();
                switch (option){
                    case "1":
                        type = EmployeeMenu.addEmployeeType();
                        switch (type){
                            case "1":
                                Employee tempEmployee = EmployeeMenu.createGenericEmployee();
                                String choice = EmployeeMenu.especifyEmployeeType();
                                switch (choice){
                                    case "1":
                                        presidents.add(tempEmployee);
                                        break;
                                    case "2":
                                        coaches.add(tempEmployee);
                                        break;
                                    case "3":
                                        physicalPreparers.add(tempEmployee);
                                        break;
                                    case "4":
                                        cooks.add(tempEmployee);
                                        break;
                                    case "5":
                                        lawyers.add(tempEmployee);
                                        break;
                                }
                                EmployeeMenu.successMessage();
                                break;
                            case "2":
                                Medic tempMedic = EmployeeMenu.createMedic();
                                medics.add(tempMedic);
                                EmployeeMenu.successMessage();
                                break;
                            case "3":
                                Driver tempDriver = EmployeeMenu.createDriver();
                                drivers.add(tempDriver);
                                EmployeeMenu.successMessage();
                                break;
                            case "4":
                                Player tempPlayer = EmployeeMenu.createPlayer();
                                players.add(tempPlayer);
                                EmployeeMenu.successMessage();
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }

                        break;
                    case "2":
                        type = AssociateMenu.addAssociateType();
                        Associate tempAssociate;
                        switch (type){
                            case "1":
                                tempAssociate = AssociateMenu.createAssociate();
                                juniors.add(tempAssociate);
                                AssociateMenu.successMessage();
                                break;

                            case "2":
                                tempAssociate = AssociateMenu.createAssociate();
                                seniors.add(tempAssociate);
                                AssociateMenu.successMessage();
                                break;

                            case "3":
                                tempAssociate = AssociateMenu.createAssociate();
                                elites.add(tempAssociate);
                                AssociateMenu.successMessage();
                                break;

                            default:
                                System.out.println("Invalid option.");
                                break;
                        }
                        break;
                    case "3":
                        type = AssociateMenu.changeAssociateStatus();
                        searchCpf = AssociateMenu.chooseSearchCpf();
                        switch (type){
                            case "1":
                                for(int i = 0; i<juniors.size();i++){
                                    if(juniors.get(i).getCpf().equals(searchCpf)){
                                        if (juniors.get(i).getDefaulter()){
                                            juniors.get(i).setDefaulter(false);
                                        }
                                        else {
                                            juniors.get(i).setDefaulter(true);
                                        }
                                    }
                                }
                                break;
                            case "2":
                                for(int i = 0; i<seniors.size();i++){
                                    if(seniors.get(i).getCpf().equals(searchCpf)){
                                        if (seniors.get(i).getDefaulter()){
                                            seniors.get(i).setDefaulter(false);
                                        }
                                        else {
                                            seniors.get(i).setDefaulter(true);
                                        }
                                    }
                                }
                                break;
                            case "3":
                                for(int i = 0; i<elites.size();i++){
                                    if(elites.get(i).getCpf().equals(searchCpf)){
                                        if (elites.get(i).getDefaulter()){
                                            elites.get(i).setDefaulter(false);
                                        }
                                        else {
                                            elites.get(i).setDefaulter(true);
                                        }
                                    }
                                }
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }

                        break;
                    case "4":
                        associateType = AssociateMenu.changeAssociateContribution();
                        contributionAmount = AssociateMenu.newContributionValue();
                        contributionAmounts[associateType] = contributionAmount;

                        break;
                    case "5":
                        type = ResourcesMenu.whichResource();
                        switch (type){
                            case "1":
                                Resource tempBus = ResourcesMenu.createBus();
                                buses.add(tempBus);
                                break;
                            case "2":
                                Stadium tempStadium = ResourcesMenu.createStadium();
                                stadiums.add(tempStadium);
                                break;
                            case "3":
                                TrainingCenter tempTC = ResourcesMenu.createTC();
                                tcs.add(tempTC);
                                break;
                        }
                        break;
                    case "6":
                        type = ResourcesMenu.manageWhichResource();
                        switch (type){
                            case "1":
                                ResourcesMenu.checkBusAvailability(buses);
                                break;
                            case "2":
                                ResourcesMenu.checkStadiumAvailability(stadiums);
                                break;
                            case "3":
                                stadiums = ResourcesMenu.changeStadiumSupported(stadiums);
                                break;
                            case "4":
                                stadiums = ResourcesMenu.changeStadiumRestrooms(stadiums);
                                break;
                            case "5":
                                stadiums = ResourcesMenu.changeStadiumSnacks(stadiums);
                                break;
                            case "6":
                                ResourcesMenu.checkTCAvailability(tcs);
                                break;
                        }
                        break;
                    case "7":
                        type = MainMenus.reportMenu();
                        switch (type){
                            case "1":
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            case "4":
                                break;
                            case "5":
                                break;
                            case "6":
                                break;
                            case "7":
                                break;
                            case "8":
                                AssociateMenu.quantityOfAssociates(juniors,seniors,elites);
                                break;
                            case "9":
                                AssociateMenu.nonDefaultingAssociates(juniors,seniors,elites);
                                break;
                            case "10":
                                AssociateMenu.defaultingAssociates(juniors,seniors,elites);
                                break;
                            case "11":
                                AssociateMenu.listAssociates(juniors,seniors,elites);
                                break;
                        }
                        break;
                    case "8":
                        System.out.println("Logging off.");
                        logged = false;
                        break;
                    case "9":
                        System.out.println("Goodbye!");
                        on = logged = false;
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }


            }
        }

    }

}
