
public class Caminhao extends Veiculo {
 private int eixos;
 
  public Caminhao(String placa, int ano, int eixos) {	  
		  super(placa,ano);
		  this.eixos=eixos;
	  }
  public void setEixos(int eixos) {
	  this.eixos=eixos;
  }
  public int getEixos() {
	  return eixos;
  }
  public void exibirDados() {
	  System.out.printf("\n Placa: %s \n Ano: %d \n Eixos: %d \n",getPlaca(), getAno(),this.eixos);
  }
}
