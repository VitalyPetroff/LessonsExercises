package TotalPackage.shop;

public class FoodFormer {

    private static final String[] LIST_OF_FOODS = {"BANANA", "PINEAPPLE", "APPLE", "TOMATO", "VINOGRAD"};
    private static final float[] PRICE_OF_FOOD = {1.1f, 2.0f, 0.7f, 1.0f, 0.9f};
    private static final int[] FACTOR_OF_FOOD = {5, 3, 1, 3, 1};

    public static Food[] arrOfFoodFormer(Food[] arrOfFood){
        for (int i = 0; i < arrOfFood.length; i++){
            int type = (int)(Math.random() * 5);
            arrOfFood[i] = new Food(LIST_OF_FOODS[type], FACTOR_OF_FOOD[type], PRICE_OF_FOOD[type]);
        }
        return arrOfFood;
    }
}