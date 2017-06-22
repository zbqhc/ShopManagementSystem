package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logic.Login;
import javax.swing.JPasswordField;

public class Denglu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	

	/**
	 * Create the application.
	 */
	public Denglu() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblid = new JLabel("\u767B\u5F55\u7528\u6237ID:");
		panel_1.add(lblid, "4, 2, right, default");
		
		textField = new JTextField();
		textField.setText("");
		panel_1.add(textField, "6, 2, left, default");
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5168\u540D:");
		panel_1.add(label_2, "4, 4, right, default");
		
		textField_3 = new JTextField();
		textField_3.setText("");
		panel_1.add(textField_3, "6, 4, left, default");
		textField_3.setColumns(10);
		
		JLabel label = new JLabel("\u5BC6\u7801:");
		panel_1.add(label, "4, 6, right, default");
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel_1.add(passwordField, "6, 6, left, default");
		
		JLabel label_1 = new JLabel("\u90E8\u95E8:");
		panel_1.add(label_1, "4, 8, right, default");
		
		textField_2 = new JTextField();
		textField_2.setText("");
		panel_1.add(textField_2, "6, 8, left, default");
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				int res=-1;
				try {
					res = login.Register(Integer.valueOf(textField.getText()), textField_3.getText(), String.valueOf(passwordField.getPassword()), Integer.valueOf(textField_2.getText()));
				} catch (NumberFormatException e1) {
					// TODO 自动生成的 catch 块
					JOptionPane.showMessageDialog(null, "请检查表单项是否正确", "添加失败",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO 自动生成的 catch 块
					
					e1.printStackTrace();
				}
				if (res==0){
					JOptionPane.showMessageDialog(null, "添加登录用户成功", "成功",
							JOptionPane.INFORMATION_MESSAGE);
					frame.setVisible(false);
				}
			}
		});
		panel_1.add(button, "6, 10, left, default");
	}

}
