package exercise.SkillFactory.OOP.Module_8.practiceWeek_2.chessProject;

public abstract class ChessPiece {

    String color;

    boolean check = true;

    ChessPiece (String color) {
        this.color = color;
    }

    public abstract String getColor ();


    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol ();

}
