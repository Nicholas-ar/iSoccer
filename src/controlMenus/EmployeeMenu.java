package controlMenus;

import employees.*;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMenu {

    public String addEmployeeType(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the type of employee to add");
        System.out.println("(1)President, coach, physical preparer, cook or lawyer");
        System.out.println("(2)Medic");
        System.out.println("(3)Driver");
        System.out.println("(4)Player");

        String option = input.next();
        return option;
    }

    public void successMessage(){
        System.out.println("Employee successfully added!");
    }

    public Employee createGenericEmployee(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type the following information for the employee");
        System.out.println("Full name:");
        String name = input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("CPF:");
        String cpf = input.nextLine();
        System.out.println("Phone number:");
        String phoneNumber = input.nextLine();
        System.out.println("Salary:");
        double salary = input.nextDouble();
        Employee temp = new Employee(name,email,cpf,phoneNumber,salary);
        return temp;
    }

    public String especifyEmployeeType() {
        System.out.println("Especify the employee type:");
        System.out.println("(1)President");
        System.out.println("(2)Coach");
        System.out.println("(3)Physical preparer");
        System.out.println("(4)Cook");
        System.out.println("(5)Lawyer");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        return choice;
    }

    public Medic createMedic() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the following information for the employee");
        System.out.println("Full name:");
        String name = input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("CPF:");
        String cpf = input.nextLine();
        System.out.println("Phone number:");
        String phoneNumber = input.nextLine();
        System.out.println("Salary:");
        double salary = input.nextDouble();
        System.out.println("CRM:");
        int crm = input.nextInt();
        Medic temp = new Medic(name,email,cpf,phoneNumber,salary,crm);
        return temp;
    }

    public Driver createDriver() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the following information for the employee");
        System.out.println("Full name:");
        String name = input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("CPF:");
        String cpf = input.nextLine();
        System.out.println("Phone number:");
        String phoneNumber = input.nextLine();
        System.out.println("Salary:");
        double salary = input.nextDouble();
        System.out.println("Driver's license number:");
        int cnh = input.nextInt();
        Driver temp = new Driver(name,email,cpf,phoneNumber,salary,cnh);
        return temp;
    }

    public Player createPlayer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the following information for the employee");
        System.out.println("Full name:");
        String name = input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("CPF:");
        String cpf = input.nextLine();
        System.out.println("Phone number:");
        String phoneNumber = input.nextLine();
        System.out.println("Salary:");
        double salary = input.nextDouble();
        System.out.println("Position(volante, zagueiro, meia, goleiro, atacante, lateral esquerdo, lateral direito):");
        String position = input.nextLine();
        boolean ableToPlay = true;
        Player temp = new Player(name,email,cpf,phoneNumber,salary,position,ableToPlay);
        return temp;
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

    public void listEmployees(ArrayList<Driver> drivers,ArrayList<Medic> medics,ArrayList<Player> players,
                                     ArrayList<Employee> coaches,ArrayList<Employee> cooks,ArrayList<Employee> lawyers,
                                     ArrayList<Employee> physicalPreparers,ArrayList<Employee> presidents) {
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