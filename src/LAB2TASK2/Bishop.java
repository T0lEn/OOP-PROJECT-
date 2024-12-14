package LAB2TASK2;

public class Bishop extends Piece {
    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return Math.abs(a.row - b.row) == Math.abs(a.col - b.col);
    }
}
