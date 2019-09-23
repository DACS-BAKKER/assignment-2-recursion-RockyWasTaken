import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class SummingDigits {

    public static void main(String[] args){
        StdOut.print("Enter a number: ");
        int i = StdIn.readInt();
        StdOut.print("\n");
        StdOut.print("The sum of the digits is ");
        StdOut.println(addNumbers(i));
    }

    public static int addNumbers(int number){
        if(number % 10 == number){
            return number;
        }
        else{
            return number % 10 + addNumbers((number - (number % 10))/10);
        }
    }
}
