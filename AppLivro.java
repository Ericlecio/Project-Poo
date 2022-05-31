package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Livro;
import model.LivroDigital;
import model.LivroFisico;

public class AppLivro {
	static ArrayList<Livro> lista = new ArrayList<Livro>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[]args) {
		Livro livro = new Livro();
		
		Scanner scan = new Scanner(System.in);
		String opcao = "N";
		do {
			System.out.println("+-------------Menu-------------+");
			System.out.println("+ 1 - Adicionar Livro        + ");
			System.out.println("+ 2 - Listar todos os Livros +");
			System.out.println("+-----------------------------+ \n");
			
			System.out.print(" Informe qual op��o do menu:\t");
			
			int op = scan.nextInt();
			if(op == 1) {
				adicionar();
				
			}else if (op == 2 ) {
				listar();
				
			}
			System.out.println("Deseja voltar ao menu? S/N: \t");
			opcao = scan.next();

	}while (opcao.equals("S") || opcao.equals("s"));
		
		System.out.println("Saiu do sistema...");
}
	public static void adicionar() {
		String opcao = "N";
		int opcaoG = 1;
		do {
			System.out.println("+--------------SUBMENU-----------------+");
			System.out.println("+1------Adiciona Livro F�sico ---------+");
			System.out.println("+2------Adiciona Livro Digital --------+");
			System.out.println("+--------------------------------------+ \n");
			System.out.print(" Informe qual op��o do Submenu:\t");

			opcaoG = scan.nextInt();
			if(opcaoG == 1) {
				adicionaFisico();
		}else if (opcaoG == 2) {
			adicionaDigital();
		}
			System.out.println("Deseja continuar adicionando neste Submenu? S/N: \t");
			opcao = scan.next();
		}while (opcao.equals("S") || opcao.equals("s"));
}
	public static void listar() {
		System.out.println("+ -- T�tulo | G�nero | Situa��o -- +");
		
		for(Livro livro : lista) {
			System.out.println("+ ----" + livro.getTitulo()+ "|" + livro.getGenero() + "|" + livro.getSituacao() + " ---------+ \n");
		}
		System.out.println("+------------------------------+ \n");
	}
	public static void adicionaFisico() {
		LivroFisico fisico = new LivroFisico();
		
		System.out.println("Informe o t�tulo do livro: ");
		String titulo = scan.next();
		fisico.setTitulo(titulo);
		
		System.out.println("Informe o g�nero do livro: ");
		String genero = scan.next();
		fisico.setGenero(genero);
		
		System.out.println("Informe a situa��o do livro: ");
		String situacao = scan.next();
		fisico.setSituacao(situacao);
		
		System.out.println("Informe a etiqueta do livro: ");
		String etiquetaF = scan.next();
		fisico.setEtiquetaFisica(etiquetaF);
		lista.add(fisico);
	}
	public static void adicionaDigital() {
		LivroDigital digital = new LivroDigital();
		
		System.out.println("Informe o t�tulo do livro: ");
		String titulo = scan.next();
		digital.setTitulo(titulo);
		
		System.out.println("Informe o g�nero do livro: ");
		String genero = scan.next();
		digital.setGenero(genero);
		
		System.out.println("Informe a situa��o do livro: ");
		String situacao = scan.next();
		digital.setSituacao(situacao);
		
		System.out.println("Informe a etiqueta do livro: ");
		String etiquetaD = scan.next();
		digital.setEtiquetaDigital(etiquetaD);
		lista.add(digital);
	}
	}
