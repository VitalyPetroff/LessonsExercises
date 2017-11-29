public class Person {

    public String firstName;
    public String lastName;
    private int usDollars = 0;

    public Person(){
        firstName = "John";
        lastName = "Doe";
    }

    public void printMe(){
        System.out.println(firstName + " " + lastName);
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void earn(int amount){
        usDollars += amount;
    }

    public int getUsDollars() {
        return usDollars;
    }

    public static void printPassport(){
        System.out.println("Ухо, ноги без хвоста");
    }
}