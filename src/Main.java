import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {

        try {

            ArrayList<Product> productCollection = new ArrayList<>();
            Product product1 = new Product("mango",10);
            Product product2 = new Product("lime",15);
            Product product3 = new Product("pineapple",15);

            productCollection.add(product1);
            productCollection.add(product2);
            productCollection.add(product3);

            Sale.calculateTotalPrice(productCollection);

        } catch (VendaBuidaException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
