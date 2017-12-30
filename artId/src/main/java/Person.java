public class Person {

    private String firstName = "Vitaly";
    private String lastName = "Petroff";

    @Override
    public String toString() {
        String str = "Персона: " + firstName + " " + lastName;
        return str;
    }
}
