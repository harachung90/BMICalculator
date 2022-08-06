
import javax.swing.*;

public class BMICalculator {

    private JTextField heightText;
    private JTextField Weight;
    private JButton Calculate;
    private JLabel heightLabel;
    private JLabel weightLabel;
    private JLabel ResultLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
