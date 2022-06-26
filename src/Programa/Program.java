package Programa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entidades.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Notebook",1200.00));
		list.add(new Product("Tablet",450.00));
		
		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				return p1.getName().toUpperCase().compareToIgnoreCase(p2.getName().toUpperCase());
			} // CLASSE ANONIMA
			
			
		};
		
		list.sort(comp);
		
		for(Product p : list)
		{
			System.out.println(p);
		}

	}

}
