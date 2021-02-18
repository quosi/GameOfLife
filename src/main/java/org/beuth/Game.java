package org.beuth;

public class Game {

    public int numberOfNeighbours(int[][] board, int i,int j ){
        int res =0;
        if (i-1>-1){
            res=board[i-1][j]+res;
        }
        if ((j+1<board[0].length)&&(i-1>-1)){
            res=board[i-1][j+1]+res;
        }

        if ((j-1>-1)&& i-1>-1){
            res=board[i-1][j-1]+res;
        }
        if ((j-1>-1)){
            res=board[i][j-1]+res;
        }
        if ((j+1<board[0].length)){
            res=board[i][j+1]+res;
        }
        if ((i+1<board.length)&& (j+1<board[0].length)){
            res=board[i+1][j+1]+res;
        }

        if ((j-1>-1)&&(i+1<board.length)){
            res=board[i+1][j-1]+res;
        }
        if ((i+1<board.length)){
            res=board[i+1][j]+res;
        }
        return res;
    }

    public void gameOfLife(int[][] board) {
        int[][] res = new int [board.length][board[0].length];
        for (int i=0;i<board.length; i ++){
            for (int j=0;j<board[0].length; j ++){
                int neighbours = numberOfNeighbours(board, i,j);
                if (neighbours==3&& res[i][j]==0){
                    res[i][j]=1;
                }
                if (neighbours<2){
                    res[i][j]=0;
                }
                if (neighbours>3){
                    res[i][j]=0;
                }
                if ((neighbours==2&& board[i][j]==1)||neighbours==3&& board[i][j]==1) {
                    res[i][j]=1;
                }
            }
        }
        for (int i=0;i<board.length; i ++){
            for (int j=0;j<board[0].length; j ++){
                board[i][j]=res[i][j];
            }
        }
    }
}