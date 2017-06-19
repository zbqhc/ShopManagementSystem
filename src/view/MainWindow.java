package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	public static void main(String[] args) {
		MainWindow tbc = new MainWindow();
	   tbc.setVisible(true);
	}

	private JPanel imagePanel;
	private ImageIcon background;
	
	public MainWindow(){
		background = new ImageIcon("图片\\图片\\主界面背景.jpg");
		JLabel label = new JLabel(background);
		label.setSize(background.getIconWidth(),background.getIconHeight());
        this.setLocation(150,150);  
        
		imagePanel = (JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
//************主界面按键设置
		imagePanel.setLayout(new FlowLayout());  //按钮采用流式布局
			
		JButton buttonGongneng1 = new JButton();
		buttonGongneng1.setText("员工信息");
		imagePanel.add( buttonGongneng1);        
		buttonGongneng1.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String buttonName = e.getActionCommand();
				if(buttonName.equals("员工信息")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("员工信息");
					secondwindow.setLocation(220,220);  //显示位置
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("员工信息添加");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("员工信息删除");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){

						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("员工信息修改");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){

						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("员工信息查看");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){

						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}		
		});
//**********************************		
		JButton buttonGongneng2 = new JButton();
		buttonGongneng2.setText("部门信息");
		imagePanel.add( buttonGongneng2);
		buttonGongneng2.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String buttonName = e.getActionCommand();
				if(buttonName.equals("部门信息")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("部门信息");
					secondwindow.setLocation(225,225);  //显示位置
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("部门信息添加");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("部门信息删除");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("部门信息修改");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("部门信息查看");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}		
		});
//****************************		
		JButton buttonGongneng3 = new JButton();
		buttonGongneng3.setText("商品信息");
		imagePanel.add( buttonGongneng3);
		buttonGongneng3.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String buttonName = e.getActionCommand();
				if(buttonName.equals("商品信息")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("商品信息");
					secondwindow.setLocation(230,230);  //显示位置
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("商品信息添加");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("商品信息删除");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("商品信息修改");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("商品信息查看");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}		
		});
//**************************		
		JButton buttonGongneng4 = new JButton();
		buttonGongneng4.setText("采购信息");
		imagePanel.add( buttonGongneng4);
		buttonGongneng4.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String buttonName = e.getActionCommand();
				if(buttonName.equals("采购信息")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("采购信息");
					secondwindow.setLocation(235,235);  //显示位置
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("采购信息添加");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("采购信息删除");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("采购信息修改");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("采购信息查看");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){

	
						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}		
		});
//***************************		
		JButton buttonGongneng5 = new JButton();
		buttonGongneng5.setText("库存信息");
		imagePanel.add( buttonGongneng5);
		buttonGongneng5.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String buttonName = e.getActionCommand();
				if(buttonName.equals("库存信息")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("库存信息");
					secondwindow.setLocation(240,240);  //显示位置
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("库存信息添加");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){

		
						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("库存信息删除");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("库存信息修改");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){

	
						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("库存信息查看");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){

		
						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}			
		});
//**************************************	
		JButton buttonGongneng6 = new JButton();
		buttonGongneng6.setText("供应商信息");
		imagePanel.add( buttonGongneng6);
		buttonGongneng6.addActionListener(new ActionListener(){

	
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String buttonName = e.getActionCommand();
				if(buttonName.equals("供应商信息")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("供应商信息");
					secondwindow.setLocation(240,240);  //显示位置
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("供应商信息添加");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){

		
						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("供应商信息删除");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("供应商信息修改");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("供应商信息查看");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO 自动生成的方法存根
							System.out.println("调用数据库表格4");
						}					
					});
					
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}			
		});
		
//******************************************************************
		JButton buttonGongneng7 = new JButton();
		buttonGongneng7.setBounds(0, 500, 75, 60);
		buttonGongneng7.setText("退出登录");
		this.add( buttonGongneng7);
		buttonGongneng7.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String buttonName = e.getActionCommand();
				if(buttonName.equals("退出登录")){
					System.out.println("退出退出退出");
				}
			}			
		});
//******************************************************************

		this.setResizable(false);  //窗口大小不可改变
		this.getLayeredPane().setLayout(null); 
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(background.getIconWidth(),background.getIconHeight());
	}
}
