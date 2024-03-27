package ex1;

public class teste {
	

	 public static void main(String[] args) {
		OperacoesMatematica teste= new OperacoesMatematica();
		// EXERCICIO 1
		int fatorial=teste.fatorial(10); //função para fatorial
		System.out.println("O fatorial do numero informado é: "+ fatorial);
		
		//EXERCICIO 2
		int potenciacao=teste.exponencial(2,4);
		System.out.println(" 5 elevado ao expoente 2 é: "+potenciacao);		
		
		//EXERCICIO 3
		int []vet=new int[5];
		vet[0]=2;
		vet[1]=8;
		vet[2]=6;
		vet[3]=4;
		vet[4]=1;
		
		System.out.println("O maior numero da lista de vetores é:" +teste.maximoValor(vet));
		
	  }
 }
