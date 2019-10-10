package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entity.Product;

public class Program5 {
// Function ********
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
//		Function<Product, String> upperCaseName = new Function<Product, String>() {
//			@Override
//			public String apply(Product p) {
//				return p.getName().toUpperCase();
//			}
//		};
		
//		Function<Product, String> upperCaseName = (p) -> p.getName().toUpperCase();
		
//		Function<Product, String> upperCaseName = (p) -> {
//			return p.getName().toUpperCase();
//		};
		
//		Function<Product, String> upperCaseName = Product::staticUpperCaseName;
		Function<Product, String> upperCaseName = Product::nomStaticUpperCaseName;
		
		List<String> names = list.stream().map(upperCaseName).collect(Collectors.toList());
		
//		List<String> names = list.stream().map((p) -> p.getName().toUpperCase()).collect(Collectors.toList());
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
//		List<String> names = list.stream().map(Product::nomStaticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
