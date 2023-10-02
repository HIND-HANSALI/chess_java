package org.example.board;

import org.example.pieces.*;

public class Board {
    private Integer rows;
    private Integer columns;

    private Piece[][] board;

    public Board(){

        this.board = new Piece[8][8];
        this.createChessBoard1();
    }
    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }


    public void createChessBoard1(){
        for(int i = 0; i < 8; i++) {

            this.board[1][i] = new Pawn("♟", Color.White, new Position(1, i));
            this.board[6][i] = new Pawn("♙", Color.Black, new Position(6, i));
        }
//white
        this.board[0][0] = new Rook("♜", Color.White, new Position(0, 0));
        this.board[0][1] = new Knight("♞", Color.White, new Position(0, 1));
        this.board[0][2] = new Bishop("♝", Color.White, new Position(0, 2));
        this.board[0][3] = new Queen("♛", Color.White, new Position(0, 3));
        this.board[0][4] = new King("♚", Color.White, new Position(0, 4));
        this.board[0][5] = new Bishop("♝", Color.White, new Position(0, 5));
        this.board[0][6] = new Knight("♞", Color.White, new Position(0, 6));
        this.board[0][7] = new Rook("♜", Color.White, new Position(0, 7));

//Black
        this.board[7][0] = new Rook("♖", Color.Black, new Position(7, 0));
        this.board[7][1] = new Knight("♘", Color.Black, new Position(7, 1));
        this.board[7][2] = new Bishop("♗", Color.Black, new Position(7, 2));
        this.board[7][3] = new Queen("♕", Color.Black, new Position(7, 3));
        this.board[7][4] = new King("♔", Color.Black, new Position(7, 4));
        this.board[7][5] = new Bishop("♗", Color.Black, new Position(7, 5));
        this.board[7][6] = new Knight("♘", Color.Black, new Position(7, 6));
        this.board[7][7] = new Rook("♖", Color.Black, new Position(7, 7));


    }
    public Piece[][] getBoard() {
        return this.board;
    }
    public  void printBoard(Piece[][] board) {
        for (int i = 0; i < 8; i++) {
            System.out.print("("+(8-i) +") ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getSymbol() + " ");
                } else {
                    System.out.print("- "); // Print a - for empty squares
                }

            }
            System.out.println();
        }
        System.out.println("\n \ta b c d e f g h ");
    }




    public static char[][] createChessBoard() {
        char[][] board = new char[8][8];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = ' ';
            }
        }

        board[0][0] = 'R';
        board[0][1]='H';
        board[0][2]='B';
        board[0][3]='Q';
        board[0][4]='K';
        board[0][5]='B';
        board[0][6]='H';
        board[0][7] ='R';

        for (int col = 0; col < 8; col++) {
            board[1][col] = 'P';
        }

        for (int row = 2; row < 6; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = '-';
            }
        }

        for (int col = 0; col < 8; col++) {
            board[6][col] = 'p';
        }

        board[7][0] = 'r';
        board[7][1] = 'h';
        board[7][2] = 'b';
        board[7][3] = 'q';
        board[7][4] = 'k';
        board[7][5] = 'b';
        board[7][6] = 'h';
        board[7][7] = 'r';

        return board;
    }
    public static void printChessBoard(char[][] board) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        /*char[][] chessBoard = createChessBoard();
        printChessBoard(chessBoard);*/

        Board chessBoard = new Board();
        Piece[][] board = chessBoard.getBoard();
        //System.out.println(board);
        chessBoard.printBoard(board);
    }

}

