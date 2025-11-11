import java.util.ArrayList;

public class Sale {

    //private ArrayList<Product> products;



    static int calculateTotalPrice(ArrayList<Product> products) throws VendaBuidaException {
        int total = 0;

        if (products.isEmpty()){
            throw new VendaBuidaException();
        }

        for (Product product : products) {
            total += product.getPrice();
            System.out.println(product.getName());
        }

        System.out.println(total);

        return total;
    }



}
