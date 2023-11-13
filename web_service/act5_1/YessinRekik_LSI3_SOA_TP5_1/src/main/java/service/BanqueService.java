package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    // list of bank accounts
    List<Compte> comptes = new ArrayList<Compte>();

    // WebMethod that returns arg3.3
    @WebMethod
    public double conversion(@WebParam double mnt) {
        return mnt*3.3;
    }

    // WebMethod to generate and get accounts
    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<Compte>();

        // creations of new accounts to return
        comptes.add(new Compte(1, 1500, new Date()));
        comptes.add(new Compte(2, 1200, new Date()));
        comptes.add(new Compte(3, 4500, new Date()));

        return comptes;
    }
}
