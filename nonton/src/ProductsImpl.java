import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsImpl {
    private final Map<String, Product> products;

    public ProductsImpl(){
        this.products = new HashMap<>();
    }

    public boolean addProduct(Product product){
        if(products.containsKey(product.getId())){
            return false;
        }
        products.put(product.getId(), product);
        return true;
    }

    public boolean deleteProduct(Product product){
        if(products.containsKey(product.getId())) {
            products.remove(product.getId());
            return true;
        }
        return false;
    }

    public String getName(String id){
        Product product = products.get(id);
        if(product != null) {
            return product.getName();
        }
        return "";
    }

    public List<String> findByName(String name){
        List<String> ids = new ArrayList<>();
        for(Product product : products.values()) {
            if(product.getName().equals(name)) {
                ids.add(product.getId());
            }
        }
        return ids;
    }
}
