package PacoteCredenciamento;

import java.util.Scanner;

public class AcessoVerde extends Acesso {


	Scanner ler= new Scanner(System.in);
	
	public AcessoVerde(String nome, String cpf, String telefone) 
	{
		super(nome, cpf, telefone);
		super.setCor("Verde");
		super.setTipoDeAcesso("�rea de Com�rcio");
	}
	
	public void imprimeInfo()
	{
		System.out.println(
				"\nNome: " + super.getNome() + 
				"\nCPF: " + super.getCpf() + 
				"\nTelefone: " + super.getTelefone() + 
				"\nCart�o de acesso: " + super.getCor() +
				"\nTipo de acesso: " + super.getTipoDeAcesso()
				);			
	}

}