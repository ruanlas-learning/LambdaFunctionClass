package application;

import java.util.ArrayList;
import java.util.List;

import entity.Product;

public class Program2 {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		 
		 list.add(new Product("TV", 900.00));
		 list.add(new Product("Notebook", 1200.00));
		 list.add(new Product("Tablet", 450.00));
		 
		 list.sort(Program2::compareProducts);
		 
		 list.forEach(System.out::println);
	}
	
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
}
