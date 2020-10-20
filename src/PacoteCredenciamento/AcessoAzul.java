package PacoteCredenciamento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AcessoAzul extends Acesso{

	Scanner ler= new Scanner(System.in);
	Collection<String> conjuntoAzul = new ArrayList<String>();
	
	public AcessoAzul(String nome, String cpf, String telefone) 
	{
		super(nome, cpf, telefone);
		super.setCor("Azul");
		super.setTipoDeAcesso("Backstage");
		conjuntoAzul.add(nome);
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