package TotalPackage.shop;

public class Food extends Good {

    private static final String[] LIST_OF_FOODS = {"BANANA", "PINEAPPLE", "APPLE", "TOMATO", "VINOGRAD"};
    private static final float[] PRICE_OF_FOOD = {1.1f, 2.0f, 0.7f, 1.0f, 0.9f};
    private static final int[] FACTOR_OF_FOOD = {5, 3, 1, 3, 1};

    public Food(String nameOfGood, int factorOfGood, float priceOfGood){
        super(nameOfGood);
        this.factorOfGood = factorOfGood;
        this.priceOfGood = priceOfGood;
    }

    public static void arrOfFoodFormer(Food[] arrOfGoods){
        for (int i = 0; i < arrOfGoods.length; i++){
            int type = (int)(Math.random() * 5);
            arrOfGoods[i] = new Food(LIST_OF_FOODS[type], FACTOR_OF_FOOD[type], PRICE_OF_FOOD[type]);
        }
    }

    public void consume(){
        ownerOfGood.setForce(ownerOfGood.getForce() + factorOfGood);
    }
}
