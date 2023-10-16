import java.util.Random;
import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayTeamA = new int[25];
        for (int index = 0; index < arrayTeamA.length; index++) {
            arrayTeamA[index] = random.nextInt(23) + 18; // Якщо 40 років включно
        }
        int sumTeamAAge = 0;
        System.out.println("Вік гравців першої команди: " + Arrays.toString(arrayTeamA));
        for (int arrayTeamAPlayers :
                arrayTeamA) {
            sumTeamAAge += arrayTeamAPlayers;
        }
        double averageTeamAAge = (double) sumTeamAAge / arrayTeamA.length;
        System.out.println("Середній вік гравців команди А: " + averageTeamAAge);
        int[] arrayTeamB = new int[25];
        for (int index = 0; index < arrayTeamB.length; index++) {
            arrayTeamB[index] = random.nextInt(23) + 18;
        }
        System.out.println("Вік гравців другої команди: " + Arrays.toString(arrayTeamB));
        int sumTeamBAge = 0;
        for (int arrayTeamBPlayers :
                arrayTeamB) {
            sumTeamBAge += arrayTeamBPlayers;
        }
        double averageTeamBAge = (double) sumTeamBAge / arrayTeamB.length;
        System.out.println("Середній вік гравців команди B: " + averageTeamBAge);
    }
}
