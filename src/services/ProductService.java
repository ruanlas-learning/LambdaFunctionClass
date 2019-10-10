package services;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import entity.Product;

public class ProductService {
	
	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
	public <T extends Object> double filteredSumGenerics(List<T> list, Predicate<T> criteria, Function<T, Double> function) {
		double sum = 0.0;
		for (T t : list) {
			if (criteria.test(t)) {
				sum += function.apply(t);
			}
		}
		return sum;
	}
}
