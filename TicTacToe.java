import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    Player playerOne;
    Player playerTwo;
    List<String> gameBoard;

    public TicTacToe(Player playerOne, Player playerTwo, List<String> gameBoard) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.gameBoard = gameBoard;
        gameBoard = new ArrayList<>(8);
        for (int i = 0; i < gameBoard.size(); i++) {
            gameBoard.add(" ");
        }
    }
 
    public String playGame() {
        String gameOutcome = " ";
        String winningCombination = " ";
        for (int listIndex = 0; listIndex < gameBoard.size(); listIndex++) {
            switch (listIndex) {
                case 0:
                    winningCombination = gameBoard.get(0) + gameBoard.get(1) + gameBoard.get(2);
                    break;
                case 1:
                    winningCombination = gameBoard.get(1) + gameBoard.get(4) + gameBoard.get(7);
                    break;
                case 2:
                    winningCombination = gameBoard.get(3) + gameBoard.get(4) + gameBoard.get(5);
                    break;
                case 3:
                    winningCombination = gameBoard.get(0) + gameBoard.get(3) + gameBoard.get(6);
                    break;
                case 4:
                    winningCombination = gameBoard.get(2) + gameBoard.get(5) + gameBoard.get(8);
                    break;
                case 5:
                    winningCombination = gameBoard.get(6) + gameBoard.get(7) + gameBoard.get(8);
                    break;
                case 6:
                    winningCombination = gameBoard.get(0) + gameBoard.get(4) + gameBoard.get(8);
                    break;
                case 7:
                    winningCombination = gameBoard.get(2) + gameBoard.get(4) + gameBoard.get(6);
                    break;
            }
            if (winningCombination.equals("xxx")) {
                gameOutcome = "x won";
            } else if (winningCombination.equals("ooo")) {
                gameOutcome = "o won";
            } else {
                gameOutcome = "tie";
            }
        }
        return gameOutcome;
    }
}