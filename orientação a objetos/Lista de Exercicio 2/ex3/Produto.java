package ex3;

public class Produto {
 private String nome;
 private double preco;
 private int qtd;
public Produto(){
	
}
public Produto(String nome, double preco, int qtd) {
	super();
	this.nome = nome;
	this.preco = preco;
	this.qtd = qtd;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public int getQtd() {
	return qtd;
}
public void setQtd(int qtd) {
	this.qtd = qtd;
}
 public double valorEstoque() {

	return this.qtd*this.preco;
	 
 }
 public void estoca(int q) {
	 this.qtd+=q;
 }
 public void vende(int q) {
	 if(q<=this.qtd) {
        this.qtd-=q;
	 }
 }
@Override
public String toString() {
	return "Produto [nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + "]";
}
 
}
