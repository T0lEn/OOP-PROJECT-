package LAB2TASK2;

public class Rook extends Piece {
    public Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return a.row == b.row || a.col == b.col;
    }
}

