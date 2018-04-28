
/**
 *
 * @author IT676
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class MyApp extends JFrame implements ActionListener {

    private final JButton addBtn;
    private final JButton clearBtn;
    private final JLabel firstNumberLbl;
    private final JLabel secondNumberLbl;
    private final JLabel resultLblDispaly;
    private final JTextField firsNumberTextF;
    private final JTextField secondNumberTextF;

    private JPanel panel;

    public MyApp() {

        addBtn = new JButton("Add ");

        clearBtn = new JButton("Reset");

        firstNumberLbl = new JLabel("First Number: ");
        secondNumberLbl = new JLabel("Second Number: ");
        firsNumberTextF = new JTextField(10);
        secondNumberTextF = new JTextField(10);

        resultLblDispaly = new JLabel();

        panel = new JPanel(new GridLayout(4, 2));

        panel.add(firstNumberLbl);
        panel.add(firsNumberTextF);

        panel.add(secondNumberLbl);
        panel.add(secondNumberTextF);

        panel.add(clearBtn);
        panel.add(addBtn);

        panel.add(new JLabel("Result : "));
        panel.add(resultLblDispaly);

        addBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int firstNumber = Integer.parseInt(firsNumberTextF.getText());
                int secondNumber = Integer.parseInt(secondNumberTextF.getText());

                int result = firstNumber + secondNumber;

                resultLblDispaly.setText("" + result);

            }

        });

        clearBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultLblDispaly.setText("");
                firsNumberTextF.setText("");
                secondNumberTextF.setText("");

            }

        });

        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

class MyAppDemo {

    public static void main(String[] args) {

        new MyApp();
    }
}
