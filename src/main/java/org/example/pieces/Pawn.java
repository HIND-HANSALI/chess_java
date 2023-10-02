package org.example.pieces;

import org.example.board.Piece;

public class Pawn extends Piece {
    // Classe Pion
    public Pawn(int x, int y) {
        super(x, y);
    }

    public boolean isValidMove(int newX, int newY) {
        // vertical vers le haut
        if (newX == this.x && newY == this.y + 1) {
            return true;
        }

        // vertical vers le bas
        if (newX == this.x && newY == this.y - 1) {
            return true;
        }

        // vertical vers le hautd ( +deux cases au premier mouvement)
        if (this.y == 1 && newX == this.x && newY == this.y + 2) {
            return true;
        }

        //vertical vers le bas (-deux cases au premier mouvement)
        if (this.y == 6 && newX == this.x && newY == this.y - 2) {
            return true;
        }



        return false;
    }


   
}
