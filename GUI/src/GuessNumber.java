import javax.swing.JOptionPane;

public class GuessNumber {
    public void Guess() {
        //Gets A Random Number Between 1 And 100 As A Double
        double Random = ((Math.random() * 99) + 1);
        //Converts Random Into A Whole Number
        long Number = Math.round(Random);
        //Tells Terminal What The Answer Is
        System.out.println(Number);
        //Starts The Game
        while (true) {
            //User Inputs Guess
            int Answer = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100"));
            //If Guess Equals Number User Wins Break Out Of Loop
            if (Answer == Number) {
                JOptionPane.showMessageDialog(null, "You Guessed It!");
                break;
            }
            //If Guess Less Than Number Tell User Guess Higher
            else if (Answer < Number)
                JOptionPane.showMessageDialog(null, "Higher");
            //If Guess Greater Than Number Tell User Guess Lower
            else if (Answer > Number)
                JOptionPane.showMessageDialog(null, "Lower");
        }
    }
}
