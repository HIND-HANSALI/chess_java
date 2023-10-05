package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class Knight extends Piece {
    public Knight(){}
    public Knight(String symbol,Color color) {

        super(symbol,color);
    }
    @Override
    public boolean isValidMove(Position newPosition, Position position,Piece[][] board ,Color color) {
        int dx = Math.abs(newPosition.column - position.column);
        int dy = Math.abs(newPosition.row - position.row);
        //  mvt sous format  "L"
        if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
            return true;
        }

        return false;
    }
    @Override
    public String toString(){
        return "Knight";
    }

}
