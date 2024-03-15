package contas;

public class TestaMetodo {
  public static void main(String[] args) {
	Conta contaDoNatan= new Conta();
	contaDoNatan.deposita(100);
	contaDoNatan.deposita(70);
	System.out.println(contaDoNatan.getSaldo());
	contaDoNatan.saca(30);
	System.out.println(contaDoNatan.getSaldo());
	contaDoNatan.saca(200);
	System.out.println("Saldo do Natan antes da transferencia " + contaDoNatan.getSaldo());
	
	Conta contaDaMaria= new Conta();
	contaDaMaria.deposita(1000);
	System.out.println("Saldo da maria antes da transferencia " + contaDaMaria.getSaldo());
	contaDaMaria.transfere(1000, contaDoNatan);
	System.out.println(" Saldo da Maria depois da transferencia " + contaDaMaria.getSaldo());
	System.out.println("Saldo do Natan depois da transferencia " +contaDoNatan.getSaldo());
    
	System.out.println(contaDaMaria.getNumero());
	
}
}
