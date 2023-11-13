package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;
public class ServeurJWS {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //create an instance of BanqueService
        BanqueService banqueService =new BanqueService();
        //url to publish web service
        String ur1 = "http://localhost:8084/";
        //publish web service at chosen url
        Endpoint.publish(ur1, banqueService);
        System.out.println("web service published at :" + ur1);
    }
}
