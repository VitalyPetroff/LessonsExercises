package TotalPackage.shop;

public class BooksFormer {

    private static final String[] LIST_OF_BOOKS = {"ABC", "ENGLISH", "MATHEMATICS", "PHYSICS"};
    private static final int[] FACTOR_OF_BOOKS = {1, 2, 3, 4};
    private static final float[] PRICE_OF_BOOKS = {0.3f, 2.0f, 2.5f, 3.0f};

    public static Food[] arrOfBookFormer(Food[] arrOfFood){
        for (int i = 0; i < arrOfFood.length; i++){
            int type = (int)(Math.random() * 4);
            arrOfFood[i] = new Food(LIST_OF_BOOKS[type], FACTOR_OF_BOOKS[type], PRICE_OF_BOOKS[type]);
        }
        return arrOfFood;
    }
}
