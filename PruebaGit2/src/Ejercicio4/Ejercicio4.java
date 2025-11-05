package Ejercicio4;

public class Ejercicio4 {
	public static void main(String[] args) {
		Product product1 = new Product("Oso peluche", 20, 100);
		Product product2 = new Product("Patinete", 12, 20);
		Product product3 = new Product("Estuche", 7, 300);
		
		ProductActions action = new ProductActions();
		
		action.decreaseStock(product1, 3);
		action.decreaseStock(product2, 10);
		action.decreaseStock(product3, 100);
		System.out.println();
		
		action.increaseStock(product1, 30);
		action.increaseStock(product2, 50);
		action.increaseStock(product3, 10);
		System.out.println();
		
		action.showInfo(product1);
		action.showInfo(product2);
		action.showInfo(product3);
		System.out.println();
	}
}
