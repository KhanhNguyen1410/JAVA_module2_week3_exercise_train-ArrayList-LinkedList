package model;

public class Product implements  Comparable<Product>  {
    private int id;
    private String Name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        Name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.getPrice()){
            return -1;
        } else if (this.price < o.getPrice()){
            return 1;
        } else {
            return 0;
        }
    }
}
