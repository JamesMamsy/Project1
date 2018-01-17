
package Chapter5;

/**
 * Accumulates user votes if they are in favor of something or not from console input
 * Terminates with q
 * @author jm0982431
 */
import java.util.Scanner;
public class P5 {
    
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int yesVotes = 0;
    int noVotes = 0;
    String answer = "";
    
        OUTER:
        while (true) {
            System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            answer = in.next().toLowerCase();
            if (null == answer) {
                System.out.println("INVALID CODE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            } else {
                switch (answer) {
                    case "y":
                        yesVotes += 1;
                        break;
                    case "n":
                        noVotes += 1;
                        break;
                    case "q":
                        break OUTER;
                    default:
                        System.out.println("INVALID CODE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
                        break;
                }
            }
        }
    System.out.println("Votes In Favor: " + yesVotes + "\nVotes Against: " + noVotes);
    
    
    }   
        
 }       


