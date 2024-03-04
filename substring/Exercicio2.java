package substring;
import java.util.Scanner;
public class Exercicio2 {
 public static void main(String[] args) {
	 Scanner leitura=new Scanner(System.in);
	System.out.println("Digite uma frase: ");
	String texto= leitura.nextLine();
	System.out.println("Os dez primeiros caracteres da frase digitada:"+ texto.substring(0,10));
}
}
