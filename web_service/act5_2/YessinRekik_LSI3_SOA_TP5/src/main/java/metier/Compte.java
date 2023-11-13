package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement //-> instances of this class can be used for the serializable/deserializable xml

@XmlAccessorType(XmlAccessType.FIELD) //-> direct access to the field
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date date;
    public Compte() {
        super();
    }
    public Compte(int code, double solde, Date date) {
        this.code = code;
        this.solde = solde;
        this.date = date;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
