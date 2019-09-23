import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class CoinGame {

    private static int winsFirstPlayer = 0;
    private static int winsSecondPlayer = 0;

    public static void main(String[] args){
        //User interface
        StdOut.print("Enter number of coins: ");
        int coins = StdIn.readInt();
        StdOut.print("\n" + "Choose player to go first (Alice/Bob): ");
        String first = StdIn.readString();

        //Calculate winner and win variations
        pickCoin(coins, 1);
        if(winsFirstPlayer > winsSecondPlayer){
            if(first.toLowerCase().equals("alice")){
                StdOut.print("\n" +  "Alice wins with " + winsFirstPlayer + " different strategies");
            }
            else{
                StdOut.print("\n" +  "Bob wins with " + winsFirstPlayer + " different strategies");
            }
        }
        else{
            if(first.toLowerCase().equals("alice")){
                StdOut.print("\n" +  "Bob wins with " + winsSecondPlayer + " different strategies");
            }
            else{
                StdOut.print("\n" +  "Alice wins with " + winsSecondPlayer + " different strategies");
            }
        }
    }

    public static void pickCoin(int totalCoins, int currentPlayer){
        if(totalCoins == 1){
            if(currentPlayer == 1){
                winsFirstPlayer++;
            }
            else if(currentPlayer == 2){
                winsSecondPlayer++;
            }
        }
        else if(totalCoins == 2){
            if(currentPlayer == 1){
                winsFirstPlayer++;
            }
            else if(currentPlayer == 2){
                winsSecondPlayer++;
            }
        }
        else if(totalCoins == 4){
            if(currentPlayer == 1){
                winsFirstPlayer++;
            }
            else if(currentPlayer == 2){
                winsSecondPlayer++;
            }
        }
        else{
            if(currentPlayer == 1){
                pickCoin(totalCoins - 1, 2);
                pickCoin(totalCoins - 2, 2);
                if(totalCoins - 4 > 0){
                    pickCoin(totalCoins - 4, 2);
                }

            }
            else if(currentPlayer == 2){
                pickCoin(totalCoins - 1, 1);
                pickCoin(totalCoins - 2, 1);
                if(totalCoins - 4 > 0){
                    pickCoin(totalCoins - 4, 1);
                }
            }
        }
    }
}
