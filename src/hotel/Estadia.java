package hotel;

public class Estadia {
	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}
	
	public int getDias() {
		return this.dias;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getNome() {
		return this.animal.getNome();
	}
	
	public String getTipo() {
		return this.animal.getTipo();
	}
	
	public int getIdade() {
		return this.animal.getIdade();
	}
	
	@Override
	public String toString() {
		String informacoes = String.format("%s, %s, %d dias com o preco de R$ %.2f", this.animal.getNome(), this.animal.getTipo(), this.dias, this.valor);
		informacoes += System.lineSeparator();
		
		return informacoes;
	}
}
