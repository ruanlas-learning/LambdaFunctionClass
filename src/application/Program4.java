package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import entity.Product;

public class Program4 {
// Consumer ********
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
//		Consumer<Product> priceUpdate = new Consumer<Product>() {
//			@Override
//			public void accept(Product p) {
//				p.setPrice(p.getPrice() * 1.1);
//			}
//		};
		
//		Consumer<Product> priceUpdate = (p) -> {
//			p.setPrice(p.getPrice() * 1.1);
//		};
		
//		Consumer<Product> priceUpdate = (p) -> p.setPrice(p.getPrice() * 1.1);
		
//		Consumer<Product> priceUpdate = Product::staticPriceUpdate;
//		Consumer<Product> priceUpdate = Product::nomStaticPriceUpdate;
		
//		list.forEach(priceUpdate);
		
//		list.forEach((p) -> p.setPrice(p.getPrice() * 1.1));
//		list.forEach(Product::staticPriceUpdate);
		list.forEach(Product::nomStaticPriceUpdate);
		
		list.forEach(System.out::println);
	}
}
