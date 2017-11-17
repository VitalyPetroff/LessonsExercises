import java.util.Scanner;

public class GamePlay {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int typeOfGame;
        boolean result = true;
        GameClass game = new GameClass();

        while (true){
            System.out.println("Введите тип игры: 1..3");
            typeOfGame = scan.nextInt();
            if ((typeOfGame > 0 ) && (typeOfGame < 4)){
                game.play(typeOfGame);
                break;
            } else {
                System.out.println("Выбран неверный тип игры. Попробуйте ещё раз!");
            }
        }
    }
}