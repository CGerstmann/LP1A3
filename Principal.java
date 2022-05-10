package projetolp1a3;
import javax.swing.*;

public class Principal {
	Flight[] Flights = new Flight[10];
	public static void main(String [] args){
		
		int menu;
		do{
			String temp = "";
			try{
				temp = JOptionPane.showInputDialog("Willkommen aus Fleugzeug management!"
													+ "\n 1 - Parametros do sistema"
													+ "\n 2 - Reserva de passagens"
													+ "\n 3 - Voltar");
				menu = Integer.parseInt(temp);
			}
			catch(Exception e){
				menu = temp == null ? 4 : 3;
			}
			switch(menu){
				case 1: Sistema(); break;
				case 2: Reserva(); break;
				case 3: JOptionPane.showMessageDialog(null, "Houve um erro, tente novamente!");break;
				case 4: break;
				default: break;
			}	
		}
		while (menu != 4);
	}
	
	public static void Sistema(){
		int menu;
		do{
			String temp = "";
			try{
			temp = JOptionPane.showInputDialog("Bem vindo ao Gerenciador de Voos!"
	                + "\n 1 - Cadastrar Voo"  
	                + "\n 2 - Cadastrar Aeronave"
	                + "\n 3 - Voltar"
	                );
			menu = Integer.parseInt(temp);
			}
			catch(Exception e){
				menu = temp == null ? 4 : 3;
			}
			switch(menu){
				case 1: CadastrarVoo(); break;
				case 2: CadastrarAeronave(); break;
				case 3: JOptionPane.showMessageDialog(null, "Houve um erro, tente novamente!");break;
				case 4: break;
				default: break;
			}
		}
		while(menu != 4);
	}
	
	public static void Reserva(){
		int menu;
		do{
			String temp = "";
			try{
			menu = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Gerenciador de Voos!"
	                + "\n 1 - Fazer Reserva"  
	                + "\n 2 - Consultar Lugares Vazios"
	                + "\n 3 - Consultar Reservas Realizadas"
	                + "\n 4 - Voltar"
	                ));
			}
			catch(Exception e){
				menu = temp == null ? 4 : 5;
			}
			switch(menu){
				case 1: break;
				case 2: break;
				case 3: break;
				case 4: break;
				default:JOptionPane.showMessageDialog(null, "Houve um erro, tente novamente!");break;
			}
		}
		while(menu != 4);
	}
}