package Programa;

import java.util.ArrayList;
import java.util.List;

import entidades.MyComparator;
import entidades.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Notebook",1200.00));
		list.add(new Product("Tablet",450.00));
		
		list.sort(new MyComparator());
		
		for(Product p : list)
		{
			System.out.println(p);
		}

	}

}
