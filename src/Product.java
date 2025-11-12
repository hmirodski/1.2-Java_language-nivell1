public class Product {
    private final String name;
    private final int price;

    public Product(String name, int price) {

        if (name == null) {
            throw new IllegalArgumentException("Parametro nombre no puede ser null");
        }

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Parametro nombre no puede estar vacio");
        }

        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
