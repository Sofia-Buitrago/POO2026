
public class Product {
 
    private String name;
    private double price;
    private int stock;
 
    public Product(String name, double price, int stock) {
        this.name = isValidName(name) ? name : "Unnamed";
        this.price = isValidPrice(price) ? price : 0.01;
        this.stock = isValidStock(stock) ? stock : 0;
    }
 
    public String getName() {
        return name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public int getStock() {
        return stock;
    }
 
   
    public boolean setName(String newName) {
        if (!isValidName(newName)) {
            return false;
        }
        this.name = newName;
        return true;
    }
 
   
    public boolean setPrice(double newPrice) {
        if (!isValidPrice(newPrice)) {
            return false;
        }
        this.price = newPrice;
        return true;
    }
 
  
    public boolean setStock(int newStock) {
        if (!isValidStock(newStock)) {
            return false;
        }
        this.stock = newStock;
        return true;
    }
 
    private boolean isValidName(String candidateName) {
        return candidateName != null && !candidateName.trim().isEmpty();
    }
 
    private boolean isValidPrice(double candidatePrice) {
        return candidatePrice > 0;
    }
 
    private boolean isValidStock(int candidateStock) {
        return candidateStock >= 0;
    }
}
 