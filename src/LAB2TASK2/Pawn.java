package LAB2TASK2;

public class Pawn extends Piece {
    public Pawn(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        if (a.col == b.col) {

            if (a.row == 1 && (b.row - a.row == 1 || b.row - a.row == 2)) {
                return true;
            }

            else if (b.row - a.row == 1) {
                return true;
            }
        }
        return false;
    }
}
