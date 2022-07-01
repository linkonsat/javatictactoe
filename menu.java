import java.util.Scanner;
import java.util.Arrays;

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

    public static void win() {

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
    int[][] board = new int[3][3];
    public static void main(String[] args) {        
    }
}

class Display {
    public static void displayBoard(int[][] board) {
        for (int i = 0; i <= 2; ++i) {
        System.out.println(Arrays.toString(board[i]));
        }
    }
}