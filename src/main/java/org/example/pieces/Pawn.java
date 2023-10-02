package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class Pawn extends Piece {
    // Classe Pion
    public Pawn(String symbol,Color color, Position position) {

        super(symbol,color,position);
    }
    public boolean isValidMove(Position newPosition, Board board) {
        int dx = Math.abs(newPosition.row - position.row);
        int dy = Math.abs(newPosition.column - position.column);
//column y
        if(this.color == Color.White){

            // vertical vers le haut
            if (dx == 0 && dy == 1 && newPosition.column > this.position.column) {
                    return true;
            }
            // vertical vers le haut ( +deux cases au premier mouvement)
            else if (dx == 0 && dy == 2 && newPosition.column == this.position.column + 2) {
                    return true;

            }
            //mvt diagonal pour capture
            else if (dx == 1 && dy == 1 && newPosition.column > this.position.column) {
                    return true;

            }
        }else if (this.color == Color.Black) {

            // vertical vers le bas
                if (dx == 0 && dy == 1 && newPosition.column < this.position.column) {
                    return true;
                }

                // vertical vers le haut ( -deux cases au premier mouvement)
                else if (dx == 0 && dy == 2 && newPosition.column == this.position.column - 2) {
                    return true;

                }
                //mvt diagonal pour capture
                else if (dx == 1 && dy == 1 && newPosition.column < this.position.column) {
                    return true;

                }


        }

        return false;

    }






}
