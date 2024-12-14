package LAB2TASK2;

public class TestChess {
    public static void main(String[] args) {
        /*
        King – Король
        Queen – Ферзь
        Rook – Ладья
        Bishop – Слон
        Knight – Конь
        Pawn – Пешка
         */
        Piece bishop = new Bishop(new Position(0,0));

        System.out.println(bishop.isLegalMove(new Position(0,3))); // false
        System.out.println(bishop.isLegalMove(new Position(2,2))); // true

        Piece queen = new Queen(new Position(0,0));
        System.out.println(queen.isLegalMove(new Position(3,5))); //false
        System.out.println(queen.isLegalMove(new Position(4,4))); // true

        Piece king = new King(new Position(0,0));
        System.out.println(king.isLegalMove(new Position(-1,-1))); //true
        System.out.println(king.isLegalMove(new Position(1,2))); //false

        Piece rook = new Rook(new Position(0,0));
        System.out.println(rook.isLegalMove(new Position(1,0))); //true
        System.out.println(rook.isLegalMove(new Position(1,1))); //false

        Piece pawn = new Pawn(new Position(0,0));
        System.out.println(pawn.isLegalMove(new Position(1,1))); // false
        System.out.println(pawn.isLegalMove(new Position(1,0))); // true
    }
}
