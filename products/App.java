package products;

public class App {

	public static void main(String[] args) {
		Product mleko = new Product() {
		};
		mleko.setName("Mleko");
		mleko.setMeasure("1l");
		mleko.setPrice(2);
		
		
		
		Ser ser = new Ser();
		ser.setMeasure("1kg");
		ser.setPrice(1.50);
		
		Banan banan = new Banan();
		banan.setMeasure("3kg");
		banan.setPrice(4.50);
		
		
		mleko.storeProduct(mleko);
		ser.storeProduct(ser);
		banan.storeProduct(banan);
		
		
		mleko.showProduct(mleko);
		
		
	}

}
