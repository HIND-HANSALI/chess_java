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

            this.board[1][i] = new Pawn("♟", Color.White);
            this.board[6][i] = new Pawn("♙", Color.Black);
        }
//white
        this.board[0][0] = new Rook("♜", Color.White);
        this.board[0][1] = new Knight("♞", Color.White);
        this.board[0][2] = new Bishop("♝", Color.White);
        this.board[0][3] = new Queen("♛", Color.White);
        this.board[0][4] = new King("♚", Color.White);
        this.board[0][5] = new Bishop("♝", Color.White);
        this.board[0][6] = new Knight("♞", Color.White);
        this.board[0][7] = new Rook("♜", Color.White);

//Black
        this.board[7][0] = new Rook("♖", Color.Black);
        this.board[7][1] = new Knight("♘", Color.Black);
        this.board[7][2] = new Bishop("♗", Color.Black);
        this.board[7][3] = new Queen("♕", Color.Black);
        this.board[7][4] = new King("♔", Color.Black);
        this.board[7][5] = new Bishop("♗", Color.Black);
        this.board[7][6] = new Knight("♘", Color.Black);
        this.board[7][7] = new Rook("♖", Color.Black);


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

                    board[i][j]  = new Pawn("-",Color.NULL);

                    System.out.print("- "); // Print a - for empty squares
                }

            }
            System.out.println();
        }
        System.out.println("\n \ta b c d e f g h ");
    }





    public Piece getPiece(Position position){

        if(position.row >= 0 && position.row< 8 && position.column >= 0 && position.column < 8){
            return board[position.row][position.column];
        }

        return null;
    }


    public void makeMove(Position currentP,Position newP,Piece[][] board){
        //Piece sourcePiece = board[currentP.row][currentP.column];
        Piece sourcePiece = board[currentP.row][currentP.column];

        System.out.println(sourcePiece.getFirstmove());
        board[newP.row][newP.column] = board[currentP.row][currentP.column];

        board[currentP.row][currentP.column] = null ;







    }

//    public boolean makeMovetest(Position currentP,Position newP){
//        //Piece sourcePiece = board[currentP.row][currentP.column];
//    Piece currentPiece=getPiece(currentP);
//    Piece destinationPiece=getPiece(newP);
//
//    if (currentPiece==null){
//       return false;
//    }
//
//        if(currentPiece.isValidMove(newP,this)){
//            destinationPiece=currentPiece;
//            currentPiece=null;
//            currentPiece.setSymbol("-");
//            ;
//
//            //the piece has moved
//            currentPiece.setFirstmove(false);
//            return true;
//        }
//
//        return false;
//    }



    public static void main(String[] args) {
        /*char[][] chessBoard = createChessBoard();
        printChessBoard(chessBoard);*/

        /*Board chessBoard = new Board();
        Piece[][] board = chessBoard.getBoard();
        //System.out.println(board);
        chessBoard.printBoard(board);*/
    }






    public static char[][] createChessBoard() {
        char[][] board = new char[8][8];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = ' ';
            }
        }

        board[0][0]='R';
        board[0][1]='H';
        board[0][2]='B';
        board[0][3]='Q';
        board[0][4]='K';
        board[0][5]='B';
        board[0][6]='H';
        board[0][7]='R';

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

}

