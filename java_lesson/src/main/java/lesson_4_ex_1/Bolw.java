package lesson_4_ex_1;

public class Bolw {
    private int foodAmount;

    public Bolw(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    void addFood(int foodAmount) {
        this.foodAmount += foodAmount;
    }

    void reduceFood (int foodAmount) {
        this.foodAmount -= foodAmount;
    }

    Boolean isFoodEnough (int foodAmount) {
        if (this.foodAmount >= foodAmount) {
            return true;
        } 
        else {
            System.out.println("Not enough food in the bowl");
            return false;
        }
    }
}
