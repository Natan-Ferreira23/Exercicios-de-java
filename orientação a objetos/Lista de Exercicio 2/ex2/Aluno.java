package ex2;

public class Aluno {
private String nome;
 private String matricula;
 private double nota2Prova;
 private double nota1Prova;
 private double notaTrabalho;

public Aluno() {
	
}
public Aluno(String nome, String matricula, double nota1Prova, double nota2Prova, double notaTrabalho) {
	this.nome=nome;
	this.matricula=matricula;
	this.nota1Prova=nota1Prova;
	this.nota2Prova=nota2Prova;
	this.notaTrabalho=notaTrabalho;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public double getNota2Prova() {
	return nota2Prova;
}
public void setNota2Prova(double nota2Prova) {
	this.nota2Prova = nota2Prova;
}
public double getNota1Prova() {
	return nota1Prova;
}
public void setNota1Prova(double nota1Prova) {
	this.nota1Prova = nota1Prova;
}
public double getNotaTrabalho() {
	return notaTrabalho;
}
public void setNotaTrabalho(double notaTrabalho) {
	this.notaTrabalho = notaTrabalho;
}

public double calculeMediaPonderada() {
	 double resultado=(this.nota1Prova*2.5+this.nota2Prova*2.5+this.notaTrabalho*2)/(2.5+2.5+2);
	 return resultado;
}
public int verificaSituacaoAluno() {
	if(calculeMediaPonderada()>=6) {
		return 1;
		
	}else if(calculeMediaPonderada()>=4) {
		return 2;
	}else {
		return 3;
	}
	

}
@Override
public String toString() {
	return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota2Prova=" + nota2Prova + ", nota1Prova="
			+ nota1Prova + ", notaTrabalho=" + notaTrabalho + "]";
}
 		
}
