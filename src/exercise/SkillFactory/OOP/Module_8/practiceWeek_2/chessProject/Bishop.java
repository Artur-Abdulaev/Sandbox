package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.chessProject;

public class Bishop extends ChessPiece {


    Bishop(String color) {
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

            // любой ход должен изменять линию или колонку больше чем на 0
            if (Math.abs(toLine - line) == 0 || Math.abs(toColumn - column) == 0) return false;

            // модуль изменения значения строк должен быть равен изменению значения колонок
            if (Math.abs((toLine - line)) != Math.abs(toColumn - column)) return false;

            // если двигать на 1 клетку
            if (Math.abs(line - toLine) == 1) {
                return true;
            }

            return  (spaceChecker(chessBoard, line, column, toLine, toColumn));

        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    public boolean spaceChecker(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean isSpace = true;

        for (int i = Math.min(line, toLine) + 1, k = Math.max(column, toColumn) - 1; i < Math.max(line, toLine); i++, k--) {
            if (chessBoard.board[i][k] != null) {
                isSpace = false;
                break;
            }
        }

        return isSpace;
    }
}
