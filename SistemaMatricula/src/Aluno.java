import java.util.Scanner;
public class Aluno {
	
		Scanner sc = new Scanner(System.in);
		String id;
		String nome;
		String nomeMae;
		String endereco;
		String telefone;
		
		
		public void DigitarId() {
			System.out.println("Digite o ID do aluno.");
			id = sc.nextLine();
		}
		
		public void DigitarNome() {
			System.out.println("Digite o Nome do aluno.");
			nome = sc.nextLine();
		}
	
		public void DigitarnomeMae() {
			System.out.println("Digite o nome da mãe do aluno é:");
			nomeMae = sc.nextLine();
		}
		
		public void Digitarendereco() {
			System.out.println("o endereço do aluno é:");
			endereco = sc.nextLine();
		}
		
		
		public void Digitartelefone() {
			System.out.println("o telefone do aluno é:");
			telefone = sc.nextLine();
		}
		
	
		
		
		public void ExibirId() {
			System.out.println("o ID do aluno é:" + id);
			
		}
		
		public void ExibirNome() {
			System.out.println("o nome do aluno é:" + nome);
		
		}
		
		public void ExibirnomeMae() {
			System.out.println("o nome da mãe do aluno é:" + nomeMae);
			
		}
		
		public void Exibirendereco() {
			System.out.println("o endereço do aluno é:" + endereco);
		}

		public void Exibirtelefone() {
			System.out.println("o telefone do aluno é:" + telefone);
		}







}
	
		