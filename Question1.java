import java.util.Scanner;
import java.util.Random;
class question_1 {
    int num;
    int user_input;
    int noofguesses = 0;
    public question_1() {
        Random rand = new Random();
        num = rand.nextInt(100);
    }
    public void takeuserinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER = ");
        user_input = sc.nextInt();

    }
    public boolean iscorrectnumber() {
        noofguesses++;
        if (user_input == num) {
            System.out.format("THE NUMBER IS TRUE, IT WAS %d \n YOU COMPLETED IN %d ATTEMPTS ", num, noofguesses);
            return true;
        } else if (user_input < num) {
            System.out.println("THE NUMBER WHICH YOU ENTERED IS TOO LOW");
        } else if (user_input > num) {
            System.out.println("THE NUMBER WHICH YOU ENTERED IS TOO HIGH");
        }
        return false;
    }
}
public class Question1 {
    public static void main(String args [] ) {
        question_1 game = new question_1();
        boolean ans = false;
        while(!ans)
        {
            game.takeuserinput();

            ans = game.iscorrectnumber();
            System.out.println(ans);
        }
        System.out.println("THANKS FOR PLAYING THIS GAME");
    }
}