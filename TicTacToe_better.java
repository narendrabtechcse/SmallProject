import java.util.Arrays;
import java.util.Scanner;

public class TicTacBoard {

    static String[] position = new String[9];

    public static void main(String[] args) {
        System.out.println("Please see the board with positions !!");
        System.out.println("User will enter there position and once they all enter there chances we will declare the winner at the end of the match !!");

        System.out.println("Game Begins !!");

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


        for (int k = 0; k < position.length; k++) {
            position[k] = "" + k + "";
        }
        printDefaultBoard();

        String turn = "X";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            if (turn == "X") {
                System.out.print("User X please enter your position : ");
                position[sc.nextInt()] = "X";
                turn = "O";
                printBoard(position);
                if (checkIfWin()) {
                    System.exit(1);
                }
            } else {
                System.out.print("User O please enter your position : ");
                position[sc.nextInt()] = "O";
                turn = "X";
                printBoard(position);
                if (checkIfWin()) {
                    System.exit(1);
                }
            }
        }
    }

    private static boolean checkIfWin() {

        for (int j = 0; j < 9; j++) {
            String line = "";

            switch (j) {

                case 0:
                    line = position[0] + position[1] + position[2];
                    break;
                case 1:
                    line = position[3] + position[4] + position[5];
                    break;
                case 2:
                    line = position[6] + position[7] + position[8];
                    break;
                case 3:
                    line = position[0] + position[3] + position[6];
                    break;
                case 4:
                    line = position[1] + position[4] + position[7];
                    break;
                case 5:
                    line = position[2] + position[5] + position[8];
                    break;
                case 6:
                    line = position[0] + position[4] + position[8];
                    break;
                case 7:
                    line = position[2] + position[4] + position[6];
                    break;
            }

            if (line.equals("XXX")) {
                System.out.println("X is winner");
                return true;
                //System.exit(1);
            } else if (line.equals("OOO")) {
                System.out.println("O is winner");
                //System.exit(1);
                return true;
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(position).contains(
                    String.valueOf(a))) {
                return false;
            } else if (a == 8) {
                System.out.println("Match is draw");
                return false;
            }
        }
        return false;
    }

    private static void printBoard(String[] position) {

        System.out.println("---- ---- ----");
        System.out.print("| " + position[0] +" |");
        System.out.print("  "+ position[1] +" |");
        System.out.print("  "+position[2]+" |");

        System.out.println();
        System.out.println("---- ---- ----");
        System.out.print("| " + position[3] +" |");
        System.out.print("  "+ position[4] +" |");
        System.out.print("  "+position[5]+" |");

        System.out.println();
        System.out.println("---- ---- ----");
        System.out.print("| " + position[6] +" |");
        System.out.print("  "+ position[7] +" |");
        System.out.print("  "+position[8]+" |");
        System.out.println();
        System.out.println("---- ---- ----");

    }

    private static void printDefaultBoard() {

        System.out.println("---- ---- ----");
        System.out.print("| 1 |");
        System.out.print("  2 |");
        System.out.print("  3 |");

        System.out.println();
        System.out.println("---- ---- ----");
        System.out.print("| 4 |");
        System.out.print("  5 |");
        System.out.print("  6 |");

        System.out.println();
        System.out.println("---- ---- ----");
        System.out.print("| 7 |");
        System.out.print("  8 |");
        System.out.print("  9 |");
        System.out.println();
        System.out.println("---- ---- ----");

    }
}
