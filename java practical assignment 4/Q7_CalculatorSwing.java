import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    JTextField n1, n2, result;
    JButton add, sub, mul, div;

    Calculator() {
        setLayout(new FlowLayout());

        n1 = new JTextField(10);
        n2 = new JTextField(10);
        result = new JTextField(10);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        add(n1);
        add(n2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(n1.getText());
        double b = Double.parseDouble(n2.getText());
        double ans = 0;

        if (e.getSource() == add)
            ans = a + b;
        else if (e.getSource() == sub)
            ans = a - b;
        else if (e.getSource() == mul)
            ans = a * b;
        else if (e.getSource() == div)
            ans = a / b;

        result.setText("" + ans);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}