package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class King extends Piece {

    public King(String symbol,Color color, Position position) {

        super(symbol,color,position);
    }

    public boolean isValidMove(Position newPosition, Board board) {
        int dx = Math.abs(newPosition.row - position.row);
        int dy = Math.abs(newPosition.column - position.column);
        // mouvement partout
        if (dx <= 1 && dy <= 1) {
            return true;
        }

        return false;
    }

}
