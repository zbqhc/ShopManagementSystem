package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class LoginWindows extends JFrame {

	JPanel pan1, pan2, pan3;
	JButton btn1, btn2;
	JTextField text;
	JPasswordField passwd;
	JLabel lbl1, lbl2;

	public static void main(String[] args) {
		LoginWindows window = new LoginWindows();
	}

	public LoginWindows() {

		btn1 = new JButton("登录");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("已登录");
			}
		});
		btn2 = new JButton("取消");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				System.out.println("已退出");
			}
		});

		text = new JTextField(10);
		passwd = new JPasswordField(10);

		lbl1 = new JLabel("用户名");
		lbl2 = new JLabel("密    码");
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan3 = new JPanel();
		this.setLayout(new GridLayout(3, 1));

		pan1.add(lbl1);
		pan1.add(text);
		pan2.add(lbl2);
		pan2.add(passwd);
		pan3.add(btn1);
		pan3.add(btn2);

		this.add(pan1);
		this.add(pan2);
		this.add(pan3);

		this.setTitle("登录");
		this.setBounds(200, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

}
