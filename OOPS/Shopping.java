class Product {
    String name;
    double price;
    void display() {
        System.out.println("name: " + name);
        System.out.println("price: " + price);
    }
}
class Electronics extends Product {
    double calcDis() {
        return price - price * 0.10;
    }
}
class Clothing extends Product {
    double calcDis() {
        return price - price * 0.20;
    }
}
public class Shopping {
    public static void main(String[] args) {

        Electronics e = new Electronics();
        e.name = "Laptop";
        e.price = 50000;
        e.display();
        System.out.println("Final Price: " + e.calcDis());
        Clothing c = new Clothing();
        c.name = "Shirt";
        c.price = 1000;
        c.display();
        System.out.println("Final Price: " + c.calcDis());
    }
}