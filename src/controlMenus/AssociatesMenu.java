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

    public void successMessage(){
        System.out.println("Associate successfully added!");
    }

    public String changeAssociateStatus() {
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

    public void quantityOfAssociates(ArrayList<Associate> juniors,ArrayList<Associate> seniors,
                                            ArrayList<Associate> elites) {
        int quantity = 0;
        quantity+=(juniors.size());
        quantity+=(seniors.size());
        quantity+=(elites.size());
        System.out.println("There are " + quantity +" associates.");
    }

    public void nonDefaultingAssociates(ArrayList<Associate> juniors,ArrayList<Associate> seniors,
                                               ArrayList<Associate> elites) {
        int quantity = 0;
        for (int i = 0; i < juniors.size(); i++)
        {
            if(juniors.get(i).getDefaulter()){
                quantity++;
            }
        }
        for (int i = 0; i < seniors.size(); i++)
        {
            if(seniors.get(i).getDefaulter()){
                quantity++;
            }
        }
        for (int i = 0; i < elites.size(); i++)
        {
            if(elites.get(i).getDefaulter()){
                quantity++;
            }
        }
        System.out.println("There are " + quantity + " defaulting associates.");
    }

    public void defaultingAssociates(ArrayList<Associate> juniors,ArrayList<Associate> seniors,
                                               ArrayList<Associate> elites) {
        int quantity = 0;
        for (int i = 0; i < juniors.size(); i++)
        {
            if(!juniors.get(i).getDefaulter()){
                quantity++;
            }
        }
        for (int i = 0; i < seniors.size(); i++)
        {
            if(!seniors.get(i).getDefaulter()){
                quantity++;
            }
        }
        for (int i = 0; i < elites.size(); i++)
        {
            if(!elites.get(i).getDefaulter()){
                quantity++;
            }
        }
        System.out.println("There are " + quantity + " non defaulting associates.");
    }

    public void listAssociates(ArrayList<Associate> juniors, ArrayList<Associate> seniors,
                                      ArrayList<Associate> elites) {
        for (int i = 0; i<juniors.size(); i++){
            System.out.println("Junior associate number " + (i+1));
            juniors.get(i).printInfo();
        }
        for (int i = 0; i<seniors.size(); i++){
            System.out.println("Senior associate number " + (i+1));
            seniors.get(i).printInfo();
        }
        for (int i = 0; i<elites.size(); i++){
            System.out.println("Elite associate number " + (i+1));
            elites.get(i).printInfo();
        }
    }
}
