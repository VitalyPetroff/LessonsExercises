package TotalPackage.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfGoods {

    public static List<Good> formList(List<Good> listOfGoods,
                                       int quantityOfFoods,
                                       int quantityOfClothes,
                                       int quantityOfBooks) {
        Good[] arrOfFoods = new Food[quantityOfFoods]; // массив с продуктами питания
        for (int i = 0; i < quantityOfFoods; i++){
             arrOfFoods[i] = GoodsCreator.createFood();
        }

        Good[] arrOfClothes = new Clothes[quantityOfClothes]; // массив с одеждой
        for (int i = 0; i < quantityOfClothes; i++){
            arrOfClothes[i] = GoodsCreator.createClothes();
        }

        Good[] arrOfBooks = new Book[quantityOfBooks]; // массив с книгами
        for (int i = 0; i < quantityOfBooks; i++){
            arrOfBooks[i] = GoodsCreator.createBook();
        }

        // массив всех товаров
        Good[] arrOfGoods = new Good[quantityOfFoods + quantityOfClothes + quantityOfBooks];
        for (int i = 0; i < quantityOfFoods; i++) {
            arrOfGoods[i] = arrOfFoods[i];
        }
        for (int i = 0; i < quantityOfClothes; i++) {
            arrOfGoods[i + quantityOfFoods] = arrOfClothes[i];
        }
        for (int i = 0; i < quantityOfBooks; i++) {
            arrOfGoods[i + quantityOfFoods + quantityOfClothes] = arrOfBooks[i];
        }

        listOfGoods = new ArrayList<>(Arrays.asList(arrOfGoods)); // список товаров
        return listOfGoods;
    }

    public static void printList(List<Good> listOfGoods){
        for (Good good : listOfGoods){
            System.out.println(good.toString());
        }
    }
}