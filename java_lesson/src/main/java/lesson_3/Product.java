package lesson_3;

import java.sql.Date;

public class Product {
    private String name;
    private Date productionDate;
    private String nameOfProducer;
    private String countryOfOrigin;
    private int price;
    private Boolean isReservation;

    public Product(String name, Date productionDate, String nameOfProducer, 
                   String countryOfOrigin, int price, Boolean isReservation) {
        this.name = name;
        this.productionDate = productionDate;
        this.nameOfProducer = nameOfProducer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReservation = isReservation;
    }

    public Product(String name) {
        this.name = name;
        this.productionDate = new Date(System.currentTimeMillis());
        this.nameOfProducer = "Unknown";
        this.countryOfOrigin = "Unknown";
        this.price = 0;
        this.isReservation = false;
    }

   public void getInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Production Date: " + productionDate);
        System.out.println("Name of Producer: " + nameOfProducer);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Price: " + price);
        System.out.println("Is Reservation: " + isReservation);
    }
}
