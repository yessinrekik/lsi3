package Service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService
public class CalculatriceWS {

    //webmethod to specify the name of the method to be used
    @WebMethod(operationName = "somme")

    //the method requires values a & b to be implemented
    public double somme (@WebParam(name = "a") double a,@WebParam(name = "b") double b) {
        return a+b;
    }
}