import java.util.*;
public class RPSLS {
    public static void main(String[] args) {
        String[] moves = {"rock","paper","scissors","lizard","spock"};
        int[][] beats = {{2,3},{0,4},{1,3},{1,4},{0,2}};
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Choose rock, paper, scissors, lizard, or spock: ");
        String user = in.nextLine().trim().toLowerCase();
        int u = Arrays.asList(moves).indexOf(user);
        if (u < 0) { System.out.println("Invalid move"); return; }
        int c = random.nextInt(5);
        if (u == c) System.out.println("Draw: " + moves[c]);
        else {
            boolean win = beats[u][0] == c || beats[u][1] == c;
            System.out.println("Computer chose " + moves[c] + ". " + (win ? "You win!" : "Computer wins."));
        }
    }
}
