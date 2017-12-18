package TotalPackage.shop;

public class GoodsCreator {

    private static final String[] LIST_OF_FOOD = {"BANANA", "PINEAPPLE", "APPLE", "TOMATO", "VINOGRAD"};
    private static final float[] PRICE_OF_FOOD = {1.1f, 2.0f, 0.7f, 1.0f, 0.9f};
    private static final int[] FACTOR_OF_FOOD = {5, 3, 1, 3, 1};

    private static final String[] LIST_OF_CLOTHES = {"SPECTACLES", "JACKET", "CLOCK", "CHAIN"};
    private static final int[] FACTOR_OF_CLOTHES = {1, 2, 3, 4};
    private static final float[] PRICE_OF_CLOTHES = {2.0f, 6.0f, 4.0f, 8.0f};

    private static final String[] LIST_OF_BOOK = {"ABC", "ENGLISH", "MATHEMATICS", "PHYSICS"};
    private static final int[] FACTOR_OF_BOOK = {1, 2, 3, 4};
    private static final float[] PRICE_OF_BOOK = {0.3f, 2.0f, 2.5f, 3.0f};

    public static Food createFood() {
        int type = (int) (Math.random() * 4);
        return new Food(LIST_OF_FOOD[type], FACTOR_OF_FOOD[type], PRICE_OF_FOOD[type]);
    }

    public static Clothes createClothes() {
        int type = (int) (Math.random() * 4);
        return new Clothes(LIST_OF_CLOTHES[type], FACTOR_OF_CLOTHES[type], PRICE_OF_CLOTHES[type]);
    }

    public static Book createBook() {
        int type = (int) (Math.random() * 4);
        return new Book(LIST_OF_BOOK[type], FACTOR_OF_BOOK[type], PRICE_OF_BOOK[type]);
    }
}