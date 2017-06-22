package view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import logic.Login;
import logic.Staff;

public class LoginWindows extends JFrame {

	JPanel pan1, pan2, pan3;
	JButton btn1, btn2;
	JTextField text;
	JPasswordField passwd;
	JLabel lbl1, lbl2;

	public static void setUIFont() {
		Font f = new Font("微软雅黑", Font.PLAIN, 14);
		String names[] = { "Label", "CheckBox", "PopupMenu", "MenuItem",
				"CheckBoxMenuItem", "JRadioButtonMenuItem", "ComboBox",
				"Button", "Tree", "ScrollPane", "TabbedPane", "EditorPane",
				"TitledBorder", "Menu", "TextArea", "OptionPane", "MenuBar",
				"ToolBar", "ToggleButton", "ToolTip", "ProgressBar",
				"TableHeader", "Panel", "List", "ColorChooser",
				"PasswordField", "TextField", "Table", "Label", "Viewport",
				"RadioButtonMenuItem", "RadioButton", "DesktopPane",
				"InternalFrame" };
		for (String item : names) {
			UIManager.put(item + ".font", f);
		}
	}

	public static void main(String[] args) {
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.put("RootPane.setupButtonVisible", false);
		} catch (Exception e) {
			// TODO exception
		}
		setUIFont();
		LoginWindows window = new LoginWindows();
	}

	public LoginWindows() {
		setLayout(new GridBagLayout());
		btn1 = new JButton("登录");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("已登录");
				Login login = new Login();
				try {
					if (text.getText().equals("")
							|| String.valueOf(passwd.getPassword()).equals("")) {
						JOptionPane.showMessageDialog(null, "请填写帐户名与密码", "错误",
								JOptionPane.ERROR_MESSAGE);
					} else {
						String sessionid = login.contrastLogin(
								Integer.valueOf(text.getText()),
								String.valueOf(passwd.getPassword()));
						System.out.println(sessionid);
						if (sessionid == null) {
							JOptionPane.showMessageDialog(null, "账户名与密码不匹配",
									"登录失败", JOptionPane.ERROR_MESSAGE);
						} else {
							 
							new Test(sessionid,login.Jurisdiction(sessionid));
							setVisible(false);
						}
					}
				} catch (NumberFormatException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

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

		lbl1 = new JLabel("用户名 :");

		lbl2 = new JLabel("密    码 :");
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
		this.setBounds(500, 400, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}
