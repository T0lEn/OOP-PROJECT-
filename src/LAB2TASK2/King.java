package LAB2TASK2;

public class King extends Piece {
    public King(Position a) {
        super(a);
    }

    @Override

    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(b.row - a.row);
        int colDiff = Math.abs(b.col - a.col);
        return rowDiff <= 1 && colDiff <= 1;
    }

}
