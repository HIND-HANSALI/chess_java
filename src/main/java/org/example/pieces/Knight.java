package org.example.pieces;

import org.example.board.Piece;

class Knight extends Piece {
    public Knight(int x, int y) {
        super(x, y);
    }


    public boolean isValidMove(int newX, int newY) {
        int dx = Math.abs(newX - this.x);
        int dy = Math.abs(newY - this.y);

        //  mvt sous format  "L"
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
