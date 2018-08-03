package menus;

import employees.*;

import java.util.Scanner;

public class EmployeeMenu {

    public static String addEmployeeType(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the type of employee to add");
        System.out.println("(1)President, coach, physical preparer, cook or lawyer");
        System.out.println("(2)Medic");
        System.out.println("(3)Driver");
        System.out.println("(4)Player");

        String option = input.next();
        return option;
    }

    public static void successMessage(){
        System.out.println("Employee successfully added!");
    }

    public static Employee createGenericEmployee(){
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

    public static String especifyEmployeeType() {
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

    public static Medic createMedic() {
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

    public static Driver createDriver() {
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

    public static Player createPlayer() {
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
}
