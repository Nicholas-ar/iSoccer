package controlMenus;

import associates.Associate;
import employees.*;
import resources.*;
import viewMenus.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MainControl {

    public void mainAll() {
        Scanner input = new Scanner(System.in);
        boolean on = true;
        boolean logged = false;
        MainMenus mainMenu = new MainMenus();
        EmployeeMenu employeeControl = new EmployeeMenu();
        EmployeeView employeeView = new EmployeeView();
        ResourcesMenu resourceMenu = new ResourcesMenu();
        ResourceView resourceView = new ResourceView();
        AssociatesMenu associateMenu = new AssociatesMenu();
        AssociateView asssociateView = new AssociateView();

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
                logged = mainMenu.loginMenu();
            }
            while (logged)
            {
                mainMenu.mainMenu();
                String type;
                String searchCpf;
                int associateType;
                double contributionAmount;
                String option = input.nextLine();
                switch (option){
                    case "1":
                        type = employeeControl.addEmployeeType();
                        switch (type){
                            case "1":
                                Employee tempEmployee = employeeControl.createGenericEmployee();
                                String choice = employeeControl.especifyEmployeeType();
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
                                employeeView.successMessage();
                                break;
                            case "2":
                                Medic tempMedic = employeeControl.createMedic();
                                medics.add(tempMedic);
                                employeeView.successMessage();
                                break;
                            case "3":
                                Driver tempDriver = employeeControl.createDriver();
                                drivers.add(tempDriver);
                                employeeView.successMessage();
                                break;
                            case "4":
                                Player tempPlayer = employeeControl.createPlayer();
                                players.add(tempPlayer);
                                employeeView.successMessage();
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }

                        break;
                    case "2":
                        type = associateMenu.addAssociateType();
                        Associate tempAssociate;
                        switch (type){
                            case "1":
                                tempAssociate = associateMenu.createAssociate();
                                juniors.add(tempAssociate);
                                associateMenu.successMessage();
                                break;

                            case "2":
                                tempAssociate = associateMenu.createAssociate();
                                seniors.add(tempAssociate);
                                associateMenu.successMessage();
                                break;

                            case "3":
                                tempAssociate = associateMenu.createAssociate();
                                elites.add(tempAssociate);
                                associateMenu.successMessage();
                                break;

                            default:
                                System.out.println("Invalid option.");
                                break;
                        }
                        break;
                    case "3":
                        type = associateMenu.changeAssociateStatus();
                        searchCpf = associateMenu.chooseSearchCpf();
                        switch (type){
                            case "1":
                                for (Associate junior : juniors) {
                                    if (junior.getCpf().equals(searchCpf)) {
                                        if (junior.getDefaulter()) {
                                            junior.setDefaulter(false);
                                        } else {
                                            junior.setDefaulter(true);
                                        }
                                    }
                                }
                                break;
                            case "2":
                                for (Associate senior : seniors) {
                                    if (senior.getCpf().equals(searchCpf)) {
                                        if (senior.getDefaulter()) {
                                            senior.setDefaulter(false);
                                        } else {
                                            senior.setDefaulter(true);
                                        }
                                    }
                                }
                                break;
                            case "3":
                                for (Associate elite : elites) {
                                    if (elite.getCpf().equals(searchCpf)) {
                                        if (elite.getDefaulter()) {
                                            elite.setDefaulter(false);
                                        } else {
                                            elite.setDefaulter(true);
                                        }
                                    }
                                }
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }

                        break;
                    case "4":
                        associateType = associateMenu.changeAssociateContribution();
                        contributionAmount = associateMenu.newContributionValue();
                        contributionAmounts[associateType] = contributionAmount;

                        break;
                    case "5":
                        type = resourceMenu.whichResource();
                        switch (type){
                            case "1":
                                Resource tempBus = resourceMenu.createBus();
                                buses.add(tempBus);
                                break;
                            case "2":
                                Stadium tempStadium = resourceMenu.createStadium();
                                stadiums.add(tempStadium);
                                break;
                            case "3":
                                TrainingCenter tempTC = resourceMenu.createTC();
                                tcs.add(tempTC);
                                break;
                        }
                        break;
                    case "6":
                        type = resourceMenu.manageWhichResource();
                        switch (type){
                            case "1":
                                resourceView.checkBusAvailability(buses);
                                break;
                            case "2":
                                resourceView.checkStadiumAvailability(stadiums);
                                break;
                            case "3":
                                stadiums = resourceMenu.changeStadiumSupported(stadiums);
                                break;
                            case "4":
                                stadiums = resourceMenu.changeStadiumRestrooms(stadiums);
                                break;
                            case "5":
                                stadiums = resourceMenu.changeStadiumSnacks(stadiums);
                                break;
                            case "6":
                                resourceView.checkTCAvailability(tcs);
                                break;
                        }
                        break;
                    case "7":
                        type = mainMenu.reportMenu();
                        switch (type){
                            case "1":
                                employeeView.listTeam(players,coaches);
                                break;
                            case "2":
                                employeeView.listAblePlayers(players);
                                break;
                            case "3":
                                employeeView.listUnablePlayers(players);
                                break;
                            case "4":
                                employeeView.listEmployees(drivers,medics,players,coaches,cooks,lawyers,physicalPreparers,
                                        presidents);
                                break;
                            case "5":
                                resourceView.showBusesInfo(buses);
                                break;
                            case "6":
                                resourceView.showStadiumInfo(stadiums);
                                break;
                            case "7":
                                resourceView.showTCinfo(tcs);
                                break;
                            case "8":
                                asssociateView.quantityOfAssociates(juniors,seniors,elites);
                                break;
                            case "9":
                                asssociateView.nonDefaultingAssociates(juniors,seniors,elites);
                                break;
                            case "10":
                                asssociateView.defaultingAssociates(juniors,seniors,elites);
                                break;
                            case "11":
                                asssociateView.listAssociates(juniors,seniors,elites);
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
