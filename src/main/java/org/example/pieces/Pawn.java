package org.example.pieces;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;

public class Pawn extends Piece {
    // Classe Pion
    public Pawn(Color color, Position position) {

        super(position,color);
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
