package viewMenus;

import employees.Driver;
import employees.Employee;
import employees.Medic;
import employees.Player;

import java.util.ArrayList;

public class EmployeeView {

    public void addEmployeeSuccessMessage(){
        System.out.println("Employee successfully added!");
    }

    public void listTeam(ArrayList<Player> players, ArrayList<Employee> coaches) {
        for (int i = 0; i<coaches.size(); i++){
            System.out.println("Coach number " + (i+1));
            System.out.println(coaches.get(i).toString());
        }
        for (int i = 0; i<players.size(); i++){
            System.out.println("Player number " + (i+1));
            System.out.println(players.get(i).toString());
        }
    }

    public void listAblePlayers(ArrayList<Player> players) {
        int ablePlayers = 1;
        for (int i = 0; i<players.size(); i++){
            if (players.get(i).isCanPlay()){
                System.out.println("Able player number " + ablePlayers);
                System.out.println(players.get(i).toString());
            }
        }
    }

    public void listUnablePlayers(ArrayList<Player> players) {
        int unablePlayers = 1;
        for (int i = 0; i<players.size(); i++){
            if (!players.get(i).isCanPlay()){
                System.out.println("Unable player number " + unablePlayers);
                System.out.println(players.get(i).toString());
            }
        }
    }

    public void listEmployees(ArrayList<Driver> drivers, ArrayList<Medic> medics, ArrayList<Player> players,
                              ArrayList<Employee> coaches, ArrayList<Employee> cooks, ArrayList<Employee> lawyers,
                              ArrayList<Employee> physicalPreparers, ArrayList<Employee> presidents) {
        for (int i = 0; i<presidents.size(); i++){
            System.out.println("President number " + (i+1));
            System.out.println(presidents.get(i).toString());
        }
        for (int i = 0; i<coaches.size(); i++){
            System.out.println("Coach number " + (i+1));
            System.out.println(coaches.get(i).toString());
        }
        for (int i = 0; i<players.size(); i++){
            System.out.println("Player number " + (i+1));
            System.out.println(players.get(i).toString());
        }
        for (int i = 0; i<physicalPreparers.size(); i++){
            System.out.println("Physical preparer number " + (i+1));
            System.out.println(physicalPreparers.get(i).toString());
        }
        for (int i = 0; i<medics.size(); i++){
            System.out.println("Medic number " + (i+1));
            System.out.println(medics.get(i).toString());
        }
        for (int i = 0; i<drivers.size(); i++){
            System.out.println("Driver number " + (i+1));
            System.out.println(drivers.get(i).toString());
        }
        for (int i = 0; i<cooks.size(); i++){
            System.out.println("Cook number " + (i+1));
            System.out.println(cooks.get(i).toString());
        }
        for (int i = 0; i<lawyers.size(); i++){
            System.out.println("Lawyer number " + (i+1));
            System.out.println(lawyers.get(i).toString());
        }
    }

}
