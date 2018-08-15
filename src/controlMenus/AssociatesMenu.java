package controlMenus;

import associates.Associate;

import java.util.ArrayList;
import java.util.Scanner;

public class AssociatesMenu {

    public String addAssociateType(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the type of associate to add");
        System.out.println("(1)Junior");
        System.out.println("(2)Senior");
        System.out.println("(3)Elite");

        String option = input.next();
        return option;
    }

    public Associate createAssociate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type the following information for the associate");
        System.out.println("Full name:");
        String name = input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("CPF:");
        String cpf = input.nextLine();
        System.out.println("Phone number:");
        String phoneNumber = input.nextLine();
        System.out.println("Address:");
        String address = input.nextLine();
        boolean defaulter = false;
        Associate temp = new Associate(name,email,cpf,phoneNumber,address,defaulter) ;
        return temp;
    }

    public String changeAssociateStatusType() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the type of associate to change");
        System.out.println("(1)Junior");
        System.out.println("(2)Senior");
        System.out.println("(3)Elite");

        String option = input.next();
        return option;
    }

    public String chooseSearchCpf() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the CPF of associate to change");
        String cpf = input.next();
        return cpf;
    }


    public int changeAssociateContribution(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the type of associate to change the contribution");
        System.out.println("(0)Junior");
        System.out.println("(1)Senior");
        System.out.println("(2)Elite");

        int option = input.nextInt();
        return option;
    }


    public double newContributionValue() {
        System.out.println("Type the new contribution value:");
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        return value;
    }

    public ArrayList<Associate> changeAssociateStatus(ArrayList<Associate> associates, String searchCpf) {
        for (Associate associate : associates) {
            if (associate.getCpf().equals(searchCpf)) {
                if (associate.getDefaulter()) {
                    associate.setDefaulter(false);
                } else {
                    associate.setDefaulter(true);
                }
            }
        }
        return associates;
    }
}
