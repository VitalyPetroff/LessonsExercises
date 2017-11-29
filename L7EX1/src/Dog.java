public class Dog {

    private static final float FOOD_TO_EAT = 0.2f;

    private String nickName;
    private float weight = 0.5f;
    private float currentStomacheWeight = 0;

    public Dog(String nickName) {
        this.nickName = nickName;
    }

    public void eat(String foodName, float foodWeight) {
        eat(foodWeight);
        System.out.println(foodName);
    }

    public void eat(float... food) {
        for (int i = 0; i < food.length; i++) {
            try {
                currentStomacheWeight += food[i];
        }
    }

    public float poo() {
        float pooWeight = currentStomacheWeight;
        currentStomacheWeight = 0;
        return pooWeight;
    }

    public float getWeight() {
        return weight + currentStomacheWeight;
    }
}