package projetolp1a3;

public class Avion extends Fleugzeug{
	
	public Passageiro[][] lugares;
	
	public Avion(String Model, int a, int b) {
		super(Model);
		lugares = new Passageiro[a][b];
	}
	
	public boolean VerificaLugarOcupado(int a, int b)
	{
		return lugares[a][b] == null ? false : true;
	}
	
	public Passageiro GetPassageiro(int a, int b) {
		return lugares[a][b];
	}
	
	public void SetPassageiro(int a, int b, Passageiro pass)
	{
		this.lugares[a][b] = pass;
	}
	
	

}
