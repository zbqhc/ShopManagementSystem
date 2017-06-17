package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class User extends JFrame {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		User user = new User();
		user.setVisible(true);
	}
	public User(){
		super();
		this.setResizable(false);
		this.setTitle("用户管理界面");
		this.setBounds(100, 100, 570, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JPanel topPanel = new JPanel();
		topPanel.setLayout(null);
		this.getContentPane().add(topPanel);
		
		final JButton gongneng1 = new JButton();
		gongneng1.setBounds(0, 0, 185,70 );
		gongneng1.setText("员工信息管理");
		topPanel.add(gongneng1); 
		
		final JButton gongneng2 = new JButton();
		gongneng2.setBounds(190, 0, 185,70 );
		gongneng2.setText("部门信息管理");
		topPanel.add(gongneng2);
		
		final JButton gongneng3 = new JButton();
		gongneng3.setBounds(380, 0, 185,70 );
		gongneng3.setText("商品信息管理");
		topPanel.add(gongneng3);
		
		final JButton gongneng4 = new JButton();
		gongneng4.setBounds(0,75, 185,70 );
		gongneng4.setText("采购信息管理");
		topPanel.add(gongneng4);
		
		final JButton gongneng5 = new JButton();
		gongneng5.setBounds(190,75, 185,70 );
		gongneng5.setText("库存信息管理");
		topPanel.add(gongneng5);
		
		final JButton gongneng6 = new JButton();
		gongneng6.setBounds(380,75, 185,70 );
		gongneng6.setText("供货商信息管理");
		topPanel.add(gongneng6);
		
		final JButton mokuai1 = new JButton();
		mokuai1.setBounds(0, 200, 125, 50);
		mokuai1.setText("信息添加");
		topPanel.add(mokuai1);
		
		final JButton mokuai2 = new JButton();
		mokuai2.setBounds(0, 250, 125, 50);
		mokuai2.setText("信息删除");
		topPanel.add(mokuai2);
		
		final JButton mokuai3 = new JButton();
		mokuai3.setBounds(0, 300, 125, 50);
		mokuai3.setText("信息改正");
		topPanel.add(mokuai3);
		
		final JButton mokuai4 = new JButton();
		mokuai4.setBounds(0, 350, 125, 50);
		mokuai4.setText("信息查找");
		topPanel.add(mokuai4);
		
		final JButton mokuai5 = new JButton();
		mokuai5.setBounds(0, 450, 125, 50);
		mokuai5.setText("返回登录");
		topPanel.add(mokuai5);   //5
	}
          
}
