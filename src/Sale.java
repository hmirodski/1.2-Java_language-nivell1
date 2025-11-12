import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products;
    private int totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }


    public int calculateTotalPrice() throws VendaBuidaException {

        if (this.products.isEmpty()) {
            throw new VendaBuidaException();
        }

        this.totalPrice = 0;
        for (Product product : this.products) {
            this.totalPrice += product.getPrice();
        }

        return this.totalPrice;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }


}
