package org.example.pieces;

import org.example.board.Piece;

class Queen extends Piece {
    public Queen(int x, int y) {
        super(x, y);
    }


    public boolean isValidMove(int newX, int newY) {
        int dx = Math.abs(newX - this.x);
        int dy = Math.abs(newY - this.y);

        // mouvement soit horizontal, vertical ou diagonal
        return (dx == 0 || dy == 0 || dx == dy);
    }
}
