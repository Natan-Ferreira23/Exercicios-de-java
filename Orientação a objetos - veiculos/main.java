
public class main {
  public static void main(String[] args) {
	  System.out.println("---------------");
	Onibus f1= new Onibus("ASD4X32", 1985, 6);
	f1.exibirDados();
	System.out.println("---------------");
	Caminhao f2= new Caminhao("OLAM342", 1999, 5);
	f2.exibirDados();
	System.out.println("---------------");
	Veiculo f3=new Veiculo("ULAM872", 2005);
	f3.exibirDados();
}
}
