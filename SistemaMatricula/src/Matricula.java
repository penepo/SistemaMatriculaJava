import java.util.Scanner;
import java.util.Date;
public class Matricula {
		
	
		Date data = new Date();
		Scanner sc = new Scanner(System.in);
		String idMatricula;
		String idAluno;
		String idSala;
		String dataHora;
		
		public void DigitaridMatricula() {
			System.out.println("Digite o Id da matricula:");
			idMatricula = sc.nextLine();
		}
		
		public void DigitaridAluno() {
			System.out.println("Digite o Id do aluno:");
			idAluno = sc.nextLine();
		}
		
		public void Digitaridsala() {
			System.out.println("Digite o Id da sala:");
			idSala = sc.nextLine();
		}
		
		public void DigitardataHora() {
			System.out.println("Digite a data e a hora:");
			dataHora = sc.nextLine();
		}
		
		public void ExibiridMatricula() {
			System.out.println("Digite o Id da matricula:" + idMatricula);
		}
	
		public void ExibiridAluno() {
			System.out.println("Digite o Id do aluno:" + idAluno);
		}
		
		public void Exibiridsala() {
			System.out.println("Digite o Id da sala:" + idSala);
		}
		
		public void ExibirdataHora() {
			System.out.println("Digite a data e a hora:" + dataHora);
		}


			






}
	
