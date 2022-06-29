package entidades;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getName().toUpperCase().compareToIgnoreCase(p2.getName().toUpperCase());
		
		//compara os produtos por nome com letras maíusculas ou minúsculas sem dependência
		// compareToIgnoreCase
		 
	}
	 
	

}
