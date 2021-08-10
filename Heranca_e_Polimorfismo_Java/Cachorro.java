package HerancaJava;

public class Cachorro extends Animal {
	
	String raca;
	String cor;
	String porte;
	
	public Cachorro (String nome, int idade, boolean emiteSom, boolean corre, String raca, String cor, String porte) {
		super(nome,idade,emiteSom,corre);
		this.raca = raca;
		this.cor = cor;
		this.porte = porte;
	}
	
	public void imprimirInfo() {
		System.out.println("\nAnimal: "+getNome()+"\nIdade: "+getIdade()+"\nEmite som? "+isEmiteSom()+"\nCorre? "+isCorre()+"\nA raça do cachorro é: "+raca+
				"\nA cor da pelagem é: "+cor+"\nO cachorro é de porte: "+porte);
	}
	public void som() {
		System.out.println("\nO som do cachorro é au au au au au...");
	}
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
}
