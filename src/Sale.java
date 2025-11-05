public class Sale {

    private Product[] products;
    private int totalPrice;


    static void calculateTotalPrice(Product[] products) throws VendaBuidaException {
        if (products.length == 0) {
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
        }

    }

}
