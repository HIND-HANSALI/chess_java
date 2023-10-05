package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class Pawn extends Piece {

    // Classe Pion
    public Pawn(){};
    // Classe Pion
    public Pawn(String symbol,Color color) {

        super(symbol,color);
    }
    @Override
    public boolean isValidMove(Position newPosition, Position position, Piece[][] board ,Color color) {
        int dx = Math.abs(newPosition.column - position.column);
        int dy = Math.abs(newPosition.row - position.row);

        //Piece destinationPeice=board[newPosition.row][newPosition.column];
        if (newPosition.column < 0 || newPosition.column >= 8 || newPosition.row < 0 || newPosition.row >= 8 ||
        position.column < 0 || position.column >= 8 || position.row < 0 || position.row >= 8) {
            return false;
        }
//column y
        if(color == Color.White){

            // vertical vers le haut
            if (dx == 0 && dy == 1 && newPosition.row > position.row) {

                return true;
            }
            // vertical vers le haut (+deux cases au premier mouvement)
            else if (dx == 0 && dy == 2 && newPosition.row == position.row + 2 && isFirstmove) {

                return true;

            }
            //mvt diagonal pour capture
            else if (dx == 1 && dy == 1 && newPosition.row > position.row) {

                return true;

            }
        }else if (color == Color.Black) {

            // vertical vers le bas
            if (dx == 0 && dy == 1 && newPosition.row > position.row) {

                return true;
            }

            // vertical vers le haut ( -deux cases au premier mouvement)
            else if (dx == 0 && dy == 2 && newPosition.row > position.row && isFirstmove) {

                return true;

            }
            //mvt diagonal pour capture
            else if (dx == 1 && dy == 1 && newPosition.row > position.row) {

                return true;

            }


        }

        return false;

    }

    @Override
    public String toString() {
        return "Pawn";
    }



/*public Pawn(int x, int y) {
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
*/

    /*private boolean isValidMove(char[][] board, int fromX, int fromY, int toX, int toY) {
        if (fromX < 0 || fromX >= 8 || fromY < 0 || fromY >= 8 ||
                toX < 0 || toX >= 8 || toY < 0 || toY >= 8) {
            return false;
        }
        char piece = board[fromY][fromX];
        char targetPiece = board[toY][toX];
        int deltaY = toY - fromY;
//        System.out.println("piece : "+ board[fromY][fromX]);
//        System.out.println("targetPiece : "+  board[toY][toX]);
//        System.out.println("toY : "+ toY);
//        System.out.println("fromY : "+ fromY);
        // White pawn movement

        if (piece == 'P') {
            if (deltaY == 1 && toX == fromX && targetPiece == '-') {
                return true;
            } else if(deltaY == 2 && fromY == 1 && toX == fromX && targetPiece == '-' && board[fromY + 1][fromX] == '-') {
                return true;
            } else if(deltaY == 1 && Math.abs(toX - fromX) == 1 && targetPiece != '-') {
                return true;
            }

        }
        // Black pawn movement
        else if (piece == 'p') {
            if (deltaY == -1 && toX == fromX && targetPiece == '-') {
                return true;
            } else if (deltaY == -2 && fromY == 6 && deltaY == -2 && toX == fromX && targetPiece == '-' && board[fromY - 1][fromX] == '-') {
                return true;
            } else if (deltaY == -1 && Math.abs(toX - fromX) == 1 && targetPiece != '-') {
                return true;
            }
        }

        return false;
    }*/
}
