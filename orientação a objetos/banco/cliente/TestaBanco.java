package cliente;

import java.nio.file.FileSystemNotFoundException;

import contas.Conta;

public class TestaBanco {
public static void main(String[] args) {
	Cliente natan= new Cliente();
	natan.setNome("Natan");
	natan.setCPF("111.111.111.-11");
	natan.setProfissao("programador");;
	Conta contaDoNatan= new Conta();
	contaDoNatan.deposita(100);
	contaDoNatan.setTitular(natan);	
	System.out.println(natan.getNome());
}
}
