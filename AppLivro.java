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
		String opcaoMenu = "N";
		do {
			System.out.println("+------------------- MENU -------------------+");
			System.out.println("+    1           Adicionar Livro             +");
			System.out.println("+    2       Mostrar todos os Livros         +");
			System.out.println("+--------------------------------------------+\n");
			System.out.print("Digite a opção que deseja fazer no Menu:\t");
			
			int op = scan.nextInt();
			if(op == 1) {
				adicionar();
			}if (op == 2 ) {
				listar();
			}
			System.out.println("Deseja voltar ao menu? S/N:\t");
			opcaoMenu = scan.next();

	}while (opcaoMenu.equals("S") || opcaoMenu.equals("s"));
		
		System.out.println("Saiu do sistema biblioteca...");
}
	public static void adicionaFisico() {
		LivroFisico fisico = new LivroFisico();
		
		System.out.printf("Informe o titulo do livro:\n");
		String titulo = scan.nextLine();
		fisico.setTitulo(scan.nextLine());
		
		System.out.println("Informe o Gênero do livro:\t");
		String genero = scan.nextLine();
		fisico.setGenero(genero);
		
		System.out.println("Informe a Situação do livro: Disponivel ou Emprestado\t");
		String situacao = scan.next();
		fisico.setSituacao(situacao);
		
		System.out.println("Informe a Etiqueta fisica do livro:\t");
		int etiquetaF = scan.nextInt();
		fisico.setEntiqueta(etiquetaF);
		
		System.out.println("Informe o valor do livro:\t");
		float precof = scan.nextFloat();
		fisico.setPreco(precof);
		
		lista.add(fisico);
		System.out.println("--------------------------------------------");
}
	public static void adicionaDigital() {
		LivroDigital digital = new LivroDigital();
		
		System.out.println("Informe o Titulo do livro:\n");
		String titulo = scan.nextLine();
		digital.setTitulo(scan.nextLine());
		
		System.out.println("Informe o Gênero do livro:\t");
		String genero = scan.nextLine();
		digital.setGenero(genero);
		
		System.out.println("Informe a Situação do livro: Disponivel ou Emprestado\t");
		String situacao = scan.next();
		digital.setSituacao(situacao);
		
		System.out.println("Informe a Etiqueta digital do livro:\t");
		int etiquetaD = scan.nextInt();
		digital.setEntiqueta(etiquetaD);
		
		System.out.println("Informe o Valor do livro:\t");
		float precof = scan.nextFloat();
		digital.setPreco(precof);
		
		lista.add(digital);
		System.out.println("--------------------------------------------");

}
	public static void adicionar() {
		String opcaoMenu = "N";
		int opcaoSubmenu = 1;
		do {
			System.out.println("+------------------ SUBMENU -----------------+");
			System.out.println("+    1       Adicionar Livro Fisico          +");
			System.out.println("+    2       Adicionar Livro Digital         +");
			System.out.println("+--------------------------------------------+");
			System.out.print(" Informe qual opção do Submenu:\t");

			opcaoSubmenu = scan.nextInt();
			if(opcaoSubmenu == 1) {
				adicionaFisico();
		}else if (opcaoSubmenu == 2) {
			adicionaDigital();
		}
			System.out.println("Deseja continuar adicionando neste Submenu? S/N:\t");
			opcaoMenu = scan.next();
		}while (opcaoMenu.equals("S") || opcaoMenu.equals("s"));
}
	public static void listar() {
		System.out.println("| --- --- --- --- --- --- LISTA DE LIVRO --- --- --- --- --- ---|");
		for(Livro livro : lista) {
		System.out.println("|             TITULO: "+ livro.getTitulo()                        );
		System.out.println("|             GENERO: "+ livro.getGenero()                        );
		System.out.println("|             SITUAÇÃO: "+ livro.getSituacao()                    );
		System.out.println("|             ENTIQUETA: "+ livro.getEntiqueta()                  );
		System.out.println("|             PREÇO: R$"+livro.getPreco()                         );
		System.out.println("|---------------------------------------------------------------|");
		}
		System.out.println("+---------------------------------------------------------------|");
}

}
	
