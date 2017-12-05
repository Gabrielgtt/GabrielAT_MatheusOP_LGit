package hotel;

public class Animal {
	private String nome;
	private String tipo;
	private int idade;
	
	public Animal(String nome, String tipo, int idade) {
		if( nome == null || tipo == null ) {
			throw new NullPointerException("Parâmetro nulo!");
		}
		
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setTipo(String novoTipo) {
		this.tipo = novoTipo;
	}
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
}
