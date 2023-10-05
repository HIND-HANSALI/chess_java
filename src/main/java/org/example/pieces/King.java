package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class King extends Piece {
    public King() {}
    public King(String symbol,Color color) {

        super(symbol,color);
    }
    @Override
    public boolean isValidMove(Position newPosition, Position position, Piece[][] board ,Color color) {
        int dx = Math.abs(newPosition.column - position.column);
        int dy = Math.abs(newPosition.row - position.row);
        // mouvement partout
        if (dx <= 1 && dy <= 1) {
            return true;
        }

        return false;
    }
    @Override
    public String toString(){
        return "King";
    }

}
