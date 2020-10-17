package PacoteCredenciamento;

import java.util.Scanner;

public class AcessoVerde extends Acesso {


	Scanner ler= new Scanner(System.in);
	
	public AcessoVerde(String nome, String cpf, String telefone) 
	{
		super(nome, cpf, telefone);
		super.setCor("Verde");
		super.setTipoDeAcesso("Área de Comércio");
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