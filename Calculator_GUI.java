import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc implements ActionListener {

    JTextField jt1, jt2, jres_ans;

    // int num1, num2, result;
    void Calculator(int res) {
        // TODO Auto-generated method stub
        JFrame jf = new JFrame();
        // INPUT
        JLabel jn1 = new JLabel("NUMBER 1 : ");
        jn1.setBounds(10, 40, 100, 40);
        jf.add(jn1);

        jt1 = new JTextField();
        jt1.setBounds(100, 40, 71, 40);
        // num1 = jt1;
        jf.add(jt1);

        JLabel jn2 = new JLabel("NUMBER 2 : ");
        jn2.setBounds(10, 90, 100, 40);
        jf.add(jn2);

        jt2 = new JTextField();
        jt2.setBounds(100, 90, 70, 40);
        jf.add(jt2);
        // INPUT

        // OPERATIONS
        JButton jbp = new JButton("+");
        jbp.setBounds(10, 160, 50, 30);
        jf.add(jbp);
        jbp.addActionListener(this);

        JButton jbmi = new JButton("-");
        jbmi.setBounds(75, 160, 50, 30);
        jf.add(jbmi);
        jbmi.addActionListener(this);

        JButton jbm = new JButton("X");
        jbm.setBounds(135, 160, 50, 30);
        jf.add(jbm);
        jbm.addActionListener(this);

        JButton jbd = new JButton("/");
        jbd.setBounds(195, 160, 50, 30);
        jf.add(jbd);
        jbd.addActionListener(this);

        // OPERATIONS

        // RESULT

        JLabel jres = new JLabel("RESULT : ");
        jres.setBounds(190, 65, 80, 30);
        jf.add(jres);

        jres_ans = new JTextField("" + res);
        jres_ans.setBounds(190, 100, 80, 30);
        jf.add(jres_ans);
        // RESULT

        // clear, exit
        JButton jc = new JButton(" CLEAR ");
        jc.setBounds(50, 210, 80, 30);
        jf.add(jc);
        jc.addActionListener(this);

        JButton je = new JButton(" CLOSE ");
        je.setBounds(190, 210, 100, 30);
        jf.add(je);
        je.addActionListener(this);

        jf.setSize(350, 300);
        jf.setLayout(null);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        calc ob = new calc();
        ob.Calculator(0);
    }

    public void actionPerformed(ActionEvent e) {
        int a, b, c;
        if (jt1.getText() == "") {
            JOptionPane.showMessageDialog(null, "INPUT some Values Please...");
        } else {
            a = b = c = 0;
            System.out.println(jt1.getText());
            if (e.getActionCommand().equals("+")) {

                a = Integer.parseInt(jt1.getText());
                b = Integer.parseInt(jt2.getText());
                c = a + b;
                // System.out.println("The sum is : "+c);
                jres_ans.setText(String.valueOf(c));
            }

            else if (e.getActionCommand().equals("-")) {

                a = Integer.parseInt(jt1.getText());
                b = Integer.parseInt(jt2.getText());
                c = a - b;
                // System.out.println("The sum is : "+c);
                jres_ans.setText(String.valueOf(c));
            }

            else if (e.getActionCommand().equals("X")) {

                a = Integer.parseInt(jt1.getText());
                b = Integer.parseInt(jt2.getText());
                c = a * b;
                // System.out.println("The sum is : "+c);
                jres_ans.setText(String.valueOf(c));
            }

            else if (e.getActionCommand().equals("/")) {

                a = Integer.parseInt(jt1.getText());
                b = Integer.parseInt(jt2.getText());

                if (b == 0) {
                    JOptionPane.showMessageDialog(null, "This INPUT is not VALID!!");
                } else {
                    c = a / b;
                    // System.out.println("The sum is : "+c);
                    jres_ans.setText(String.valueOf(c));
                }
            } else if (e.getActionCommand().equals(" CLEAR ")) {
                jt1.setText("");
                jt2.setText("");
                jres_ans.setText("");
            }
        }
    }
}
