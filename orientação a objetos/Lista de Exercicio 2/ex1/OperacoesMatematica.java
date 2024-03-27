package ex1;

public class OperacoesMatematica {
	
  public int fatorial(int num) {
	int fat=num;
	do {		
		num--;
		fat*=num;
  }while(num>1);
	num=fat;
	return num;
}
public int exponencial(int base,int exp) {
	int cons=base;
	for(int i=1;i<exp;i++) {
		base=base*cons;
	}
	return base;
}

public int maximoValor(int vet[]) {
	int maior = vet[0];
	for(int i=0;i<vet.length;i++) {	
		if(maior<vet[i]) {
			maior=vet[i];
		}
	}
	return maior;
}
}

