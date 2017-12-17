package TotalPackage.shop;

public class Book extends Good {

    private static final String[] LIST_OF_BOOKS = {"ABC", "ENGLISH", "MATHEMATICS", "PHYSICS"};
    private static final int[] FACTOR_OF_BOOKS = {1, 2, 3, 4};
    private static final float[] PRICE_OF_BOOKS = {0.3f, 2.0f, 2.5f, 3.0f};

    public Book(String nameOfGood, int factorOfGood, float priceOfGood) {
        super(nameOfGood);
        this.factorOfGood = factorOfGood;
        this.priceOfGood = priceOfGood;
    }

    public static void arrOfBookFormer(Book[] arrOfGoods){
        for (int i = 0; i < arrOfGoods.length; i++){
            int type = (int)(Math.random() * 4);
            arrOfGoods[i] = new Book(LIST_OF_BOOKS[type], FACTOR_OF_BOOKS[type], PRICE_OF_BOOKS[type]);
        }
    }

    public void consume(){
        ownerOfGood.setIntellect(ownerOfGood.getIntellect() + factorOfGood);
    }
}
