package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

// Tour
public class Rook extends Piece {

    public Rook(String symbol,Color color, Position position) {

        super(symbol,color,position);
    }

    public boolean isValidMove(Position newPosition, Board board) {
        int dx = Math.abs(newPosition.row - position.row);
        int dy = Math.abs(newPosition.column - position.column);

        // déplacement verticale (même x col)
        // déplacement horizontale(même y lig)
        if (dx == 0 && dy >0 || dy == 0 && dx >0  ) {
            return true;
        }
        return false;
    }







}
