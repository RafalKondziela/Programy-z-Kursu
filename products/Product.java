package products;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {
	
	List<Product> productList = new ArrayList<Product>();
	
	public String name;
	public double price;
	public String measure;
	
	
	public Product () {
		
		
	}
	

	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public String getMeasure() {
		return measure;
	}




	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public void storeProduct(Product product) {
		
		productList.add(product);
	}

	
	public void showProduct(Product product) {
		
			
		for(Product products : productList) {
			
			System.out.println("Nazwa : " + products.name + " cena: " + products.price + " ilość: " + products.measure);
		}
			
		
	}


	}
