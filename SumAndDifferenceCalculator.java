import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumAndDifferenceCalculator extends JFrame implements ActionListener {
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JButton addButton;
    private JButton subtractButton;

    SumAndDifferenceCalculator() {
        this.setTitle("Sum and Difference Calculator");
        this.setSize(400, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberLabel.setBounds(20, 20, 100, 30);
        this.add(firstNumberLabel);

        firstNumberField = new JTextField();
        firstNumberField.setBounds(130, 20, 100, 30);
        this.add(firstNumberField);

        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberLabel.setBounds(20, 60, 100, 30);
        this.add(secondNumberLabel);

        secondNumberField = new JTextField();
        secondNumberField.setBounds(130, 60, 100, 30);
        this.add(secondNumberField);

        addButton = new JButton("Add");
        addButton.setBounds(20, 100, 100, 30);
        addButton.addActionListener(this);
        this.add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.setBounds(130, 100, 100, 30);
        subtractButton.addActionListener(this);
        this.add(subtractButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double firstNumber, secondNumber, result;
        try {
            firstNumber = Double.parseDouble(firstNumberField.getText());
            secondNumber = Double.parseDouble(secondNumberField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (e.getSource() == addButton) {
            result = firstNumber + secondNumber;
            JOptionPane.showMessageDialog(this,
                    "Sum: " + result,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == subtractButton) {
            result = firstNumber - secondNumber;
            JOptionPane.showMessageDialog(this,
                    "Difference: " + result,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SumAndDifferenceCalculator();
    }
}
