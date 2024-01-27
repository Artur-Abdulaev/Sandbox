package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.chessProject;

public class Rook extends ChessPiece {
    Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if ((checkPos(toLine) && checkPos(toColumn)) && (chessBoard.board[toLine][toColumn] == null ||
                !chessBoard.board[toLine][toColumn].getColor().equals(getColor()))) {

            // логика движения: меняются только линии или только столбцы
            if (Math.abs(toLine - line) > 0 && Math.abs(toColumn - column) != 0) return false;
            if (Math.abs(toLine - line) != 0 && Math.abs(toColumn - column) > 0) return false;
            // На месте стоять нельзя
            if (Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 0) return false;


            if (spaceChecker(chessBoard, line, column, toLine, toColumn)) {
                return true;
            }

        }
        return false;
    }


    @Override
    public String getSymbol() {
        return "R";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    public boolean spaceChecker(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {


//        if ((Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 0)) {
//            if ()
//
//            return true;
//        }
//        //двигаем на 1 клетку по горизонтали
//        if ((Math.abs(toColumn - column) == 1 && Math.abs(toLine - line) == 0)) {
//            return true;
//        }

        // движение по вертикали
        if (toColumn - column == 0) {
            for (int i = Math.min(line, toLine) + 1; i < Math.max(line, toLine); i++) {
                if (chessBoard.board[i][column] != null) {
                    return false;
                }
            }
            return true;
        } else { //движение по горизонтали
            for (int i = Math.min(column, toColumn) + 1; i < Math.max(column, toColumn); i++) {
                if (chessBoard.board[line][i] != null) {
                    return false;
                }
            }
            return true;
        }
    }


}
