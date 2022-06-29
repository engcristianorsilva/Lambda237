package Programa;

import java.util.ArrayList;
import java.util.List;

import entidades.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// Expressão Lambda - Classe anônima
		/*
		 * Comparator<Product> comp = (p1, p2) -> { return
		 * p1.getName().toUpperCase().compareToIgnoreCase(p2.getName().toUpperCase()); LAMBDA COM CHAVES
		 * };
		 */

		/*
		 * @Override public int compare(Product p1, Product p2) { // TODO Auto-generated
		 * method stub return
		 * p1.getName().toUpperCase().compareToIgnoreCase(p2.getName().toUpperCase()); }
		 * // CLASSE ANONIMA LAMBADA SEM CHAVES
		 */
		
		//em uma única linha - LAMBDA DECLARANDO COM UMA ÚNICA LINHA
		//Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareToIgnoreCase(p2.getName().toUpperCase());

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareToIgnoreCase(p2.getName().toUpperCase()));//IMPORTANTE

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
