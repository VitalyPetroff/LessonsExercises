public class Animal {

    private String nickName;

    public Animal(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return ("Nickname of Cat is " + nickName);
    }
}
