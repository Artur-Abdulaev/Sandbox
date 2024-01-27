package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.chessProject;

public class Pawn extends ChessPiece {
    Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if ((checkPos(toLine) && checkPos(toColumn)) && (chessBoard.board[toLine][toColumn] == null ||
                 !chessBoard.board[toLine][toColumn].getColor().equals(this.getColor()))) {

            if (Math.abs(toLine - line) > 2 || Math.abs(toColumn - column) > 1 || Math.abs(toLine - line) == 0 )
                return false;

            // для белых
            if (getColor().equals("White")) {

                //на 2 клетки с первого хода
                if ((toLine - line == 2 && toColumn - column == 0) && (line == 1 && chessBoard.board[toLine][toColumn] == null)
                        && chessBoard.board[toLine - 1][toColumn] == null) return true;

                //на 1 клетку вперед
                if (toLine - line == 1 && toColumn - column == 0 && chessBoard.board[toLine][toColumn] == null)
                    return true;

                //поесть на искосок
                return eatPiece(chessBoard, line, column, toLine, toColumn);
            }

            // для черных
            if (getColor().equals("Black")) {
                //на 2 клетки с первого хода
                if ((line - toLine == 2 && toColumn - column == 0) && (line == 6 && chessBoard.board[toLine][toColumn] == null)
                        && chessBoard.board[toLine + 1][toColumn] == null) return true;

                //на 1 клетку
                if (line - toLine == 1 && toColumn - column == 0 && chessBoard.board[toLine][toColumn] == null)
                    return true;

                //поесть на искосок
                return eatPiece(chessBoard, line, column, toLine, toColumn);
            }
            return false;
        }
        return false;
    }

    public boolean eatPiece (ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return !chessBoard.board[toLine][toColumn].getColor().equals(this.getColor()) &&
                Math.abs(line - toLine) == 1 && Math.abs(toColumn - column) == 1 && chessBoard.board[toLine][toColumn] != null;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

}
