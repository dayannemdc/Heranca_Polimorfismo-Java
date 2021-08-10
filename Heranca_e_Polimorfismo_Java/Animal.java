package HerancaJava;

public class Animal {

	private String nome;
	private int idade;
	public boolean emiteSom;
	public boolean corre;
	
	public Animal(String  nome, int idade, boolean emiteSom, boolean corre) {
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
		this.corre = corre;
	}
	public Animal(String  nome, int idade, boolean emiteSom) {
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}
	public boolean isCorre() {
		return corre;
	}
	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
}
