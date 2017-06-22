package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logic.Staff;

public class AddUserbasic {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUserbasic window = new AddUserbasic();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddUserbasic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u6DFB\u52A0\u5458\u5DE5");
		frame.setBounds(100, 100, 282, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		JButton button = new JButton("\u63D0\u4EA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Staff staff = new Staff();
				int sex = -1;
				if (textField_2.getText() == "男") {
					sex = 1;
				} else {
					sex = 0;
				}
				try {
					if (staff.addStaff(Integer.parseInt(textField.getText()),
							textField_1.getText(), sex, textField_3.getText(),
							Integer.parseInt(textField_4.getText()),
							Integer.parseInt(textField_5.getText())) == 0) {
						JOptionPane.showMessageDialog(null, "添加成功", "成功",
								JOptionPane.ERROR_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "请检查表单项是否正确", "添加失败",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (NumberFormatException e1) {
					// TODO 自动生成的 catch 块
					JOptionPane.showMessageDialog(null, "请检查表单项是否正确", "添加失败",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO 自动生成的 catch 块
					JOptionPane.showMessageDialog(null, "请检查表单项是否正确", "添加失败",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		panel.add(button);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.WEST);

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.EAST);

		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, }));

		JLabel label = new JLabel("\u6DFB\u52A0\u65B0\u5458\u5DE5");
		panel_3.add(label, "8, 2");

		JLabel lblid = new JLabel("\u5458\u5DE5ID:");
		panel_3.add(lblid, "6, 4, right, default");

		textField = new JTextField();
		textField.setText("111111");
		panel_3.add(textField, "8, 4, left, default");
		textField.setColumns(10);

		JLabel label_1 = new JLabel("\u59D3\u540D:");
		panel_3.add(label_1, "6, 6, right, default");

		textField_1 = new JTextField();
		textField_1.setText("22222");
		panel_3.add(textField_1, "8, 6, left, default");
		textField_1.setColumns(10);

		JLabel label_2 = new JLabel("\u6027\u522B:");
		panel_3.add(label_2, "6, 8, right, default");

		textField_2 = new JTextField();
		textField_2.setText("333333");
		panel_3.add(textField_2, "8, 8, left, default");
		textField_2.setColumns(10);

		JLabel label_3 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7:");
		panel_3.add(label_3, "6, 10, right, default");

		textField_3 = new JTextField();
		textField_3.setText("444444");
		panel_3.add(textField_3, "8, 10, left, default");
		textField_3.setColumns(10);

		JLabel label_4 = new JLabel("\u90E8\u95E8:");
		panel_3.add(label_4, "6, 12, right, default");

		textField_4 = new JTextField();
		textField_4.setText("555555");
		panel_3.add(textField_4, "8, 12, left, default");
		textField_4.setColumns(10);

		JLabel label_5 = new JLabel("\u804C\u52A1:");
		panel_3.add(label_5, "6, 14, right, default");

		textField_5 = new JTextField();
		textField_5.setText("6666");
		panel_3.add(textField_5, "8, 14, left, default");
		textField_5.setColumns(10);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
