	package contas;
	
	import cliente.Cliente;
	
	//saldo, agemcia, numero e titular;
	public class Conta {
	  private double saldo;
	  private int agencia;
	  private int numero;
	  private Cliente titular;
	  
	 public void deposita(double valor){
		  this.saldo= this.saldo+valor;
	  }
	 public boolean saca(double valor){
		  if(this.saldo>=valor) {
			  this.saldo=this.saldo - valor;
			  return true;
			  } else {
				  System.out.println("Saldo insuficiente, saque cancelado");
				  return false;
			  }
	   }
	 public boolean transfere(double valor, Conta destino) {
		 if(this.saldo>=valor) {
			 this.saldo-=valor;
			 destino.deposita(valor);
			 System.out.println(" Transfêrencia realizada ! ");
			 return true;
		 }
		 else {
			 System.out.println(" Transfêrencia negada! ");
			 return false;
		 }
	 }
	 public double getSaldo() {
		 return this.saldo;
	 }
	 public double getNumero() {
		 return this.numero;
	 }
	 public void setNumero(int novoNumero) {		
		  this.numero=novoNumero;		 
	 }
	 public int getAgencia() {
		return this.agencia;
	}
	 public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	 public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	 public Cliente getTitular() {
		return titular;
	}
	}
