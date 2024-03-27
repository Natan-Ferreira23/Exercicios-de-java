package ex3;

public class TestaProduto {
public static void main(String[] args) {
	Produto p1=new Produto("refri",8.0,2);
	System.out.println(p1.toString());
	System.out.println("O valor em estoque do produto"+p1.getNome()+" é RR$:"+p1.valorEstoque());
	p1.estoca(1);
	p1.vende(1);
	System.out.println("O valor em estoque do produto"+p1.getNome()+" é RR$:"+p1.valorEstoque());
}
}
