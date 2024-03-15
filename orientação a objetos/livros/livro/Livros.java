package livro;

import pessoa.Pessoa;
import publicacao.Publicacao;
import publicacao.*;
public class Livros implements Publicacao {
     private String titulo;
     private int totalPaginas;
     private String autor;
     private int pagAtual;
     private boolean aberto=false;
     private Pessoa leitor;

    public Livros(String titulo, int totalPaginas,  Pessoa leitor,String autor) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.autor=autor;
        this.leitor = leitor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.printf("%n -- INFORMAÇÕES --- %n");
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Total paginas: "+this.totalPaginas);
        System.out.println("Pagina atual: "+this.pagAtual);
        System.out.println("Esta aberto?: "+this.aberto);
        System.out.println("Leitor: "+ this.leitor.getNome());
        System.out.printf("%n -- ----------- --- %n");
    }

    @java.lang.Override
    public void abrir() {
        if(this.aberto==true) {
            System.out.println("O livro ja está aberto");
        }else{
            this.aberto=true;
            System.out.println("O livro foi aberto");
        }
    }

    @java.lang.Override
    public void fechar() {
        if(this.aberto==true) {
            this.aberto=false;
            System.out.println("O livro foi fechado");
        }else{
            System.out.println("O livro já esta fechado");
        }
    }

    @java.lang.Override
    public void folhear(int p) {
        if(this.aberto==true && p<= this.totalPaginas) {
            this.pagAtual = p;
            System.out.println("Você folheou atá a página " + this.pagAtual);
        }
        else{
            if(this.aberto==false) {
                System.out.println("Não foi possivel folhear, o livro está fechado !");
            }
            else{
                System.out.println("Não foi possivel folhear até a pagina "+ p +" pois o livro tem apenas "+ this.totalPaginas +" paginas");
            }
        }
    }

    @java.lang.Override
    public void avancarPag() {
        if(pagAtual<this.totalPaginas && this.aberto==true){
            pagAtual++;
            System.out.println("Você está na página: "+this.pagAtual);
        }else{
            if(this.aberto==false){
                System.out.println("Abra o livro !");
            }
            else{
                System.out.println("Você já está na ultima página do livro !");
            }
        }
    }

    @java.lang.Override
    public void voltarPag() {
         if(pagAtual>1 && this.aberto==true){
             this.pagAtual--;
             System.out.println("Você está na página: "+this.pagAtual);
         }else{
             if(this.aberto==false){
                 System.out.println("O livro está fechado, abra ele !");
             }else {
                 System.out.println("Você não pode voltar a página pois o livro vai fechar");
             }
         }
    }
}
