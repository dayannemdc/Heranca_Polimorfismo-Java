package HerancaJava;

public class Cavalo extends Animal {
	int peso;
	String atividade;
	boolean compete;
	
	public Cavalo(String nome, int idade, boolean emiteSom, boolean corre, int peso, String atividade, boolean compete) {
		super(nome,idade,emiteSom,corre);
		this.peso = peso;
		this.atividade = atividade;
		this.compete = compete;
	}
	public void imprimirInfo() {
		System.out.println("\nAnimal: "+getNome()+"\nIdade: "+getIdade()+"\nEmite som? "+isEmiteSom()+"\nCorre? "+isCorre()+"\nO peso do caval é: "+peso+
				"\nA atividade que pratica é: "+atividade+"O cavalo participa de competições? "+compete);
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public boolean isCompete() {
		return compete;
	}
	public void setCompete(boolean compete) {
		this.compete = compete;
	}
	

}
