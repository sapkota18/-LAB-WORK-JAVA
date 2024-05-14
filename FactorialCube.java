import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FactorialCube extends JFrame implements MouseListener {
    private JTextField inputTextField;
    private JLabel outputLabel;
    private JButton resultButton;
    private JLabel inputLabel;

    FactorialCube() {
        this.setTitle("Factorial and Cube Calculator");
        this.setSize(450, 250);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputLabel = new JLabel("Enter A number: ");
        inputLabel.setBounds(20, 50, 200, 30);
        this.add(inputLabel);

        inputTextField = new JTextField();
        inputTextField.setBounds(120, 50, 200, 30);
        this.add(inputTextField);

        resultButton = new JButton("Result");
        resultButton.setBounds(50, 100, 100, 30);
        resultButton.addMouseListener(this);
        this.add(resultButton);

        outputLabel = new JLabel();
        outputLabel.setBounds(50, 150, 400, 30);
        this.add(outputLabel);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Not needed for this implementation
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Calculate cube when mouse pressed
        if (e.getSource() == resultButton) {
            calculateFactorial();
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        // Calculate factorial when mouse released
        if (e.getSource() == resultButton) {
            calculateCube();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Not needed for this implementation
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Not needed for this implementation
    }

    private void calculateFactorial() {
        try {
            int num = Integer.parseInt(inputTextField.getText());
            int factorial = calculateFactorial(num);
            outputLabel.setText("Factorial: " + factorial);
        } catch (NumberFormatException ex) {
            outputLabel.setText("Please enter a valid integer.");
        }
    }

    private void calculateCube() {
        try {
            int num = Integer.parseInt(inputTextField.getText());
            int cube = num * num * num;
            outputLabel.setText("Cube: " + cube);
        } catch (NumberFormatException ex) {
            outputLabel.setText("Please enter a valid integer.");
        }
    }

    private int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        new FactorialCube();
    }
}
