package View;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Livro;
import Model.LivroDigital;
import Model.LivroFisico;

public class AppLivro {
	static ArrayList<Livro> lista = new ArrayList<Livro>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[]args) {
		Livro livro = new Livro();
		
		Scanner scan = new Scanner(System.in);
		String opcao = "N";
		do {
			System.out.println("+--------------------Menu--------------------+");
			System.out.println("+    1           Adicionar Livro             +");
			System.out.println("+    2       Listar todos os Livros          +");
			System.out.println("+--------------------------------------------+\n");
			System.out.print("Informe qual opção do Menu:\t");
			
			int op = scan.nextInt();
			if(op == 1) {
				adicionar();
			}if (op == 2 ) {
				listar();
			}
			System.out.println("Deseja voltar ao menu? S/N:\t");
			opcao = scan.next();

	}while (opcao.equals("S") || opcao.equals("s"));
		
		System.out.println("Saiu do sistema biblioteca...");
}
	public static void adicionaFisico() {
		LivroFisico fisico = new LivroFisico();
		
		System.out.printf("Informe o titulo do livro:\n");
		String titulo = scan.nextLine();
		fisico.setTitulo(scan.nextLine());
		
		System.out.println("Informe o genero do livro:\t");
		String genero = scan.nextLine();
		fisico.setGenero(genero);
		
		System.out.println("Informe a situação do livro:\t");
		String situacao = scan.next();
		fisico.setSituacao(situacao);
		
		System.out.println("Informe a etiqueta do livro:\t");
		int etiquetaF = scan.nextInt();
		fisico.setEntiqueta(etiquetaF);
		
		System.out.println("Informe o valor do livro:\t");
		int precof = scan.nextInt();
		fisico.setPreco(precof);
		
		lista.add(fisico);
}
	public static void adicionaDigital() {
		LivroDigital digital = new LivroDigital();
		
		System.out.println("Informe o TItulo do livro:\n");
		String titulo = scan.nextLine();
		digital.setTitulo(scan.nextLine());
		
		System.out.println("Informe o Genero do livro:\t");
		String genero = scan.nextLine();
		digital.setGenero(genero);
		
		System.out.println("Informe a Situação do livro:\t");
		String situacao = scan.next();
		digital.setSituacao(situacao);
		
		System.out.println("Informe a Etiqueta do livro:\t");
		int etiquetaD = scan.nextInt();
		digital.setEntiqueta(etiquetaD);
		
		System.out.println("Informe o valor do livro:\t");
		int precof = scan.nextInt();
		digital.setPreco(precof);
		
		lista.add(digital);
}
	public static void adicionar() {
		String opcao = "N";
		int opcaoG = 1;
		do {
			System.out.println("+-------------------SUBMENU------------------+");
			System.out.println("+    1       Adiciona Livro Fisico           +");
			System.out.println("+    2       Adiciona Livro Digital          +");
			System.out.println("+--------------------------------------------+");
			System.out.print(" Informe qual opção do Submenu:\t");

			opcaoG = scan.nextInt();
			if(opcaoG == 1) {
				adicionaFisico();
		}else if (opcaoG == 2) {
			adicionaDigital();
		}
			System.out.println("Deseja continuar adicionando neste Submenu? S/N:\t");
			opcao = scan.next();
		}while (opcao.equals("S") || opcao.equals("s"));
}
	public static void listar() {
		System.out.println("+    TITULO    |    GENERO    |    SITUAÇÃO    |    ENTIQUETA    |    PREÇO    ");
		
		for(Livro livro : lista) {
		System.out.println("  "+ livro.getTitulo()+"  "+"  "+ livro.getGenero()+"  "+"  "+ livro.getSituacao()+"  "+"   "+ livro.getEntiqueta()+"    "+"    "+ livro.getPreco()+"  \n");
		}
		System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------\n");
}
}
	
