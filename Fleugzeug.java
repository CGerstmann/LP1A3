package projetolp1a3;

public class Fleugzeug 
{
	protected String Modelo;
	
	public Fleugzeug(String Modelo)
	{
		this.Modelo = Modelo;
	}

	public String getModelo() 
	{
		return Modelo;
	}

	public void setModelo(String modelo) 
	{
		Modelo = modelo;
	}
}