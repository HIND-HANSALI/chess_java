package org.example.board;

public class Board {
    private Integer rows;
    private Integer columns;

    private Piece[][] pieces;

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public Board(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[8][8];
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

    /*public static void printBoard(Piece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j], false);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }*/



    public static void main(String[] args) {
        char[][] chessBoard = createChessBoard();
        printChessBoard(chessBoard);
    }

}

