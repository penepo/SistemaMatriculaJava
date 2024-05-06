import java.util.Scanner;
public class Professor {
	Scanner sc = new Scanner(System.in);
	String IdDoProf;
	String nomeCompleto;
	String enderecoPro;
	String graduacao;
	
	public void DigitarIdDoProf() {
		System.out.println("Digite o Id do Professor:");
		IdDoProf = sc.nextLine();
	}
		
	public void DigitarNomeCompleto() {
		System.out.println("Digite o nome completo do Professor:");
		nomeCompleto = sc.nextLine();
	}
	
	public void DigitarEnderecoPro() {
		System.out.println("Digite o endereço do Professor:");
		enderecoPro = sc.nextLine();
	}
		
	public void Digitargraduacao() {
		System.out.println("Digite a graduação do Professor:");
		graduacao = sc.nextLine();
	}
	

	public void ExibirIdDoProf() {
		System.out.println("O Id do prof é:" + IdDoProf);
	
	}
	public void ExibirNomeCompleto() {
		System.out.println("O Nome completo é:" + nomeCompleto);
	}
	
	public void ExibirEnderecoPro() {
		System.out.println("O Endereço do prof é:" + enderecoPro);
	}
	
	public void Exibirgraduacao() {
		System.out.println("A graduação do prof é:" + graduacao);
	}
	
	
	
	
	
	
	
	
	
	
	
}