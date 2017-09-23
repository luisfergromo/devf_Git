//import java.util.ArrayList;
//import Alfabetico;

import java.util.ArrayList;

class Product {
    private int productID;
    private String productName;
    private int productPrice;
    private String productType;
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("ASD");
        a.add("as");

        for(int i = 0; i <a.size(); i++) System.out.println(a.get(i));
        //test.class.getClasses();
        /*ArrayList<Product> pList = new ArrayList<Product>();
        productList.add(new Product(1,"Libreta",129,"escribir"));
        System.out.print(productList.toArray());*/
        //for (int i=0;i<productList.size();i++){
            //System.out.println(productList.get().productName);
        //ArrayList<Product> productList = new ArrayList<Product>();
        //productList.add(2,"Lápiz",5,"escribir");
        //productList.add(1,"a",21,"b");
       /*
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
        //}
        //Alfavetico(productList);
        */
    }
}
