package menus;

import java.util.Scanner;

public class MainMenus {

    private static String adminLogin = "Test";
    private static String adminPassword = "1234";

    public static void mainMenu(){
        System.out.println("iSoccer - Main");
        System.out.println("Choose an option:");
        System.out.println("(1)Add employee");
        System.out.println("(2)Add associate");
        System.out.println("(3)Change associate status");
        System.out.println("(4)Change associate contribution amount");
        System.out.println("(5)Add resources");
        System.out.println("(6)Manage resources");
        System.out.println("(7)Get resources report");
        System.out.println("(8)Log off");
        System.out.println("(9)Shut down");
    }

    public static boolean loginMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("iSoccer - Login");
        System.out.println("Login:");
        String loginInput = input.nextLine();
        System.out.println("Password:");
        String passwordInput = input.nextLine();
        if (loginInput.equals(adminLogin) && passwordInput.equals(adminPassword)) {
            System.out.println("Success!!!");
            return true;
        }
        else {
            System.out.println("Wrong credentials, try again!");
            return false;
        }
    }

    public static String reportMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("(1)Show coach and players info");
        System.out.println("(2)Show players that can play");
        System.out.println("(3)Show players that can't play");
        System.out.println("(4)List employees");
        System.out.println("(5)Show buses info");
        System.out.println("(6)Show stadiums info");
        System.out.println("(7)Show training centers info");
        System.out.println("(8)Show quantity of associates");
        System.out.println("(9)Show quantity of non defaulting associates");
        System.out.println("(10)Show quantity of defaulting associates");
        System.out.println("(11)Show associates info");
        String option = input.next();
        return option;
    }
}
