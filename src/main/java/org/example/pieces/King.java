package org.example.pieces;

import org.example.board.Piece;

class King extends Piece {
    public King(int x, int y) {
        super(x, y);
    }


    public boolean isValidMove(int newX, int newY) {
        // mouvement partout
        int dx = Math.abs(newX - this.x);
        int dy = Math.abs(newY - this.y);

        return dx <= 1 && dy <= 1;
    }
}
