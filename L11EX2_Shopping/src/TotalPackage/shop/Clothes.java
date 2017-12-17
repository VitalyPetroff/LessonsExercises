package TotalPackage.shop;

public class Clothes extends Good {

    private static final String[] LIST_OF_CLOTHES = {"SPECTACLES", "JACKET", "CLOCK", "CHAIN"};
    private static final int[] FACTOR_OF_CLOTHES = {1, 2, 3, 4};
    private static final float[] PRICE_OF_CLOTHES = {2.0f, 6.0f, 4.0f, 8.0f};

    public Clothes(String nameOfGood, int factorOfGood, float priceOfGood) {
        super(nameOfGood);
        this.factorOfGood = factorOfGood;
        this.priceOfGood = priceOfGood;
    }

    public static void arrOfClothesFormer(Clothes[] arrOfGoods){
        for (int i = 0; i < arrOfGoods.length; i++){
            int type = (int)(Math.random() * 4);
            arrOfGoods[i] = new Clothes(LIST_OF_CLOTHES[type], FACTOR_OF_CLOTHES[type], PRICE_OF_CLOTHES[type]);
        }
    }

    public void consume(){
        ownerOfGood.setCharisma(ownerOfGood.getCharisma() + factorOfGood);
    }
}
