import System.out;

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
        productList.add(new Product(4,"Hojas",129,"escribir"));
        productList.add(new Product(5,"Borrador",5,"escribir"));
        productList.add(new Product(6,"Cartulina",7,"escribir"));

        productList.add(new Product(7,"Silla",129,"insumos"));
        productList.add(new Product(8,"Mesa",5,"insumos"));
        productList.add(new Product(9,"Café",7,"insumos"));
        productList.add(new Product(10,"Taza",129,"insumo"));
        productList.add(new Product(11,"Usb",5,"insumo"));
        productList.add(new Product(42,"EveryThing",7,"insumo"));

        int i=0;
while(i<12){
        println("Hola Mundo");
        }
        i++;
    }
}
