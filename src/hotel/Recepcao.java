package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList<Estadia> estadias;
	
	public Recepcao() {
		this.estadias = new ArrayList<Estadia>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);
	}
	
	public void checkOut(String nome) {
		for (Estadia estadia : estadias) {
			if (estadia.getNome().equals(nome)) {
				estadias.remove(estadia);
				break;
			}
		}
	}
	
	public int getNumDeHospedes() {
		return estadias.size();
	}
	
	public double getLucroTotal() {
		double total = 0.0;
		for (Estadia estadia : estadias) {
			total += estadia.getValor();
		}
		return total;
	}
	
	public String toString() {
		String hospedados = "Estadias:" + System.lineSeparator();
		for (Estadia estadia : estadias) {
			hospedados += String.format("%s (%s): %d dias com o preço de R$ %.2f",
					estadia.getNome(), estadia.getTipo(), estadia.getDias(), estadia.getValor()) 
					+ System.lineSeparator();
		}
		return hospedados;		
	}
}
