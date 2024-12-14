package LAB2TASK2;

public class Knight extends Piece{
    public Knight(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        int rowDiff = Math.abs(a.row - b.row);
        int colDiff = Math.abs(a.col - b.col);

        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
