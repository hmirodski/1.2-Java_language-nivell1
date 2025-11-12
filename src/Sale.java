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



    protected int calculateTotalPrice(ArrayList<Product> products) throws VendaBuidaException {
        int total = 0;

        if (products.isEmpty()){
            throw new VendaBuidaException();
        }

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }



}
