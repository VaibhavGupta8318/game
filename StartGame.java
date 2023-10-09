
class TicTacToe{
    char[][] board;
    public TicTacToe(){
       board= new char[3][3];
       initboard();
    }
    void initboard(){
        for(int i =0;i<board.length;i++){
            for(int j = 0;j<board[i].length;i++){
                board[i][j]= ' ';
            }
        }
    }

void displayBoard(){
    System.out.println("---------------------");
     for(int i =0;i<board.length;i++){
        System.out.print("");
            for(int j = 0;j<board[i].length;i++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("---------------------");
     }
}

}
public class StartGame{

    public static void main(String[] args){

     TicTacToe t= new TicTacToe();
     t.displayBoard();
    }
}