public abstract class Person {

    private String name;
    private int budget;

    protected Person(String name) {
        this.name = name;
    }

    public abstract boolean cellVisitation(Cell cell);
}