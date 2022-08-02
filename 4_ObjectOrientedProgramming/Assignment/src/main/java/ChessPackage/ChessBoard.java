package ChessPackage;

public class ChessBoard {
    private int width;
    private int height;

    public ChessBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void printChessBoard() {
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                System.out.print((row + column) % 2 == 0 ? "[*]" : "[ ]");
            }
            System.out.println();
        }
    }

}
