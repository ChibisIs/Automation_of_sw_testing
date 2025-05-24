package lesson_4_ex_1;

public class Bolw {
    public Bolw(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    private int foodAmount;

    void addFood(int foodAmount) {
        this.foodAmount += foodAmount;
    }
    void eatFood (int foodAmount) {
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
