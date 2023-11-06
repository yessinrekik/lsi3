package Server;


import Service.CalculatriceWS;
import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        // create an instance of the class CalculatriceWS
        CalculatriceWS calculatrice =new CalculatriceWS();

        //choose the url where the web service will be accessible
        String ur1 = "http://localhost:8084/";

        //Endpoint.publish: to publish the web service
        Endpoint.publish(ur1, calculatrice);
        System.out.println("web service published at :" + ur1);
    }
}