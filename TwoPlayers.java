import java.lang.Thread;

public class TwoPlayers {
    static int player1Position = 1;
    static int player2Position = 1;

    public static void main(String[] args) throws InterruptedException {
        int winning = 100;
        int die;

        while (player1Position != winning && player2Position != winning) {
            for (int a = 0; a <= 1; a++) {
                int playersTurn = a;
                if (playersTurn == 0) {
                    System.out.println("Player 1's turn");
                    die = (int) (Math.random() * 6) + 1;
                    Thread.sleep(1000);
                    System.out.println("Die number: " + die);
                    player1Position = calculateNewPosition(player1Position, die);
                    System.out.println("Current Player1 Position: " + player1Position);
                } else {
                    System.out.println("Player 2's turn");
                    die = (int) (Math.random() * 6) + 1;
                    Thread.sleep(1000);
                    player2Position = calculateNewPosition(player2Position, die);
                    System.out.println("Current Player2 Position: " + player2Position);

                }
            }
        }

        if (player1Position == winning) {
            System.out.println("Player 1 won the game!");
        } else {
            System.out.println("Player 2 won the game!");
        }
    }
    public static int calculateNewPosition(int playerPosition, int die) {
        int newPosition = playerPosition + die;

        if (newPosition <= 100) {
            playerPosition = newPosition;
        }

        playerPosition = Ladder(playerPosition);
        playerPosition = Snake(playerPosition);

        return playerPosition;
    }
    public static int Ladder(int playerPosition) {
        int Ladder[] = {2, 8, 20, 32, 41, 74, 82, 85};
        for (int i : Ladder) {
            if (playerPosition == i) {
                switch (i) {
                    case 2:
                        System.out.println("Climbed Ladder at 2. Climbing 21 steps.");
                        playerPosition += 21;
                        break;
                    case 8:
                        System.out.println("Climbed Ladder at 8. Climbing 26 steps.");
                        playerPosition += 26;
                        break;
                    case 20:
                        System.out.println("Climbed Ladder at 20. Climbing 57 steps.");
                        playerPosition += 57;
                        break;
                    case 32:
                        System.out.println("Climbed Ladder at 32. Climbing 36 steps.");
                        playerPosition += 36;
                        break;
                    case 41:
                        System.out.println("Climbed Ladder at 41. Climbing 38 steps.");
                        playerPosition += 38;
                        break;
                    case 74:
                        System.out.println("Climbed Ladder at 74. Climbing 14 steps.");
                        playerPosition += 14;
                        break;
                    case 82:
                        System.out.println("Climbed Ladder at 82. Climbing 18 steps.");
                        playerPosition += 18;
                        break;
                    case 85:
                        System.out.println("Climbed Ladder at 85. Climbing 85 steps.");
                        playerPosition += 10;
                        break;

                }
            }
        }
        return playerPosition;
    }
    public static int Snake(int playerPosition) {
        int Snake[] = {29, 38, 47, 53, 62, 86, 92, 97};
        for (int i : Snake) {
            if (playerPosition == i) {
                switch (i) {
                    case 29:
                        System.out.println("Snake Swallowed at 29. Losing 20 steps.");
                        playerPosition -= 20;
                        break;
                    case 38:
                        System.out.println("Snake Swallowed at 38. Losing 23 steps.");
                        playerPosition -= 23;
                        break;
                    case 47:
                        System.out.println("Snake Swallowed at 47. Losing 42 steps.");
                        playerPosition -= 42;
                        break;
                    case 53:
                        System.out.println("Snake Swallowed 53. Losing 20 steps.");
                        playerPosition -= 20;
                        break;
                    case 62:
                        System.out.println("Snake Swallowed at 62. Losing 25 steps.");
                        playerPosition -= 25;
                        break;
                    case 86:
                        System.out.println("Snake Swallowed at 86. Losing 32 steps.");
                        playerPosition -= 32;
                        break;
                    case 92:
                        System.out.println("Snake Swallowed at 92. Losing 22 steps.");
                        playerPosition -= 22;
                        break;
                    case 97:
                        System.out.println("Snake Swallowed at 97. Losing 72 steps.");
                        playerPosition -= 72;
                        break;
                }
            }
        }
        return playerPosition;
    }

}
