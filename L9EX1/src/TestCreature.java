public class TestCreature {

    public static void main(String[] args) {
        Creature objCreature = new Creature();
        Animal objAnimal = new Animal();
        Man objMan = new Man();

        objCreature.getTitle();

        objAnimal.getTitle();
        objAnimal.consume(objCreature);

        objMan.getTitle();
        objMan.consume(objCreature);
    }
}
