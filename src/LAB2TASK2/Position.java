package LAB2TASK2;

public class Position {
    int row;
    int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
    //на доске она или нет(позиция)
    public boolean isValid() {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}
