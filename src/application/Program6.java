package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entity.Product;
import services.ProductService;

public class Program6 {
//CUSTOM FUNCTION
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
		ProductService ps = new ProductService();
		
//		double sum = ps.filteredSum(list);
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		double sumGenerics = ps.filteredSumGenerics(
				list, 
				(p) -> p.getName().charAt(0) == 'T', 
				(p) -> p.getPrice()
			);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		System.out.println("Sum generics = " + String.format("%.2f", sumGenerics));
	}
}
