package Ejercicio4;
import java.util.ArrayList;
public class Order {
	String client;
	ArrayList<Product> products;
	double total;
	
	public Order(String client, double total) {
        this.client = client;
        this.products = new ArrayList<>();
        this.total = total;
    }
	
	public String getClient() {
		return client;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public double getTotal() {
		return total;
	}
}
