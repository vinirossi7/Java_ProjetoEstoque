package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com dados do produto: ");
		System.out.println("nome do produto: ");
		String nome = sc.nextLine();
		System.out.println("Preço do produto: ");
		double preco = sc.nextDouble();
		System.out.println("quantidade do produto: ");
		int quantidade = sc.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);

		produto.setNome("Computador");
		System.out.println("nome atualizado para: " + produto.getNome());
		produto.setPreco(1200.00);
		System.out.println("preço atualizado para: "+ produto.getPreco());
		System.out.println();
		System.out.println("Dados do produto: " + produto);

		System.out.println();
		System.out.println("Entre com o numero de produtos que vão ser add: ");
		quantidade = sc.nextInt();
		produto.addQuantidade(quantidade);

		System.out.println();
		System.out.println("atualização do estoque: " + produto);

		System.out.println();
		System.out.println("Entre com o numero de produtos que vão ser removido: ");

		quantidade = sc.nextInt();
		produto.removeQuantidade(quantidade);

		System.out.println();
		System.out.println("atualização do estoque: " + produto);

		sc.close();

	}

}
