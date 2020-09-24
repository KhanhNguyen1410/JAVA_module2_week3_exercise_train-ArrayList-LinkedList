package service;

import model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ProductManager implements IProductManager<Product>{

    static List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "candy", 50));
        products.add(new Product(2, "fruits", 40));
        products.add(new Product(3, "drinks", 60));
    }

    @Override
    public void update(Product newObject, int id) {

        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                    products.set(i,newObject);
            }
        }
    }

    @Override
    public void add(Product object) {
        if (!isExisted(object.getId())) {
            products.add(object);
        }
        else {
            System.out.println("ID is existed");
        }
    }

    @Override
    public void delete(int id) {
        if (isExisted(id)){
            products.remove(id);
        }
    }

    @Override
    public Product showProduct() {
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
            List<Product> productList = new ArrayList<>();
            for (Product product: products){
                if (product.getName().equals(name)){
                    productList.add(product);
                }
            }
            return productList;
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            productList.add(iterator.next());
        }
        return productList;
    }
    public boolean isExisted(int id){
        for (Product product: products){
            if (id == product.getId()){
                return true;
            }
        }
        return false;
    }
}
