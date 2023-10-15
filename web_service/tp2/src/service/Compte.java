package service;

public class Compte {
	int code;
	double solde;
	String data;
	
	public Compte(int code, double solde, String data) {
		super();
		this.code = code;
		this.solde = solde;
		this.data = data;
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
