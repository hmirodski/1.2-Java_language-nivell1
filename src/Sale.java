import java.util.ArrayList;

public class Sale {

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
