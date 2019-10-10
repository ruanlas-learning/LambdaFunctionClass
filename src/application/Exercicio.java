package application;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entity.Product;

public class Exercicio {

	public static void main(String[] args) {
		
		List<Product> list = Arrays.asList(
					new Product("Tv", 900.00),
					new Product("Mouse", 50.00),
					new Product("Tablet", 350.50),
					new Product("HD Case", 80.90),
					new Product("Computer", 850.00),
					new Product("Monitor", 290.00)
				);
		
		double avg = list.stream()
				.map(p -> p.getPrice())
				.reduce(0.0, (x, y) -> x + y) / list.size();
		
		System.out.println("Average price: " + String.format("%.2f", avg));
		
		Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		
		List<String> names = list.stream()
				.filter(p -> p.getPrice() < avg)
				.map(p -> p.getName())
				.sorted(comp.reversed())
				.collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
