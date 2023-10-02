package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class Knight extends Piece {

    public Knight(String symbol,Color color, Position position) {

        super(symbol,color,position);
    }

    public boolean isValidMove(Position newPosition, Board board) {
        int dx = Math.abs(newPosition.row - position.row);
        int dy = Math.abs(newPosition.column - position.column);
        //  mvt sous format  "L"
        if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
            return true;
        }

        return false;
    }

}
