package view;

import javax.swing.*;

import dao.*;

import javax.swing.border.EmptyBorder;

import java.awt.*;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.Set;

import logic.*;
import net.miginfocom.swing.MigLayout;

public class Test {
	private static JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public Test(String sessionid, Map<String, Boolean> map) throws Exception {
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.put("RootPane.setupButtonVisible", false);
		} catch (Exception e) {
			// TODO exception
		}
		try {// 显示外观风格
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		final JFrame frame = new JFrame("会话ID:" + sessionid);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JTabbedPane tp = new JTabbedPane();// 创建一个选项卡容器，将之添加到顶层容器内
		frame.setContentPane(tp);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		final JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		JPanel panel11 = new JPanel();
		// JPanel panel5 = new JPanel();
		// JPanel panel5 = new JPanel();
		// 添加选项卡容器，并且设置其中每个选项卡的标签以及其是否可启用
		tp.addTab("panel1", panel1);
		// tp.setIconAt(0, new ImageIcon("D:\\1.ico"));
		tp.setToolTipTextAt(0, "111");
		// tp.setForegroundAt(0, Color.BLUE);
		UIManager.put("TabbedPane.selected", Color.BLUE);
		panel1.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel1.add(panel, BorderLayout.CENTER);

		// JButton btnNewButton_6 = new JButton("New button");
		// btnNewButton_6.setIcon(new ImageIcon("图片/图片/"));
		// panel.add(btnNewButton_6);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon((Icon) new ImageIcon("图片/图片/主界面背景.jpg"));
		panel.add(lblNewLabel_1);

		JPanel panel_2 = new JPanel();
		panel1.add(panel_2, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("欢迎您, "
				+ new UserInfoDAOImpl().queryById(
						new SessionInfoDAOImpl().queryBySSID(sessionid))
						.getAccount());
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 21));

