public class Main {
    public static void main(String[] args) {
        Product productFish = new Product("1","Fish");
        ProductsImpl products = new ProductsImpl();
        products.addProduct(productFish);
    }
}