package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

// Tour
public class Rook extends Piece {

    public Rook(){}
    public Rook(String symbol,Color color) {

        super(symbol,color);
    }
    //♖
    @Override
    public boolean isValidMove(Position newPosition, Position position, Piece[][] board ,Color color) {
        int dx = Math.abs(newPosition.column - position.column);
        int dy = Math.abs(newPosition.row- position.row);

        // déplacement verticale (même x col)
        // déplacement horizontale(même y lig)

        if (!((dx == 0 && dy > 0) || (dx > 0 && dy == 0)) ) {
            return false;
        }

// Check for a horizontal move (dx > 0)
        if (dx > 0) {
            int stepx = (newPosition.column - position.column) / dx;
            int x = position.column + stepx;
            while (x != newPosition.column) {
                if (board[position.row][x] .getSymbol() != "-") {

                    return false;
                }
                x += stepx;
            }
        }
// Check for a verticaal move (dy > 0)
        if (dy > 0) {
            int stepy = (newPosition.row - position.row) / dy;
            int y = position.row + stepy;
            while (y != newPosition.row) {
                if (board[y][position.column].getSymbol() != "-") {
                    // There's a piece in the way
                    return false;
                }
                y += stepy;
            }
        }


        return true;
    }



    @Override
    public String toString(){
        return "Rook";
    }



}
