package LAB2TASK2;

public abstract class Piece {
    //current позиция фигурки
    Position a;
    public Piece(Position a) {
        this.a = a;
    }
    // проверка для хода
    public abstract boolean isLegalMove(Position b);
}
