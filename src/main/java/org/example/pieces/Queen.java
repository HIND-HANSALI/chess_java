package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class Queen extends Piece {

    public Queen(){}

    public Queen(String symbol,Color color) {

        super(symbol,color);
    }
    @Override
    public boolean isValidMove(Position newPosition, Position position,Piece[][] board ,Color color) {
        int dx = Math.abs(newPosition.column - position.column);
        int dy = Math.abs(newPosition.row - position.row);

        // mouvement soit horizontal, vertical ou diagonal
        if (dx == 0 || dy == 0 || dx == dy) {
            return true;
        }

        return false;
    }

    @Override
    public String toString(){
        return "Queen";
    }
}
