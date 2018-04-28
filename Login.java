/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

    private final JButton loginBtn;
    private final JLabel idLbl;
    private final JLabel passwordLbl;
    private final JTextField idField;
    private final JPasswordField passwordField;

    private JPanel firstPanel;
    private JPanel secondPanel;

    private Student[] students;

    public MyApp() {

        students = new Student[4];
        students[0] = new Student(1122L, "1234");
        students[1] = new Student(2222L, "4455");
        students[2] = new Student(3322L, "6688");
        students[3] = new Student(4422L, "9922");

        loginBtn = new JButton("Login");

        loginBtn.addActionListener(this);
        idLbl = new JLabel("Student ID: ");
        passwordLbl = new JLabel("Password ");
        idField = new JTextField(10);
        passwordField = new JPasswordField(10);

        firstPanel = new JPanel(new GridLayout(2, 2));
        secondPanel = new JPanel();

        firstPanel.add(idLbl);
        firstPanel.add(idField);

        firstPanel.add(passwordLbl);
        firstPanel.add(passwordField);

        secondPanel.add(loginBtn);

        this.add(firstPanel, "North");
        this.add(secondPanel, "South");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        long id = Long.parseLong(idField.getText());
        String password = passwordField.getText();

        for (Student std : students) {

            if (std.getId() == id && std.getPassword().equals(password)) {
                System.out.println("Welcome !");
                return;

            }

        }
        System.out.println("Invalid Id or Password !");

    }

}

class Student {

    private long id;
    private String password;

    public Student(long id, String password) {

        this.id = id;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

}

class MyAppDemo {

    public static void main(String[] args) {

        new MyApp();
    }
}
