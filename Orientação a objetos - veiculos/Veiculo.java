
public class Veiculo {
 private String placa;
 private int ano;
  public Veiculo() {
	  
  }
  public Veiculo(String placa, int ano) {
	  this.placa=placa;
	  this.ano=ano;
	  
  }
  public void setPlaca(String placa) {
	  this.placa=placa;
  }
  public String getPlaca() {
	  return this.placa;
  }
  public void setAno(int ano) {
	  this.ano=ano;
  }
  public int getAno() {
	  return this.ano;
  }
  public void exibirDados() {
	  System.out.printf("\n A placa é %s\n O ano é %d \n",placa,ano);
  }
}
