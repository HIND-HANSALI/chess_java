package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class Bishop extends Piece {
    //Fou
    public Bishop(String symbol,Color color, Position position) {

        super(symbol,color,position);
    }

    public boolean isValidMove(Position newPosition, Board board) {
        int dx = Math.abs(newPosition.row - position.row);
        int dy = Math.abs(newPosition.column - position.column);
        // mvt diagonale
        if (dx == dy) {
            return true;
        }

        return false;
    }

}
