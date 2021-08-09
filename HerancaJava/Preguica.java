package HerancaJava;

public class Preguica extends Animal{
	
	String local;
	String atividade;

	public Preguica (String  nome, int idade, boolean emiteSom, String local, String atividade) {
		super(nome, idade, emiteSom);
		this.local = local;
		this.atividade = atividade;
	}
	public void imprimirInfo() {
		System.out.println("\nAnimal: "+getNome()+"\nIdade: "+getIdade()+"\nEmite som: "+isEmiteSom()+
				"\nA atividade da pregui�a �: "+atividade+"\nO local onde vive �: "+local);
	}
}
