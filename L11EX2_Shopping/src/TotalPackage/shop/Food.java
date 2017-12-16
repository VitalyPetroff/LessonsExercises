package TotalPackage.shop;

public class Food extends Good {

    public Food(String nameOfGood, int factorOfGood){
        this.nameofGood = nameOfGood;
        this.factorOfGood = factorOfGood;
    }

    public void consume(){
        ownerOfGood.setForce(ownerOfGood.getForce() + factorOfGood);
    }
}
