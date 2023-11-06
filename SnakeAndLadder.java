public class SnakeAndLadder {
    static int playerPosition = 1;

    public static void main(String[] args){
        int winning = 100;
        int diceRolls = 0;
        int die;

        System.out.println("The Ladder Positions on GameBoard: [2, 8, 20, 32, 41, 74, 82, 85]");
        System.out.println("The Snake Positions on GameBoard: [29, 38, 47, 53, 62, 86, 92, 97]");
        System.out.println("The Game started 1");

        while (playerPosition != winning) {
            die = (int) (Math.random() * 6) + 1;
            diceRolls++;
            System.out.println("Die number: " + die);
            System.out.println("Number of times dice rolled: " + diceRolls);

            int newPosition = playerPosition + die;

            if (newPosition <= winning) {
                playerPosition = newPosition;
            }

            playerPosition = Ladder(playerPosition);
            playerPosition = Snake(playerPosition);

            System.out.println("Current Player Position: " + playerPosition);

            if (playerPosition == winning) {
                System.out.println("Congratulations! You won the Game!!!");
            }
        }
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
