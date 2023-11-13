package client;

import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.Scanner;

public class ClientWS {
    public static void main(String[] args) {

        // create instance of web service "banqueService" using the proxy
        BanqueService banqueService = new BanqueServiceService().getBanqueServicePort();

        // take user input (montant)
        System.out.println("Enter amount :");
        Scanner scanner = new Scanner(System.in);
        double montant = scanner.nextDouble();
        System.out.println("amount before conversion:" + montant);

        // call method "conversion" through web service
        System.out.println("\namount after conversion:" + banqueService.conversion(montant));

        // for loop to go through bank accounts returned from "getComptes" and display them
        for (Compte compte : banqueService.getComptes()) {
            System.out.println("account N°" + compte.getCode() + " has : " + compte.getSolde() + " $\n");
        }
    }
}