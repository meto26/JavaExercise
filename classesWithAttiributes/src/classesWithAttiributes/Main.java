package classesWithAttiributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","Acer Laptop",3500,3,"mavi");
		
		
		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		

	}

}
