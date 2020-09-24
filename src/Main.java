import model.Product;
import service.ProductManager;

import java.util.*;

public class Main {
    static void display(List<Product> products){
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        //add new
        Product addNew = new Product(4,"rice",70);
        productManager.add(addNew);
        List<Product> products = new ArrayList<>();
        products = productManager.findAll();
        display(products);
        //update
        System.out.println("---updateProduct---");
        Product editNew = new Product(4,"riceStick",30);
        productManager.update(editNew,4);
        products = productManager.findAll();
        display(products);


        //find by name
        System.out.println("----findByName---");
        products = productManager.findByName("candy");
        display(products);

        //sort
        System.out.println("---sort by price---");
        products= productManager.findAll();
        Collections.sort(products);
        display(products);


    }
}
