import java.util.Scanner;

public class Guesser {
    int guessNumber() {
        System.out.println("Guesser guess a number");
        Scanner scanner = new Scanner(System.in);
        int guessNum = scanner.nextInt();
        return guessNum;
    }

}

class Player {
    int PlayerGuess() {
        System.out.println("Player guess a number");
        Scanner scanner = new Scanner(System.in);
        int play = scanner.nextInt();
        return play;
    }
}

class Umpire {
    int collectNumberFromGuesser;
    int collectNumberFromPlayerOne;
    int collectNumberFromPlayerTwo;
    int collectNumberFromPlayerThree;

    void getNumberFromGuesser() {
        Guesser guesser = new Guesser();
        collectNumberFromGuesser = guesser.guessNumber();
    }

    void getNumberFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        collectNumberFromPlayerOne = p1.PlayerGuess();
        collectNumberFromPlayerTwo = p2.PlayerGuess();
        collectNumberFromPlayerThree = p3.PlayerGuess();

    }
    void compareNumbers(){
        if(collectNumberFromGuesser==collectNumberFromPlayerOne){
            System.out.println("Player one wins ");

        }else if (collectNumberFromGuesser==collectNumberFromPlayerTwo){
            System.out.println("Player two wins ");
        }
        else if (collectNumberFromGuesser==collectNumberFromPlayerThree){
            System.out.println("Player three wins ");
        }
        else {
            System.out.println("Game lost!!Please try again ");
        }
    }


}

class GuesserMain{
    public static void main(String[] args) {
        Umpire umpire=new Umpire();
        umpire.getNumberFromGuesser();
        umpire.getNumberFromPlayer();
        umpire.compareNumbers();
        System.out.println("End of the Programme");
        int i=5;
        System.out.println(i);
        i++;
        System.out.println(i);
        String result=(i<5)?"Hariya":"Chutya";
        System.out.println("You are "+result);
    }
}

