package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.chessProject;

public class King extends ChessPiece {
    King(String color) {
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

            if ((Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 0) ||
                    Math.abs(toLine - line) > 1 || Math.abs(toColumn - column) > 1) return false;


            return !isUnderAttack(chessBoard, toLine, toColumn);

//                if (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1) {
//                    return true;
//                }
//                //двигаем на 1 клетку по вертикали
//                if ((Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 0)) {
//                    return true;
//                }
//                //двигаем на 1 клетку по горизонтали
//                if (Math.abs(toColumn - column) == 1 && Math.abs(toLine - line) == 0) {
//                    return true;
//                }
//                return false;
            }
        return false;
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int toLine, int toColumn) {
        for (int line = 0; line <= 7; line++) {
            for (int column = 0; column <= 7; column++) {
                if (chessBoard.board[line][column] != null &&
                        !chessBoard.board[line][column].getColor().equals(chessBoard.nowPlayerColor()) &&
                        !chessBoard.board[line][column].getSymbol().equals("K") &&
                        !chessBoard.board[line][column].getSymbol().equals("P")) {
                    return chessBoard.board[line][column].canMoveToPosition(chessBoard, line, column, toLine, toColumn);
                } else if (chessBoard.board[line][column] != null &&
                        !chessBoard.board[line][column].getColor().equals(chessBoard.nowPlayerColor()) &&
                        chessBoard.board[line][column].getSymbol().equals("P") &&
                        Math.abs(line - toLine) == 1 && Math.abs(toColumn - column) == 1) {
                        return chessBoard.board[line][column].canMoveToPosition(chessBoard, line, column, toLine, toColumn);
                }
            }
        }
        return false;
    }


    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
