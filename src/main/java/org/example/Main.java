package org.example;

import org.example.board.Board;
import org.example.board.Color;
import org.example.board.Piece;
import org.example.board.Position;
import org.example.pieces.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Pawn pawn=new Pawn();

        Board chessBoard = new Board();
        Piece[][] board = chessBoard.getBoard();
        System.out.println(board);

        Scanner scanner = new Scanner(System.in);
        while(true){

            chessBoard.printBoard(board);
            System.out.print("Enter from position (ex., a2): ");
            String startposition = scanner.nextLine();
            System.out.print("Enter to position (ex., a4): ");
            String finPosition = scanner.nextLine();



            int startX = startposition.charAt(0) - 'a';
            int startY = 7 - (startposition.charAt(1) - '1');

            int endX = finPosition .charAt(0) - 'a';;
            int endY = 7 - (finPosition.charAt(1) - '1');

            Piece pieceToMove = board[startY][startX];
//            System.out.println(pieceToMove.toString());



            Position fromPosition = new Position(startY, startX);
            Position toPosition = new Position(endY, endX);
            switch (pieceToMove.toString()) {
                case "Pawn":

                    Pawn pawn = new Pawn();
                    if (pawn.isValidMove(fromPosition,toPosition,board,pieceToMove.getColor())){

                        chessBoard.makeMove(fromPosition,toPosition,board);
                    } else {
                        System.out .println("Invalid move. Try again.");
                    }
                    //System.out.println("is Pawn");
                    break;
                case "Rook":
                    Rook rook = new Rook();
                    if (rook.isValidMove(fromPosition,toPosition,board,pieceToMove.getColor())){

                        chessBoard.makeMove(fromPosition,toPosition,board);
                    } else {
                        System.out .println("Invalid move. Try again.");
                    }
                    //System.out.println("is Rook");
                    break;
                case "Knight":
                    Knight knight = new Knight();
                    if (knight.isValidMove(fromPosition,toPosition,board,pieceToMove.getColor())){

                        chessBoard.makeMove(fromPosition,toPosition,board);
                    } else {
                        System.out .println("Invalid move. Try again.");
                    }
                    //System.out.println("is Knight ");
                    break;
                case "Bishop":
                    Bishop bishop = new Bishop();
                    if (bishop.isValidMove(fromPosition,toPosition,board,pieceToMove.getColor())){

                        chessBoard.makeMove(fromPosition,toPosition,board);
                    } else {
                        System.out .println("Invalid move. Try again.");
                    }
                    //System.out.println("is Bishop ♗");
                    break;
                case "Queen":
                    Queen queen = new Queen();
                    if (queen.isValidMove(fromPosition,toPosition,board,pieceToMove.getColor())){

                        chessBoard.makeMove(fromPosition,toPosition,board);
                    } else {
                        System.out .println("Invalid move. Try again.");
                    }
                    //System.out.println("is Queen");
                    break;
                case "King":
                    King king = new King();
                    if (king.isValidMove(fromPosition,toPosition,board,pieceToMove.getColor())){

                        chessBoard.makeMove(fromPosition,toPosition,board);
                    } else {
                        System.out .println("Invalid move. Try again.");
                    }
                    //System.out.println("is King");
                    break;
                default:
                    System.out.println("nothing");
                    break;
            }




        }


//        if (pawn.isValidMove(board, fromX, fromY, toX, toY)) {
//            board[toY][toX] = board[fromY][fromX];
//            board[fromY][fromX] = '-';
//            printBoard(board);
//        } else {
//            System.out .println("Invalid move. Try again.");
//        }
    }

}