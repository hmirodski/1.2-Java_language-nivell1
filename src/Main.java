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
            Sale venta2 = new Sale();
            venta2.addProduct(new Product("Avocado", 10));
            System.out.println(venta2.getProducts());

            venta2.getProducts().get(10);


        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
