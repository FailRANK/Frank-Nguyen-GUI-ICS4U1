import javax.swing.JOptionPane;

public class App {
    static GuessNumber Guess = new GuessNumber();
    public static void main(String[] args) throws Exception {
        while (true) {
            //Authenticates
            int answer = JOptionPane.showConfirmDialog(null, "2 + 2 = 4", "Authentication", JOptionPane.YES_NO_OPTION);
            //Correct Response Break Out Of Loop
            if (answer == 0) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            }
            //Wrong Response Don't Break Out Of Loop
            else if (answer == 1)
                JOptionPane.showMessageDialog(null, "Wrong"); 
        }
        //Plays A Guessing Game Whre User Has To Guess A Number Between 1 And 100
        Guess.Guess();
    }
}
