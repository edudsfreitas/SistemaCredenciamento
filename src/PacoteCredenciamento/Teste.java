package PacoteCredenciamento;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) 
	{
		Scanner ler= new Scanner(System.in);
		
		String nome;
		String telefone;
		String cpf;
		int opcao;
		
		System.out.println("Seja bem vindo!");
		System.out.println("Vamos fazer seu cadastro.");
		
		do {
			System.out.println(" ");
			System.out.println("Primeiramente, nos diga sua profiss�o: ");
			System.out.println("[1] Artista");
			System.out.println("[2] Maquiador");
			System.out.println("[3] Produ��o");
			System.out.println("[4] Suporte T�cnico");
			System.out.println("[5] Seguran�a");
			System.out.println("[6] Manuten��o");
			System.out.println("[7] Comerciante/Vendedor");
			System.out.print("Digite aqui:");
			opcao = ler.nextInt();
			
		}while(opcao>7);
		
		System.out.println(" ");
		System.out.print("Insira seu nome: ");
		nome = ler.next();
		System.out.print("Insira seu CPF: ");
		cpf = ler.next();
		System.out.print("Insira seu telefone: ");
		telefone = ler.next();
		
		switch (opcao) {
			case 1: {
				cadastrarAzul(nome,cpf,telefone);
				break;
			}
			case 2: {
				cadastrarAzul(nome,cpf,telefone);
				break;
			}
			case 3: {
				cadastrarAzul(nome,cpf,telefone);
				break;
			}
			case 4: {
				cadastrarRoxo(nome,cpf,telefone);
				break;
			}
			case 5: {
				cadastrarRoxo(nome,cpf,telefone);
				break;
			}
			case 6: {
				cadastrarRoxo(nome,cpf,telefone);
				break;
			}
			case 7: {
				cadastrarVerde(nome,cpf,telefone);
				break;
			}
			
		}
			
		ler.close();
		
	}
	
	public static void cadastrarAzul(String nome, String cpf, String telefone) {
		AcessoAzul acessoAzul = new AcessoAzul(nome,cpf,telefone);
			
		acessoAzul.imprimeInfo();
	}
	
	public static void cadastrarRoxo(String nome, String cpf, String telefone) {
		AcessoRoxo acessoRoxo = new AcessoRoxo(nome,cpf,telefone);
		
		acessoRoxo.imprimeInfo();
	}
	
	public static void cadastrarVerde(String nome, String cpf, String telefone) {
		AcessoVerde acessoVerde = new AcessoVerde(nome,cpf,telefone);
		
		acessoVerde.imprimeInfo();
	}
}
