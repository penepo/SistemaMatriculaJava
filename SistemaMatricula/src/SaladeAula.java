import java.util.Scanner;

public class SaladeAula {
	
	Scanner sc = new Scanner(System.in);
	String IdSala;
	String IdAluno;
	
	public void DigitarIdSala() {
		System.out.println("Digite o Id da sala:");
		IdSala = sc.nextLine();
	}
	
	
	public void DigitarIdAluno() {
		System.out.println("o Id do aluno é:");
		IdAluno = sc.nextLine();
	}


	public void ExibirIdSala() {
		System.out.println("O Id da sala é:" + IdSala);
	}
	
	public void ExibirIdAluno() {
		System.out.println("O Id do Aluno é:" + IdAluno);
	}
}






 
