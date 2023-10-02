package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class Queen extends Piece {

    public Queen(String symbol,Color color, Position position) {

        super(symbol,color,position);
    }

    public boolean isValidMove(Position newPosition, Board board) {
        int dx = Math.abs(newPosition.row - position.row);
        int dy = Math.abs(newPosition.column - position.column);

        // mouvement soit horizontal, vertical ou diagonal
        if (dx == 0 || dy == 0 || dx == dy) {
            return true;
        }

        return false;
    }


}