		JButton button_2 = new JButton("\u9000\u51FA");
		panel_2.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LoginWindows.main(new String[1]);
			}
		});
		tp.setEnabledAt(0, true);
		tp.setTitleAt(0, "首页");

		final JTableDefineTest jTableDefineTest = new JTableDefineTest();

		System.out.println(map.get("人事管理"));
		int counter = 0;
		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (map.get("人事管理")) {
			counter++;
			System.out.println("@@@@@@@@@@@@@@@@@@@");
			final JPanel panel_7 = new JPanel();
			tp.addTab("panel2", panel2);
			panel2.setLayout(new BorderLayout(0, 0));

			JPanel panel_1 = new JPanel();
			panel2.add(panel_1, BorderLayout.EAST);
			panel_1.setLayout(new FormLayout(new ColumnSpec[] {
					FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
					ColumnSpec.decode("93px"), }, new RowSpec[] {
					FormFactory.NARROW_LINE_GAP_ROWSPEC,
					RowSpec.decode("23px"), FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC, }));

			JButton btnNewButton = new JButton("添加用户");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new AddUserbasic();
					System.out.println("点击");

				}
			});
			panel_1.add(btnNewButton, "2, 4, fill, top");

			JButton btnNewButton_1 = new JButton("\u4FEE\u6539\u7528\u6237");
			panel_1.add(btnNewButton_1, "2, 6");

			JButton btnNewButton_2 = new JButton("\u5220\u9664\u7528\u6237");
			panel_1.add(btnNewButton_2, "2, 8");

			JButton button = new JButton("刷新");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_7.removeAll();
					try {
						panel_7.add(jTableDefineTest.testQueryAllStaff());
					} catch (Exception e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					panel_7.repaint();
					panel_7.repaint();
					panel_7.setVisible(true);

				}
			});
			panel_1.add(button, "2, 10");

			JPanel panel_3 = new JPanel();
			panel2.add(panel_3, BorderLayout.CENTER);
			panel_3.setLayout(new BorderLayout(0, 0));

			JPanel panel_4 = new JPanel();
			panel_3.add(panel_4, BorderLayout.SOUTH);
			panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

			JButton btnNewButton_3 = new JButton("\u4E0A\u4E00\u9875");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			panel_4.add(btnNewButton_3);

			textField = new JTextField();
			panel_4.add(textField);
			textField.setColumns(10);

			JLabel label = new JLabel("/");
			panel_4.add(label);

			JButton btnNewButton_4 = new JButton("\u4E0B\u4E00\u9875");
			panel_4.add(btnNewButton_4);

			panel_3.add(panel_7, BorderLayout.CENTER);
			panel_7.add(jTableDefineTest.testQueryAllStaff());
			tp.setEnabledAt(counter, true);
			tp.setTitleAt(counter, "人事管理");
		}

		// if (map.get("销售管理")){
		counter++;
		System.out.println(counter);
		tp.addTab("panel3", panel3);
		panel3.setLayout(new BorderLayout(0, 0));

		JPanel panel_8 = new JPanel();
		panel3.add(panel_8, BorderLayout.NORTH);

		JLabel label_1 = new JLabel("\u67E5\u8BE2\u65E5\u671F :");
		panel_8.add(label_1);

		textField_2 = new JTextField();
		panel_8.add(textField_2);
		textField_2.setColumns(10);

		JButton button_3 = new JButton("\u67E5\u8BE2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JScrollPane scrollPane_2 = null;
				try {
					scrollPane_2 = jTableDefineTest
							.testQueryDateCommodity(textField_2.getText());
				} catch (Exception e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				JPanel panel_9 = new JPanel();
				panel_9.add(scrollPane_2);
				panel3.add(panel_9, BorderLayout.CENTER);
			}
		});
		panel_8.add(button_3);

		JButton button_4 = new JButton("\u6DFB\u52A0");
		panel_8.add(button_4);

		JButton button_5 = new JButton("\u5220\u9664");
		panel_8.add(button_5);

		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "销售管理");

		// }

		if (map.get("采购管理")) {
			counter++;
			System.out.println(counter);
			tp.addTab("panel4", panel4);
			tp.setEnabledAt(counter, true);
			tp.setTitleAt(counter, "采购管理");
			JPanel contentPane = panel3;
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			// setContentPane(contentPane);
			contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

			JPanel panel111 = new JPanel();
			contentPane.add(panel111);
			panel111.setLayout(new BorderLayout(0, 0));

			JPanel panel_1 = new JPanel();
			panel4.add(panel_1, BorderLayout.SOUTH);

			JButton button = new JButton("\u552E\u51FA");
			panel_1.add(button);

			JButton button_1 = new JButton("\u9000\u8D27");
			panel_1.add(button_1);

			JTableDefineTest jTableDefineTest1 = new JTableDefineTest();
			JScrollPane scrollPane1 = jTableDefineTest1.testQueryAllCommodity();
			panel4.add(scrollPane1, BorderLayout.CENTER);

		}

		// if (map.get("库存管理")){
		counter++;
		System.out.println(counter);
		tp.addTab("panel5", panel5);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "库存管理");
		// }

		if (map.get("退货管理")) {
			counter++;
			System.out.println(counter);
			tp.addTab("panel6", panel6);

			JScrollPane scrollPane_2 = jTableDefineTest
					.testQueryTypeCommodity("退货");
			panel6.add(scrollPane_2);
			tp.setEnabledAt(counter, true);
			tp.setTitleAt(counter, "退货管理");
		}

		if (map.get("账本管理")) {
			counter++;
			System.out.println(counter);
			tp.addTab("panel7", panel7);
			tp.setEnabledAt(counter, true);
			tp.setTitleAt(counter, "账单管理");

			panel7.add(new JTableDefineTest().testQueryAllCommodity());

		}

		if (map.get("供应商管理")) {
			counter++;
			System.out.println(counter);
			tp.addTab("panel8", panel8);
			panel8.setLayout(new BorderLayout(0, 0));

			JPanel panel_6 = new JPanel();
			panel8.add(panel_6, BorderLayout.EAST);
			panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));

			JButton btnNewButton_5 = new JButton(
					"\u6DFB\u52A0\u4F9B\u5E94\u5546");
			panel_6.add(btnNewButton_5);

			JPanel panel_7 = new JPanel();
			panel8.add(panel_7, BorderLayout.CENTER);

			JScrollPane scrollPane_1 = jTableDefineTest.testQueryAllSupplier();
			panel_7.add(scrollPane_1);
			tp.setEnabledAt(counter, true);
			tp.setTitleAt(counter, "供应商管理");
		}

		if (map.get("用户管理")) {
			counter++;
			System.out.println(counter);
			tp.addTab("panel9", panel9);
			panel9.setLayout(new BorderLayout(0, 0));

			JPanel panel_4 = new JPanel();
			panel9.add(panel_4, BorderLayout.NORTH);

			JPanel panel_5 = new JPanel();
			panel9.add(panel_5, BorderLayout.EAST);

			JButton button_1 = new JButton(
					"\u6DFB\u52A0\u767B\u5F55\u7528\u6237");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Denglu();
				}
			});
			panel_5.add(button_1);

			JScrollPane scrollPane = new JScrollPane(
					jTableDefineTest.testQueryAllDetailStaff());
			panel9.add(scrollPane, BorderLayout.CENTER);
			tp.setEnabledAt(counter, true);
			tp.setTitleAt(counter, "用户管理");

		}

		if (map.get("权限管理")) {
			counter++;
			System.out.println(counter);
			tp.addTab("panel10", panel10);
			panel10.setLayout(new BorderLayout(0, 0));

			JPanel panel_1 = new JPanel();
			panel10.add(panel_1, BorderLayout.NORTH);

			JLabel label = new JLabel("\u90E8\u95E8\u7F16\u53F7:");
			panel_1.add(label);

			textField_1 = new JTextField();
			panel_1.add(textField_1);
			textField_1.setColumns(10);

			JPanel panel_3 = new JPanel();
			panel10.add(panel_3, BorderLayout.CENTER);
			panel_3.setLayout(new FormLayout(new ColumnSpec[] {
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("default:grow"), }, new RowSpec[] {
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC, }));

			JCheckBox chckbxNewCheckBox = new JCheckBox(
					"\u4EBA\u4E8B\u7BA1\u7406");
			panel_3.add(chckbxNewCheckBox, "2, 2");

			JCheckBox chckbxNewCheckBox_5 = new JCheckBox(
					"\u8D22\u52A1\u7BA1\u7406");
			panel_3.add(chckbxNewCheckBox_5, "8, 2");

			JCheckBox chckbxNewCheckBox_1 = new JCheckBox(
					"\u9500\u552E\u7BA1\u7406");
			panel_3.add(chckbxNewCheckBox_1, "2, 4");

			JCheckBox chckbxNewCheckBox_6 = new JCheckBox(
					"\u4F9B\u5E94\u5546\u7BA1\u7406");
			panel_3.add(chckbxNewCheckBox_6, "8, 4");

			JCheckBox chckbxNewCheckBox_2 = new JCheckBox(
					"\u9000\u8D27\u7BA1\u7406");
			panel_3.add(chckbxNewCheckBox_2, "2, 6");

			JCheckBox chckbxNewCheckBox_7 = new JCheckBox(
					"\u7528\u6237\u7BA1\u7406");
			panel_3.add(chckbxNewCheckBox_7, "8, 6");

			JCheckBox chckbxNewCheckBox_3 = new JCheckBox(
					"\u91C7\u8D2D\u7BA1\u7406");
			panel_3.add(chckbxNewCheckBox_3, "2, 8");

			JCheckBox chckbxNewCheckBox_8 = new JCheckBox(
					"\u7528\u6237\u6743\u9650\u7BA1\u7406");
			panel_3.add(chckbxNewCheckBox_8, "8, 8");

			JCheckBox chckbxNewCheckBox_4 = new JCheckBox(
					"\u5E93\u5B58\u7BA1\u7406");
			panel_3.add(chckbxNewCheckBox_4, "2, 10");

			JButton button = new JButton("\u786E\u5B9A");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("点击");
					JOptionPane.showMessageDialog(null, "权限配置成功", "成功",
							JOptionPane.INFORMATION_MESSAGE);

				}
			});
			panel_3.add(button, "8, 10, left, default");
			tp.setEnabledAt(counter, true);
			tp.setTitleAt(counter, "权限管理");
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//
		// tp.addTab("panel11", panel11);
		// tp.setEnabledAt(10, true);
		// tp.setTitleAt(10, "退出登录");

		// 设置其大小以及其选项卡的大小和方向
		tp.setPreferredSize(new Dimension(500, 200));
		tp.setTabPlacement(JTabbedPane.LEFT);
		// 设置选项卡在容器内的显示形式
		tp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		frame.pack();
		JLabel l5 = new JLabel("");
		JLabel l6 = new JLabel("");
		JLabel l7 = new JLabel("");
		JLabel l8 = new JLabel("");
		panel4.setLayout(new FlowLayout());
		panel5.setLayout(new FlowLayout());
		panel4.add(l5);
		panel4.add(l6);

		JScrollPane scrollPane = jTableDefineTest.testQueryAllStock();
		panel5.add(scrollPane);
		panel5.add(l7);

		JButton btnNewButton_6 = new JButton("\u6DFB\u52A0");
		panel5.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("\u5220\u9664");
		panel5.add(btnNewButton_7);

		JButton button = new JButton("\u4FEE\u6539");
		panel5.add(button);
		panel5.add(l8);
		frame.pack();
		frame.setBounds(200, 200, 901, 600);
	}

}