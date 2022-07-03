import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Menu {
    static Board board = new Board();
    static Player firstPlayer = new Player();
    static Player secondPlayer = new Player();
    static Display display = new Display();
    public static void main(String[] args) {
        System.out.println("Hi player! You will will be able to choose.");
        System.out.println("X or O for the board");
        String playerSymbol = getPlayerIcon();
        firstPlayer.setdefaultSymbol(playerSymbol);
        Player secondPlayer = getSecondPlayer(firstPlayer.defaultSymbol);
        round();
    }

    public static void round() {
        display.displayBoard(board.board);
    }

    public static void win(int[][] board) {
    }

    public static String getPlayerIcon() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter X or O. ");
        String playersymbol = reader.nextLine();
        return playersymbol;
    }

    public static Player getSecondPlayer(String symbol) {
        if (symbol == "X") {
            Player playerTwo = new Player();
            playerTwo.setdefaultSymbol("X");
            return playerTwo;
        } else {
            Player playerTwo = new Player();
            playerTwo.setdefaultSymbol("O");
            return playerTwo;
        }
    }
    
}

class Player {
    String defaultSymbol = "";
    public static void main(String[] args) {
    }

    public void setdefaultSymbol(String symbol) {
        this.defaultSymbol = symbol;
    }
}

class Board {
    static int[][] board = new int[3][3];
    public static void main(String[] args) {        
    }

    public static void getColumns() {
        ArrayList<String> cars = new ArrayList<String>();
        for (int i = 0; i <= 2; ++i) {
            int[] firstDiagonal = new int[]{board[0][i], board[1][i], board[2][i]};
        }
    }
    public static void getRows() {
        ArrayList<String> cars = new ArrayList<String>();
        for (int i = 0; i <= 2; ++i) {
            int[] firstDiagonal = new int[]{board[i][0], board[i][1], board[i][2]};
        }
    }
    public static void getDiagonals() {
       int[] firstDiagonal = new int[]{board[0][0], board[1][1], board[2][2]};
       int[] secondDiagonal = new int[]{board[0][2], board[1][1], board[2][0]};
    }
}

class Display {
    public static void displayBoard(int[][] board) {
        for (int i = 0; i <= 2; ++i) {
        System.out.println(Arrays.toString(board[i]));
        }
    }
}