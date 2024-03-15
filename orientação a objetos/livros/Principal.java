import pessoa.Pessoa;
import livro.Livros;
import publicacao.Publicacao;

public class Principal {

    public static void main(String[] args) {

       Pessoa [] p=new Pessoa[3];
       Livros [] l=new Livros[3];
       p[0]= new Pessoa ("Natan",20,"m");
       p[1]=new Pessoa("Maria", 25, "f");
       p[2]=new Pessoa("Daniel", 30, "m");

       l[0]=new Livros("Aprendendo Java", 300, p[0], "Jóse pereira deitel");
       l[1]=new Livros("A arte do css", 250, p[1], "Carlos magro");
       l[2]=new Livros("O jogo", 500, p[2], "Marcos flagmia");
       l[0].abrir();
       l[0].folhear(50);
       l[0].detalhes();


    }
}
