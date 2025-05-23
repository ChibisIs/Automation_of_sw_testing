package lesson_3;
import java.util.ArrayList;

public class Park {
    private ArrayList<Atraction> arrayAtractions = new ArrayList<>();

    public class Atraction {
        private String name;
        private int fromTime;
        private int toTime;
        private float price;

        public Atraction(String name, int fromTime, int toTime, float price) {
            this.name = name;
            this.fromTime = fromTime;
            this.toTime = toTime;
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setFromTime(int fromTime) {
            this.fromTime = fromTime;
        }
        public void setToTime(int toTime) {
            this.toTime = toTime;
        }
        public void setPrice(float price) {
            this.price = price;
        }
    }    
    
    public void fillPark(String name, int fromTime, int toTime, float price) {
        Atraction atraction1 = new Atraction(name, fromTime, toTime, price);
        arrayAtractions.add(atraction1);
    }
    public void getInfo() {
        for (Atraction atraction : arrayAtractions) {
            System.out.println("Attraction Name: " + atraction.name);
            System.out.println("From Time: " + atraction.fromTime);
            System.out.println("To Time: " + atraction.toTime);
            System.out.println("Price: " + atraction.price);
        }
    }
}
