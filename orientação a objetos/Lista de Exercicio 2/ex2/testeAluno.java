package ex2;

public class testeAluno {
public static void main(String[] args) {
	Aluno a1= new Aluno("Adilson","1",7.5,8.0,6.0);
	//Exibindo dados do aluno;
	System.out.println("Nome:"+ a1.getNome());
	System.out.println(a1.toString());
	System.out.println("A media ponderada das notas é:"+a1.calculeMediaPonderada());
	System.out.println("Situação do aluno:"+a1.verificaSituacaoAluno());
}
}
