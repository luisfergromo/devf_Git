
class Product {
    private int productID;
    private String productName;
    private int productPrice;
    private String productType;
}

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Libreta",129,"escribir"));
        productList.add(new Product(2,"Lápiz",5,"escribir"));
        productList.add(new Product(3,"Pluma",7,"escribir"));
    }
}
