package oop1;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product();
		
		product1.setName("Dlongi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("deneme.jpg");
		
		Product product2= new Product();
		
		product2.setName("Aid kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("deneme2.jpg");
		
		Product product3= new Product();
		
		product3.setName("Arzum kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("deneme3.jpg");
		
		String mesaj ="Vade oranı";
		
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" +product.getName()+"<li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setFirstName("Meto");
		individualCustomer.setLastName("Meto");
		individualCustomer.setCustomerNumber("1220");
		individualCustomer.setPhone("05417171254");
		
		
		CorporedCustomer corporedCustomer = new CorporedCustomer();
		corporedCustomer.setId(2);
		corporedCustomer.setCompanyName("Meto.io");
		corporedCustomer.setPhone("05417171254");
		corporedCustomer.setTaxNumber("123456789");
		corporedCustomer.setCustomerNumber("1237");
		
		
		
	}

}
