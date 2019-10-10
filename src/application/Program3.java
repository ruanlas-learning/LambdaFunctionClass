package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entity.Product;

public class Program3 {
// Predicate ********
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("Hd Case", 80.00));
		
//		Predicate<Product> pred = new Predicate<Product>() {
//			
//			@Override
//			public boolean test(Product p) {
//				return p.getPrice() >= 100.0;
//			}
//		};
		
//		Predicate<Product> pred = (p) -> {
//			return p.getPrice() >= 100.0;
//		};
		
//		Predicate<Product> pred = (p) -> p.getPrice() >= 100.0;
		
//		Predicate<Product> pred = Product::staticProductPredicate;
		Predicate<Product> pred = Product::nomStaticProductPredicate;
		
		list.removeIf(pred);
		
//		list.removeIf(Product::staticProductPredicate);
//		list.removeIf(Product::nomStaticProductPredicate);
		
//		list.removeIf((p) -> p.getPrice() >= 100);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
