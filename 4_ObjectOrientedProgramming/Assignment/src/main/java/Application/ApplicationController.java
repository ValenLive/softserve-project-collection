package Application;

import ChessPackage.ChessBoard;
import EnvelopePackage.Envelope;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.MutablePair;

public class ApplicationController {

    private static ChessBoard chessBoard;
    private static MutablePair<Envelope, Envelope> envelopes = new MutablePair<>();

    public static void executeChessBoardApp() {
        instantiateChessBoard(getIntegerPair());
        drawChessBoard();
    }

    public static void executeEnvelopeApp() {
        instantiateEnvelope(getDoublePair(), getDoublePair());
        hasValidDimensions();

    }
    //TODO GENERICS?

    private static ImmutablePair<Integer, Integer> getIntegerPair() {
        return new ImmutablePair<>(Input.readPositiveIntegerInput(), Input.readPositiveIntegerInput());
    }

    private static ImmutablePair<Double, Double> getDoublePair() {
        return new ImmutablePair<>(Input.readPositiveFloatInput(), Input.readPositiveFloatInput());
    }

    private static void instantiateChessBoard(ImmutablePair<Integer, Integer> pair) {
        chessBoard = new ChessBoard(pair.getLeft(), pair.getRight());
    }

    private static void instantiateEnvelope(ImmutablePair<Double, Double> pairOne, ImmutablePair<Double, Double> pairTwo) {
        envelopes.setLeft(new Envelope(pairOne.getLeft(), pairOne.getRight()));
        envelopes.setRight(new Envelope(pairTwo.getLeft(), pairTwo.getRight()));
    }


    private static void hasValidDimensions() {
        if (envelopes.getLeft().getA() > envelopes.getRight().getA() && envelopes.getLeft().getB() > envelopes.getRight().getB()) {
            System.out.println("First envelope doesn't fit into second one");
        } else {
            System.out.println("First envelope fit's into second one..");
        }
    }

    private static void drawChessBoard() {
        chessBoard.printChessBoard();
    }

}
