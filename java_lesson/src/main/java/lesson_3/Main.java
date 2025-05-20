package lesson_3;

public class Main {
    public static void main(String[] args) {
        Product[] arrayProducts = new Product[5];
        {
        arrayProducts[0] = new Product("Product 1", new java.sql.Date(System.currentTimeMillis()), 
                                       "Producer 1", "China", 10000, false);
        arrayProducts[1] = new Product("Product 2", new java.sql.Date(System.currentTimeMillis()), 
                                       "Producer 2", "China", 70299, true);
        arrayProducts[2] = new Product("Product 3", new java.sql.Date(System.currentTimeMillis()), 
                                       "Producer 3", "Russia", 3005, false);
        arrayProducts[3] = new Product("Product 4");
        arrayProducts[4] = new Product("Product 5", new java.sql.Date(System.currentTimeMillis()), 
                                       "Producer 5", "Korea", 52, true);
        }
        for (Product product : arrayProducts) {
            product.getInfo();
            System.out.println();
        }

        Park park = new Park();
        park.fillPark("Ship", 10, 20, 100);
        park.fillPark("Car", 10, 20, 200);
        park.fillPark("Train", 10, 20, 300);
        park.getInfo();
    }
}
