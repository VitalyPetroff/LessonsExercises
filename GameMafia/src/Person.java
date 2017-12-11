public class Person {

    private static final int NUMBERS_OF_PLAYERS = 6;

    private String firstName;
    private String lastName;
    private String profession;

    private static final String[] FIRST_NAMES = {
            "Саша",
            "Паша",
            "Иван",
            "Коля",
            "Игорь",
            "Сергей",
            "Егор"};
    private static final String[] LAST_NAMES = {
            "Петров",
            "Иванов",
            "Смирнов",
            "Сидоров",
            "Бобкин",
            "Добкин",
            "Хлопкин"};

    public Person(String profession) {
        this.firstName = FIRST_NAMES[(int) (Math.random() * NUMBERS_OF_PLAYERS)];
        this.lastName = LAST_NAMES[(int) (Math.random() * NUMBERS_OF_PLAYERS)];
        this.profession = profession;
    }

    public void printPersonsInformation() {
        System.out.println(lastName + " " + firstName + " " + profession);
    }

    public String getProfession(){
        return profession;
    }
}