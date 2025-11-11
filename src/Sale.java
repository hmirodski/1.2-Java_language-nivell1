import java.util.ArrayList;
import java.util.List;

public class Sale {

    List<Product> products;
    private int totalPrice;



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
