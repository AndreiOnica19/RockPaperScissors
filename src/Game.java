import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>> Rock Paper Scissors Game <<<<<");
        int p1WinStreak = 0;
        int p2WinStreak = 0;

        while (true) {
            System.out.println("Player 1, make a choice: (R - Rock / P - Paper / S - Scissors");
            String player1Choice = sc.nextLine();

            if (gameStop(player1Choice, p1WinStreak, p2WinStreak)) {
                break;
            }

            System.out.println("Player 2, make a choice: (R - Rock / P - Paper / S - Scissors");
            String player2Choice = sc.nextLine();

            if (gameStop(player2Choice, p1WinStreak, p2WinStreak)) {
                break;
            }

            if (player1Choice.equalsIgnoreCase("R")) {
                System.out.println("Player 1 chose Rock");
                if (player2Choice.equalsIgnoreCase("R")) {
                    System.out.println("Player 2 chose Rock");
                    System.out.println("Draw!");
                } else if (player2Choice.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 chose Paper");
                    System.out.println("Player 2 Wins!");
                    p2WinStreak++;
                } else if (player2Choice.equalsIgnoreCase("S")) {
                    System.out.println("Player 2 chose Scissors");
                    System.out.println("Player 1 Wins!");
                    p1WinStreak++;
                } else {
                    System.out.println("Invalid choice. Please try again!");
                }
            } else if (player1Choice.equalsIgnoreCase("P")) {
                System.out.println("Player 1 chose Paper");
                if (player2Choice.equalsIgnoreCase("R")) {
                    System.out.println("Player 2 chose Rock");
                    System.out.println("Player 1 Wins!");
                    p1WinStreak++;
                } else if (player2Choice.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 chose Paper");
                    System.out.println("Draw!");
                } else if (player2Choice.equalsIgnoreCase("S")) {
                    System.out.println("Player 2 chose Scissors");
                    System.out.println("Player 2 Wins!");
                    p2WinStreak++;
                } else {
                    System.out.println("Invalid choice. Please try again!");
                }
            } else if (player1Choice.equalsIgnoreCase("S")) {
                System.out.println("Player 1 chose Scissors");
                if (player2Choice.equalsIgnoreCase("R")) {
                    System.out.println("Player 2 chose Rock");
                    System.out.println("Player 2 Wins!");
                    p2WinStreak++;
                } else if (player2Choice.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 chose Paper");
                    System.out.println("Player 1 Wins!");
                    p1WinStreak++;
                } else if (player2Choice.equalsIgnoreCase("S")) {
                    System.out.println("Player 2 chose Scissors");
                    System.out.println("Draw!");
                } else {
                    System.out.println("Invalid choice. Please try again!");
                }
            } else {
                System.out.println("Invalid choice. Please try again!");
            }
        }
    }

    private static boolean gameStop(String player1Choice, int p1WinStreak, int p2WinStreak) {
        if (player1Choice.equalsIgnoreCase("Stop")) {
            System.out.println("Total score: P1 - " + p1WinStreak + " P2 - " + p2WinStreak);
            if (p1WinStreak > p2WinStreak) {
                System.out.println("Player 1 Wins!");
            } else if (p1WinStreak == p2WinStreak) {
                System.out.println("Draw!");
            } else {
                System.out.println("Player 2 Wins!");
            }
            return true;
        }
        return false;
    }
}

