import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame {

    private JTextField heightText;
    private JTextField weightText;
    private JButton Calculate;
    private JLabel heightLabel;
    private JLabel weightLabel;
    private JLabel resultLabel;
    private JPanel mainPanel;

    public BMICalculator(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double heightInput = (Double.parseDouble((heightText.getText())) / 100);
                double weightInput = (Double.parseDouble((weightText.getText())));

                double result = Math.round((weightInput / (heightInput * heightInput)) * 100.0) / 100.0;
                String range = "";


                if (result < 18.50 ) {
                    range = "Underweight";
                } else if (result > 18.50 && result < 25.00) {
                    range = "Healthy";
                } else if (result > 25.00 && result < 30.00) {
                    range = "Overweight";
                } else {
                    range = "Obese";
                }

                resultLabel.setText("Your BMI is: " + result + "\nYou are " + range + ".");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new BMICalculator("BMI Calculator");
        frame.setVisible(true);
    }
}
