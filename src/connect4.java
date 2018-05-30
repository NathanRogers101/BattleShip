import java.util.InputMismatchException;
import java.util.Scanner;

public class connect4
{
    static String[][] board = new String[8][8];
    static Scanner in;
    static String turn;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        turn = "B";//turn R

        populateboard();
        printboard();

        System.out.println("It is player 1's turn you are black");
            maincode();

    }


    static void maincode(){

        String winner = null;
        while (winner == null) {
            int numInput;
            int numInput2;

            System.out.print("Select the colum:  ");
            numInput = in.nextInt();
            System.out.print("Select the row:  ");
            numInput2 = in.nextInt();



            if (board[numInput-1][numInput2-1] == "B" || board[numInput-1][numInput2-1] == "R"){
                System.out.println("test");
                maincode();
            }



            board[numInput - 1][numInput2-1] = turn;
            if (turn.equals("B")) {
                turn = "R";
            } else {
                turn = "B";
            }
            printboard();
            DropToken(numInput,numInput2);
        }
    }



    static void populateboard() {
        for (int a = 0; a <7;a++)
            for(int b = 0; b<7;b++){
                board[a][b] = "O";
            }
    }

    static void printboard(){
        for (int a = 0; a <7;a++) {
            for (int b = 0; b < 7; b++) {
                System.out.print(board[a][b]+"   ");
            }
            System.out.println("");
        }
    }


    static void DropToken(int num1, int num2){
        boolean empt = true;
        while(empt == true){
            if (board[num1-1][num2-2] == "O"){

            }else{

            }
        }

    }

    static void CheckWinner(){

    }
}
