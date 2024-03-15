package funcionarioLivro;

public class Funcionario {
private String nome;
private String departamento;
private double salario;
 private Data dataEntrada;
private String rg;
private boolean estaNaEmpresa;
public String getNome() {
	return this.nome;
}
public void setNome(String n) {
	this.nome=n;
}
public String getDepartamento() {
	return this.departamento;
}
public void setDepartamento(String d) {
	this.departamento=d;
}
public double getSalario() {
      return this.salario;
}
public void setSalario(double s) {
	this.salario=s;
}
public Data getDataEntrada() {
	return this.dataEntrada;
}
public void setDataEntrada(Data d) {
	this.dataEntrada=d;
}
public String getRg () {
	return this.rg;
}
public void setRg(String r) {
	this.rg=r;
}
public void aumento (double valor) {
	this.salario+=valor;
}
public void ganhoAtual () {
 System.out.println("Ganho anual R$:"+this.salario*12);
}
public void getEstaNaEmpresa() {
	if(estaNaEmpresa==true) {
		System.out.println("Esta na empresa");
	}
	else {
		System.out.println("Não está na empresa ");
	}
}
public void setEstaNaEmpresa(String resposta) {
	if(resposta=="Sim" || resposta== "sim") {
		estaNaEmpresa=true;
	}
	else {
		estaNaEmpresa=false;
	}
}
public void status () {
	System.out.println("Nome: "+ getNome());
	System.out.println("Salario: "+ getSalario());
	System.out.println("Departamento: "+ getDepartamento());
	System.out.println("RG: "+ getRg());
	System.out.println("Data de entrada: "+ getDataEntrada());
	getEstaNaEmpresa();
	}
}
