package org.example.pieces;

import org.example.board.Piece;

class Bishop extends Piece {
    //Fou
    public Bishop(int x, int y) {
        super(x, y);
    }


    public boolean isValidMove(int newX, int newY) {
        // mvt diagonale
        int dx = Math.abs(newX - this.x);
        int dy = Math.abs(newY - this.y);

        if (dx == dy) {
            return true;
        }

        return false;
    }
}
