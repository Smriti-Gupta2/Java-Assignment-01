import java.awt.*;
import java.awt.event.*;

class StudentForm extends Frame implements ActionListener {
    TextField name, roll, course;
    Button submit;

    StudentForm() {
        setLayout(new FlowLayout());

        add(new Label("Name"));
        name = new TextField(20);
        add(name);

        add(new Label("Roll No"));
        roll = new TextField(20);
        add(roll);

        add(new Label("Course"));
        course = new TextField(20);
        add(course);

        submit = new Button("Submit");
        add(submit);

        submit.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String msg = "Registration Successful\nName: " + name.getText()
                + "\nRoll No: " + roll.getText()
                + "\nCourse: " + course.getText();

        System.out.println(msg);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}