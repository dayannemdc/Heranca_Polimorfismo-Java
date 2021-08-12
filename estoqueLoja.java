import java.util.ArrayList;
import java.util.Scanner;

public class estoqueLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int op;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n\t\tFuncionalidades: ");
			System.out.println("--------------------------------------------");
			System.out.println(	  "\n(1) Armazenar dados da List"
								+ "\n(2) Remover dados da List "
								+ "\n(3) Atualizar dados da List"
								+ "\n(4) Apresentar todos os dados da List"
								+ "\n(0) Encerrar o programa");
			System.out.println("---------------------------------------------");
			System.out.println("\n\t\tDigite uma opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1: 
				ler.nextLine();
				System.out.println("\nDigite o produto para adcionar: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto para remover: ");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}
				else {
					System.out.println("\nProduto inexistente!!!");
				}
				break;
			case 3: 
				ler.nextLine();
				System.out.println("\nDigite o produto que será atualizado");
				String verifica = ler.nextLine();
				System.out.println("Digite o novo produto que ficará no lugar de "+verifica+" : ");
				String novo = ler.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else {
					System.out.println("\nProduto "+verifica+" inexistente!!!");
				}
				System.out.println("\n"+estoque);
				break;
			case 4:
				System.out.println("\nProdutos em estoque:");
				System.out.println("\n"+estoque);
				break;
				default:
					System.out.println("\nPrograma finalizado.");
			}
			
		}while(op!=0);
	}

}
