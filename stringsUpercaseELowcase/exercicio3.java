package stringsUpercaseELowcase;
import java.util.*;
public class exercicio3 {
public static void main(String[] args) {
	Scanner leitura= new Scanner(System.in);
	System.out.println("Digite uma palavra: ");
	String texto= leitura.nextLine();
	System.out.println("O texto digitado com a função uperCase: "+ texto.toUpperCase());
	System.out.println("O texto digita com a função lowerCase: "+ texto.toLowerCase());
}
}
