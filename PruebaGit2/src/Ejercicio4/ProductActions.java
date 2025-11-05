package Ejercicio4;
public class ProductActions {
    public void decreaseStock(Product product, int amount) {
        if (amount > 0 && amount <= product.stock) {
            product.stock = product.stock - amount;
            System.out.println("Stock dcambiado correctamente. Stock nuevo: " + product.stock);
        } else {
            System.out.println("La cantidad debe ser mayor a 0 y menor a la inicial.");
        }
    }
    
    public void increaseStock(Product product, int amount) {
        if (amount > 0) {
            product.stock = product.stock + amount;
            System.out.println("Stock dcambiado correctamente. Stock nuevo: " + product.stock);
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }
    
    public void showInfo(Product product) {
        System.out.println("El producto " + product.getName() + " cuesta " + product.getPrice() + "€ y el stock es " + 
        	product.getStock());
    }
}
