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

                double result = weightInput / (heightInput * heightInput);
                resultLabel.setText("Your BMI is: " + String.format("%.2f", result));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new BMICalculator("BMI Calculator");
        frame.setVisible(true);
    }
}
