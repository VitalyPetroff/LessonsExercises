package TotalPackage.shop;

import java.util.Arrays;
import java.util.List;

public class FormerList {

    // формирование списка товаров в магазине
    public static void formOfGoodsList(List<Good> listOfGoods, 
                                       int quantityOfFoods, 
                                       int quantityOfClothes, 
                                       int quantityOfBooks) {
        Good[] shellOfFoods = new Food[quantityOfFoods]; // полка с продуктами питания
        Food.arrOfFoodFormer((Food[]) shellOfFoods);

        Good[] shellOfClothes = new Clothes[quantityOfClothes]; // полка с одеждой
        Clothes.arrOfClothesFormer((Clothes[]) shellOfClothes);

        Good[] shellOfBooks = new Book[quantityOfBooks];
        Book.arrOfBookFormer((Book[]) shellOfBooks);

        Good[] arrOfGoods = new Good[quantityOfFoods + quantityOfClothes + quantityOfBooks];
        for (int i = 0; i < quantityOfFoods; i++) {
            arrOfGoods[i] = shellOfFoods[i];
        }
        for (int i = 0; i < quantityOfClothes; i++) {
            arrOfGoods[i + quantityOfFoods] = shellOfClothes[i];
        }
        for (int i = 0; i < quantityOfBooks; i++) {
            arrOfGoods[i + quantityOfFoods + quantityOfClothes] = shellOfBooks[i];
        }

        listOfGoods = Arrays.asList(arrOfGoods);
        for (Good good : listOfGoods) {
            System.out.println(good.toString());
        }
    }
}
