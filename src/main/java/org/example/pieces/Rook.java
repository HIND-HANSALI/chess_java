package org.example.pieces;

import org.example.board.Piece;

// Tour
class Rook extends Piece {
    public Rook(int x, int y) {
        super(x, y);
    }


    public boolean isValidMove(int newX, int newY) {
        // déplacement verticale (même x col)
        if (newX == this.x && newY != this.y) {
            return true;
        }

        // déplacement horizontale(même y lig)
        if (newY == this.y && newX != this.x) {
            return true;
        }

        return false;
    }
}
