package viewMenus;

import associates.Associate;

import java.util.ArrayList;

public class AssociateView {
    public void quantityOfAssociates(ArrayList<Associate> juniors, ArrayList<Associate> seniors,
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
