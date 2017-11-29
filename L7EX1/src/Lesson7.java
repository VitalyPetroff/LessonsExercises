public class Lesson7 {

    public static void main(String[] args) {
        Person john = new Person();
        Person vasiliy = new Person("Vasiliy", "Vasiliev");
        Person lola = new Person("Lola", "Bola");

        john.printMe();
        Person.printPassport();
        System.out.println(john.getUsDollars());

        vasiliy.printMe();
        Person.printPassport();
        vasiliy.earn(5);
        System.out.println(vasiliy.getUsDollars());

        lola.printMe();
        Person.printPassport();
        System.out.println(lola.getUsDollars());

        Dog MyDog = new Dog("Шарик");
        MyDog.eat("Мяско", 0.1f);
        System.out.println(MyDog.getWeight()); // текущий вес собаки

        MyDog.eat(0.2f, 0.1f);
        System.out.println(MyDog.getWeight()); // текущий вес собаки

        MyDog.eat(0.5f);
        System.out.println(MyDog.getWeight()); // текущий вес собаки

        MyDog.poo();
        System.out.println(MyDog.getWeight()); // текущий вес собаки
    }
}