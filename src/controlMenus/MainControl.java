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
        ResourcesMenu resourceControl = new ResourcesMenu();
        ResourceView resourceView = new ResourceView();
        AssociatesMenu associateControl = new AssociatesMenu();
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
                                employeeView.addEmployeeSuccessMessage();
                                break;
                            case "2":
                                Medic tempMedic = employeeControl.createMedic();
                                medics.add(tempMedic);
                                employeeView.addEmployeeSuccessMessage();
                                break;
                            case "3":
                                Driver tempDriver = employeeControl.createDriver();
                                drivers.add(tempDriver);
                                employeeView.addEmployeeSuccessMessage();
                                break;
                            case "4":
                                Player tempPlayer = employeeControl.createPlayer();
                                players.add(tempPlayer);
                                employeeView.addEmployeeSuccessMessage();
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }

                        break;
                    case "2":
                        type = associateControl.addAssociateType();
                        Associate tempAssociate;
                        switch (type){
                            case "1":
                                tempAssociate = associateControl.createAssociate();
                                juniors.add(tempAssociate);
                                asssociateView.addAssociateSuccessMessage();
                                break;

                            case "2":
                                tempAssociate = associateControl.createAssociate();
                                seniors.add(tempAssociate);
                                asssociateView.addAssociateSuccessMessage();
                                break;

                            case "3":
                                tempAssociate = associateControl.createAssociate();
                                elites.add(tempAssociate);
                                asssociateView.addAssociateSuccessMessage();
                                break;

                            default:
                                System.out.println("Invalid option.");
                                break;
                        }
                        break;
                    case "3":
                        type = associateControl.changeAssociateStatusType();
                        searchCpf = associateControl.chooseSearchCpf();
                        switch (type){
                            case "1":
                                juniors = associateControl.changeAssociateStatus(juniors,searchCpf);
                                break;
                            case "2":
                                seniors = associateControl.changeAssociateStatus(seniors,searchCpf);
                                break;
                            case "3":
                                elites = associateControl.changeAssociateStatus(elites,searchCpf);
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }

                        break;
                    case "4":
                        associateType = associateControl.changeAssociateContribution();
                        contributionAmount = associateControl.newContributionValue();
                        contributionAmounts[associateType] = contributionAmount;

                        break;
                    case "5":
                        type = resourceControl.whichResource();
                        switch (type){
                            case "1":
                                Resource tempBus = resourceControl.createBus();
                                buses.add(tempBus);
                                break;
                            case "2":
                                Stadium tempStadium = resourceControl.createStadium();
                                stadiums.add(tempStadium);
                                break;
                            case "3":
                                TrainingCenter tempTC = resourceControl.createTC();
                                tcs.add(tempTC);
                                break;
                        }
                        break;
                    case "6":
                        type = resourceControl.manageWhichResource();
                        switch (type){
                            case "1":
                                resourceView.checkBusAvailability(buses);
                                break;
                            case "2":
                                resourceView.checkStadiumAvailability(stadiums);
                                break;
                            case "3":
                                stadiums = resourceControl.changeStadiumSupported(stadiums);
                                break;
                            case "4":
                                stadiums = resourceControl.changeStadiumRestrooms(stadiums);
                                break;
                            case "5":
                                stadiums = resourceControl.changeStadiumSnacks(stadiums);
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
