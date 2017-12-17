package TotalPackage.shop;

public class ClothesFormer {

    private static final String[] LIST_OF_CLOTHES = {"SPECTACLES", "JACKET", "CLOCK", "CHAIN"};
    private static final int[] FACTOR_OF_CLOTHES = {1, 2, 3, 4};
    private static final float[] PRICE_OF_CLOTHES = {2.0f, 6.0f, 4.0f, 8.0f};

    public static Food[] arrOfClothesFormer(Food[] arrOfFood){
        for (int i = 0; i < arrOfFood.length; i++){
            int type = (int)(Math.random() * 4);
            arrOfFood[i] = new Food(LIST_OF_CLOTHES[type], FACTOR_OF_CLOTHES[type], PRICE_OF_CLOTHES[type]);
        }
        return arrOfFood;
    }
}
