package PacoteCredenciamento;

import java.util.Scanner;

public class AcessoRoxo extends Acesso{

	Scanner ler= new Scanner(System.in);
	
	public AcessoRoxo(String nome, String cpf, String telefone) 
	{
		super(nome, cpf, telefone);
		super.setCor("Roxo");
		super.setTipoDeAcesso("Infraestrutura");
	}
	
	public void imprimeInfo()
	{
		System.out.println(
				"\nNome: " + super.getNome() + 
				"\nCPF: " + super.getCpf() + 
				"\nTelefone: " + super.getTelefone() + 
				"\nCartão de acesso: " + super.getCor() +
				"\nTipo de acesso: " + super.getTipoDeAcesso()
				);			
	}

}


