public class Queen extends ChessPiece {

    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line < 0 || line > 7 || column < 0 || column > 7 || toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7)
            return false;

        int diffX = Math.abs(toLine - line);
        int diffY = Math.abs(toColumn - column);

        return (line == toLine || column == toColumn) || (diffX == diffY);
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}