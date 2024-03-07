
public class Onibus extends Veiculo {
 private int assentos;
 
 public Onibus(String placa, int ano, int assentos) {
	 super(placa,ano);
	 this.assentos=assentos;
 }
 public void setAssentos(int assentos) {
	 this.assentos=assentos;
 }
 public int getAssentos() {
	 return this.assentos;
 }
 public void exibirDados() {
	 System.out.printf("\n Assentos: %d \n placa: %s \n ano:%d \n",this.assentos, getPlaca(),getAno());
 }
}
