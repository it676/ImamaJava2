
import java.awt.GridLayout;
import java.awt.TextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

/**
 *
 * @author IT676
 */
public class Calculator extends JFrame {
    
    private final JPanel panel;
    
    private final JPanel expressionPanel;
    private final JTextField expressionField;
    
    public Calculator() {
        
        panel = new JPanel(new GridLayout(3, 3));
        
        for (int i = 9; i > 0; i--) {
            
            panel.add(new JButton("" + i));
        }
        
        expressionPanel = new JPanel();
        expressionField = new JTextField(10);
        
        expressionPanel.add(expressionField);
        
        this.add(expressionPanel, "North");
        this.add(panel, "South");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        pack();
        
    }
    
}

class CalcDemo {
    
    public static void main(String[] args) throws ScriptException {
        
        ScriptEngineManager manager = new ScriptEngineManager();
        
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        
        System.out.println(engine.eval("9+8"));
        
        
        
        
       new Calculator();
        
    }
    
}
