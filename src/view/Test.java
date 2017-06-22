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
		try {// ��ʾ��۷��
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		JFrame frame = new JFrame("�ỰID:" + sessionid);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JTabbedPane tp = new JTabbedPane();// ����һ��ѡ���������֮��ӵ�����������
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
		// ���ѡ�������������������ÿ��ѡ��ı�ǩ�Լ����Ƿ������
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
		tp.setTitleAt(0, "��ҳ");

		

		JTableDefineTest jTableDefineTest = new JTableDefineTest();
		JScrollPane scrollPane = jTableDefineTest.testQueryAllStaff();
		System.out.println(map.get("���¹���"));
		int counter=0;
		if (map.get("���¹���")){
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

			JButton btnNewButton = new JButton("����û�");
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
		tp.setTitleAt(counter, "���¹���");
		}

		if (map.get("���۹���")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel3", panel3);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "���۹���");
		}

		if (map.get("�ɹ�����")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel4", panel4);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "�ɹ�����");
		}

		if (map.get("������")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel5", panel5);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "������");
		}

		if (map.get("�˻�����")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel6", panel6);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "�˻�����");
		}

		if (map.get("�˱�����")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel7", panel7);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "�˵�����");
		}

		if (map.get("��Ӧ�̹���")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel8", panel8);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "��Ӧ�̹���");
		}

		if (map.get("�û�����")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel9", panel9);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "�û�����");
		}

		if (map.get("Ȩ�޹���")){
			counter++;
			System.out.println(counter);
		tp.addTab("panel10", panel10);
		tp.setEnabledAt(counter, true);
		tp.setTitleAt(counter, "Ȩ�޹���");
		}
		
		//
		// tp.addTab("panel11", panel11);
		// tp.setEnabledAt(10, true);
		// tp.setTitleAt(10, "�˳���¼");

		// �������С�Լ���ѡ��Ĵ�С�ͷ���
		tp.setPreferredSize(new Dimension(500, 200));
		tp.setTabPlacement(JTabbedPane.LEFT);
		// ����ѡ��������ڵ���ʾ��ʽ
		tp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		frame.pack();
		JLabel l3 = new JLabel("�ʽ�");
		JLabel l4 = new JLabel("1500");
		JLabel l5 = new JLabel("����");
		JLabel l6 = new JLabel("500");
		JLabel l7 = new JLabel("�籣");
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