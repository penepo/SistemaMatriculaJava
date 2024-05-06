import java.util.Date;

public class MatricularAluno {
	public static void main (String args[]) {
		Date data = new Date();
		System.out.println("Data Agora: "+data);
		System.out.println("Sistema de matricula de aluno(as).\n");
		
		Aluno aluno = new Aluno();
		aluno.DigitarId();
		aluno.DigitarNome();
		aluno.DigitarnomeMae();
		aluno.Digitarendereco();
		aluno.Digitartelefone();
		aluno.ExibirId();
		aluno.ExibirNome();
		aluno.ExibirnomeMae();
		aluno.Exibirendereco();
		aluno.Exibirtelefone();
		
	
		
		SaladeAula sala = new SaladeAula();
		sala.DigitarIdSala();
		sala.DigitarIdAluno();
		sala.ExibirIdSala();
		sala.ExibirIdAluno();
		
	
		Professor prof = new Professor();
		prof.DigitarIdDoProf();
		prof.DigitarNomeCompleto();
		prof.DigitarEnderecoPro();
		prof.Digitargraduacao();
		prof.ExibirIdDoProf();
		prof.ExibirNomeCompleto();
		prof.ExibirEnderecoPro();
		prof.Exibirgraduacao();
	
		Matricula matri = new Matricula();
		matri.DigitaridMatricula();
		matri.DigitaridAluno();
		matri.Digitaridsala();
		matri.DigitardataHora();
		matri.ExibiridMatricula();
		matri.ExibiridAluno();
		matri.Exibiridsala();
		matri.ExibirdataHora();
		
		
	
	
	 
	
	
	
	
	
	}
		
}