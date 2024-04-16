import javax.swing.JOptionPane;

public class RandomizeAuthenicastino {
    public static void main(String[] args) {
        double Number1 = (Math.random() * 10);
        long IntNumber1 = Math.round(Number1);
        double Number2 = (Math.random() * 10);
        long IntNumber2 = Math.round(Number2);
        long Solution = IntNumber1 + IntNumber2;
        long FakeSolution = IntNumber1 + IntNumber2 + 1;
        double Random = Math.random();
        int answer;
        if (Random >= 0.5) {
            answer = JOptionPane.showConfirmDialog(null, IntNumber1 + " + " + IntNumber2 + " = " + Solution, "Authentication", JOptionPane.YES_NO_OPTION);
        }
        else {
            answer = JOptionPane.showConfirmDialog(null, IntNumber1 + " + " + IntNumber2 + " = " + FakeSolution, "Authentication", JOptionPane.YES_NO_OPTION);
        }
    }
}
