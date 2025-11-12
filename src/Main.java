import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {

        try {

            Sale venta1 = new Sale();
            venta1.addProduct(new Product("Mango", 10));
            venta1.addProduct(new Product("Lechosa", 25));
            venta1.addProduct(new Product("Cambur", 30));
            venta1.calculateTotalPrice();

            int total = venta1.getTotalPrice();
            System.out.println(total);


        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());

        }


        try{
            ArrayList<Product> productCollection2 = new ArrayList<>();
            Product product5 = new Product("cambur",10);
            productCollection2.add(product5);

            Product p = productCollection2.get(10);

        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }



    }
}
