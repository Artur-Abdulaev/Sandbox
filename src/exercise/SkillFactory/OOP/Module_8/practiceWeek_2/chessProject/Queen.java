package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.chessProject;

public class Queen extends ChessPiece {
    Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((checkPos(toLine) && checkPos(toColumn)) &&
                (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].getColor().equals(this.getColor()))) {


            if (Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 0) return false;

            return spaceChecker(chessBoard, line, column, toLine, toColumn);

        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    public boolean spaceChecker(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        // ход на 1 клетку по диагонали
        if (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1) return true;
        //двигаем на 1 клетку по вертикали
        if ((Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 0)) return true;
        //двигаем на 1 клетку по горизонтали
        if ((Math.abs(toColumn - column) == 1 && Math.abs(toLine - line) == 0)) return true;



        // для движения офицера
        if (Math.abs(toLine - line) == Math.abs(toColumn - column)) {
            for (int i = Math.min(line, toLine) + 1, k = Math.min(column, toColumn) + 1; i < Math.max(line, toLine); i++, k++) {
                if (chessBoard.board[i][k] != null) {
                    return false;
                }
            }
            return true;
            //для движения ладьи
        } else { // по вертикали
            if (Math.abs(toLine - line) > 0 && Math.abs(toColumn - column) != 0) return false;
            if (Math.abs(toColumn - column) > 0 && Math.abs(toLine - line) != 0) return false;
            if (toColumn - column == 0) {
                for (int i = Math.min(line, toLine) + 1; i < Math.max(line, toLine); i++) {
                    if (chessBoard.board[i][column] != null) {
                        return false;
                    }
                }

            } else { //по горизонтали
                for (int i = Math.min(column, toColumn) + 1; i < Math.max(column, toColumn); i++) {
                    if (chessBoard.board[line][i] != null) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
