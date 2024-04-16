import javax.swing.JOptionPane;

public class App {
    static GuessNumber Guess = new GuessNumber();
    public static void main(String[] args) throws Exception {
        while (true) {
            //Creates Random Equation
            double Number1 = (Math.random() * 10);
            long IntNumber1 = Math.round(Number1);
            double Number2 = (Math.random() * 10);
            long IntNumber2 = Math.round(Number2);
            long Solution = IntNumber1 + IntNumber2;
            long FakeSolution = IntNumber1 + IntNumber2 + 1;
            double Random = Math.random();
            int answer;
            //Decides If To Give A Correct Or Wrong Equation For Authentication
            if (Random >= 0.5) {
                //User Chooses Yes Or No
                answer = JOptionPane.showConfirmDialog(null, IntNumber1 + " + " + IntNumber2 + " = " + Solution, "Authentication", JOptionPane.YES_NO_OPTION);
                //Correct Response Break Out Of Loop
                if (answer == 0) {
                    JOptionPane.showMessageDialog(null, "Correct!");
                    break;
                }
                //Wrong Response Don't Break Out Of Loop
                else if (answer == 1)
                    JOptionPane.showMessageDialog(null, "Wrong"); 
            }   
            else {
                //User Chooses Yes Or No
                answer = JOptionPane.showConfirmDialog(null, IntNumber1 + " + " + IntNumber2 + " = " + FakeSolution, "Authentication", JOptionPane.YES_NO_OPTION);
                //Wrong Response Don't Break Out Of Loop
                if (answer == 0)
                    JOptionPane.showMessageDialog(null, "Wrong");
                //Correct Response Break Out Of Loop
                else if (answer == 1) {
                    JOptionPane.showMessageDialog(null, "Correct!"); 
                    break;
                }
            }  
        }
        //Plays A Guessing Game Whre User Has To Guess A Number Between 1 And 100}
        Guess.Guess();
    }
}
