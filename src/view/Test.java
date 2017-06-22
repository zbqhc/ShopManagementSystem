package view;

import javax.swing.*;

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
		JFrame frame = new JFrame("会话ID:" + sessionid);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JTabbedPane tp = new JTabbedPane();// 创建一个选项卡容器，将之添加到顶层容器内
		frame.setContentPane(tp);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
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
//		tp.setIconAt(0, new ImageIcon("D:\\1.ico"));
		tp.setToolTipTextAt(0, "111");
		// tp.setForegroundAt(0, Color.BLUE);
		UIManager.put("TabbedPane.selected", Color.BLUE);
		panel1.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel1.add(panel, BorderLayout.CENTER);
		tp.setEnabledAt(0, true);
		tp.setTitleAt(0, "首页");

		

		JTableDefineTest jTableDefineTest = new JTableDefineTest();
		JScrollPane scrollPane = jTableDefineTest.testQueryAllStaff();
		System.out.println(map.get("人事管理"));
		int counter=0;
		if (map.get("人事管理")){
			counter++;
			System.out.println("@@@@@@@@@@@@@@@@@@@");
			tp.addTab("panel2", panel2);
			panel2.setLayout(new BorderLayout(0, 0));

			JPanel panel_1 = new JPanel();
			panel2.add(panel_1, BorderLayout.EAST);
			panel_1.setLayout(new FormLayout(new ColumnSpec[] {
					FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
					ColumnSpec.decode("93px"), }, new RowSpec[] {
					FormFactory.NARROW_LINE_GAP_ROWSPEC, RowSpec.decode("23px"),
					FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
					FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, }));

			JButton btnNewButton = new JButton("添加用户");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new AddUserbasic();
					Staff staff = new Staff();

				}
			});
			panel_1.add(btnNewButton, "2, 4, fill, top");

			JButton btnNewButton_1 = new JButton("\u4FEE\u6539\u7528\u6237");
			panel_1.add(btnNewButton_1, "2, 6");

			JButton btnNewButton_2 = new JButton("\u5220\u9664\u7528\u6237");
			panel_1.add(btnNewButton_2, "2, 8");

			JButton button = new JButton("\u8BE6\u7EC6\u4FE1\u606F");
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

			JPanel panel_7 = new JPanel();
			panel_3.add(panel_7, BorderLayout.CENTER);
		panel_7.add(scrollPane);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "人事管理");
		}

		if (map.get("销售管理")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel3", panel3);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "销售管理");
		}

		if (map.get("采购管理")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel4", panel4);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "采购管理");
		}

		if (map.get("库存管理")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel5", panel5);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "库存管理");
		}

		if (map.get("退货管理")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel6", panel6);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "退货管理");
		}

		if (map.get("账本管理")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel7", panel7);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "账单管理");
		}

		if (map.get("供应商管理")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel8", panel8);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "供应商管理");
		}

		if (map.get("用户管理")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel9", panel9);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "用户管理");
		}

		if (map.get("权限管理")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel10", panel10);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "权限管理");
		}
		
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
		JLabel l3 = new JLabel("资金");
		JLabel l4 = new JLabel("1500");
		JLabel l5 = new JLabel("津贴");
		JLabel l6 = new JLabel("500");
		JLabel l7 = new JLabel("社保");
		JLabel l8 = new JLabel("200");
		panel3.setLayout(new FlowLayout());
		panel4.setLayout(new FlowLayout());
		panel5.setLayout(new FlowLayout());
		panel3.add(l3);
		panel3.add(l4);
		panel4.add(l5);
		panel4.add(l6);
		panel5.add(l7);
		panel5.add(l8);
		frame.pack();
		frame.setBounds(200, 200, 901, 550);
	}

}