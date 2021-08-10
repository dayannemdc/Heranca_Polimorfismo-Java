package HerancaJava;

import java.util.Scanner;

public class TestaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro1 = new Cachorro("cachorro Luke", 1, true, true, "Yorkshire", "preta","pequeno" );
		Cavalo cavalo1 = new Cavalo("cavalo Valente", 5, true, true, 115, "corrida", true);
		Preguica preguica1 = new Preguica("preguiça Manhosa", 3, true, "Mata Fechada Bonita", "Sobir em árvores");
		
		int n;
		Scanner leia = new Scanner (System.in);
		
		cachorro1.imprimirInfo();
		cavalo1.imprimirInfo();
		preguica1.imprimirInfo();
		
		do {
			System.out.println("\n\t\t\t****O som emitido por cada animal****");
			System.out.println("\nDigite: 1 - para cachorro");
			System.out.println("\nDigite: 2 - para cavalo");
			System.out.println("\nDigite: 3 - para preguiça");
			n = leia.nextInt();
		
			switch(n) {
			case 1: cachorro1.som(); break;
			case 2: cavalo1.som(); break;
			case 3: preguica1.som(); break;
			default: System.out.println("\nErro inesperado...");
			}
		}
		while(n!=0);
	}

}
