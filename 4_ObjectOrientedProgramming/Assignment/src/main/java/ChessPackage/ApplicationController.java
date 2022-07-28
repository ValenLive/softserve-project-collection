package ChessPackage;

import org.apache.commons.lang3.tuple.ImmutablePair;

public class ApplicationController {

    private static ChessBoard chessBoard;

    public static void execute() {
        instantiateChessBoard(getIntegerPair());
        drawChessBoard();
    }

    private static ImmutablePair<Integer, Integer> getIntegerPair() {
        return new ImmutablePair<>(Input.readPositiveIntegerInput(), Input.readPositiveIntegerInput());
    }

    private static void instantiateChessBoard(ImmutablePair<Integer, Integer> pair) {
        chessBoard = new ChessBoard(pair.getLeft(), pair.getRight());
    }

    private static void drawChessBoard() {
        chessBoard.printChessBoard();
    }
}
