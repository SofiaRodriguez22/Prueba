package Ejercicio4;

public class OrdersActions {
	public void addProduct(Order order, Product product, int cantidad) {
		order.getProducts().add(product);
		order.total = order.total + product.getPrice();
		System.out.println("El total es: " + order.total);
	}
	public void removeProduct(Order order, Product product) {
		order.getProducts().remove(product);
		order.total = order.total - product.getPrice();
		System.out.println("El total es: " + order.total);
	}
	public void calculateTotal(Order order) {
		System.out.println("El total es: " + order.total);
	}
	public void showResume() {
		
	}
}
