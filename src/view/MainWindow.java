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
		background = new ImageIcon("ͼƬ\\ͼƬ\\�����汳��.jpg");
		JLabel label = new JLabel(background);
		label.setSize(background.getIconWidth(),background.getIconHeight());
        this.setLocation(150,150);  
        
		imagePanel = (JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
//************�����水������
		imagePanel.setLayout(new FlowLayout());  //��ť������ʽ����
			
		JButton buttonGongneng1 = new JButton();
		buttonGongneng1.setText("Ա����Ϣ");
		imagePanel.add( buttonGongneng1);        
		buttonGongneng1.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String buttonName = e.getActionCommand();
				if(buttonName.equals("Ա����Ϣ")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("Ա����Ϣ");
					secondwindow.setLocation(220,220);  //��ʾλ��
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("Ա����Ϣ���");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("Ա����Ϣɾ��");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){

						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("Ա����Ϣ�޸�");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){

						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("Ա����Ϣ�鿴");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){

						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}		
		});
//**********************************		
		JButton buttonGongneng2 = new JButton();
		buttonGongneng2.setText("������Ϣ");
		imagePanel.add( buttonGongneng2);
		buttonGongneng2.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String buttonName = e.getActionCommand();
				if(buttonName.equals("������Ϣ")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("������Ϣ");
					secondwindow.setLocation(225,225);  //��ʾλ��
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("������Ϣ���");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("������Ϣɾ��");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("������Ϣ�޸�");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("������Ϣ�鿴");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}		
		});
//****************************		
		JButton buttonGongneng3 = new JButton();
		buttonGongneng3.setText("��Ʒ��Ϣ");
		imagePanel.add( buttonGongneng3);
		buttonGongneng3.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String buttonName = e.getActionCommand();
				if(buttonName.equals("��Ʒ��Ϣ")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("��Ʒ��Ϣ");
					secondwindow.setLocation(230,230);  //��ʾλ��
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("��Ʒ��Ϣ���");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("��Ʒ��Ϣɾ��");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("��Ʒ��Ϣ�޸�");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("��Ʒ��Ϣ�鿴");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}		
		});
//**************************		
		JButton buttonGongneng4 = new JButton();
		buttonGongneng4.setText("�ɹ���Ϣ");
		imagePanel.add( buttonGongneng4);
		buttonGongneng4.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String buttonName = e.getActionCommand();
				if(buttonName.equals("�ɹ���Ϣ")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("�ɹ���Ϣ");
					secondwindow.setLocation(235,235);  //��ʾλ��
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("�ɹ���Ϣ���");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("�ɹ���Ϣɾ��");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("�ɹ���Ϣ�޸�");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("�ɹ���Ϣ�鿴");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){

	
						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}		
		});
//***************************		
		JButton buttonGongneng5 = new JButton();
		buttonGongneng5.setText("�����Ϣ");
		imagePanel.add( buttonGongneng5);
		buttonGongneng5.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String buttonName = e.getActionCommand();
				if(buttonName.equals("�����Ϣ")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("�����Ϣ");
					secondwindow.setLocation(240,240);  //��ʾλ��
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("�����Ϣ���");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){

		
						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("�����Ϣɾ��");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("�����Ϣ�޸�");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){

	
						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("�����Ϣ�鿴");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){

		
						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���4");
						}					
					});
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}			
		});
//**************************************	
		JButton buttonGongneng6 = new JButton();
		buttonGongneng6.setText("��Ӧ����Ϣ");
		imagePanel.add( buttonGongneng6);
		buttonGongneng6.addActionListener(new ActionListener(){

	
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String buttonName = e.getActionCommand();
				if(buttonName.equals("��Ӧ����Ϣ")) {
					JFrame secondwindow = new JFrame();
					secondwindow.setVisible(true);
					secondwindow.setSize(500, 400);
					secondwindow.setTitle("��Ӧ����Ϣ");
					secondwindow.setLocation(240,240);  //��ʾλ��
					setLayout(new FlowLayout());
					JPanel jp1 = new JPanel();
					secondwindow.add(jp1);
					JButton buttonGongneng1 = new JButton();
					buttonGongneng1.setText("��Ӧ����Ϣ���");
					jp1.add( buttonGongneng1);
					buttonGongneng1.addActionListener(new ActionListener(){

		
						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���1");
						}					
					});
					
					JButton buttonGongneng2 = new JButton();
					buttonGongneng2.setText("��Ӧ����Ϣɾ��");
					jp1.add( buttonGongneng2);
					buttonGongneng2.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���2");
						}					
					});
					
					JButton buttonGongneng3 = new JButton();
					buttonGongneng3.setText("��Ӧ����Ϣ�޸�");
					jp1.add( buttonGongneng3);
					buttonGongneng3.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���3");
						}					
					});
					
					JButton buttonGongneng4 = new JButton();
					buttonGongneng4.setText("��Ӧ����Ϣ�鿴");
					jp1.add( buttonGongneng4);
					buttonGongneng4.addActionListener(new ActionListener(){


						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							System.out.println("�������ݿ���4");
						}					
					});
					
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}			
		});
		
//******************************************************************
		JButton buttonGongneng7 = new JButton();
		buttonGongneng7.setBounds(0, 500, 75, 60);
		buttonGongneng7.setText("�˳���¼");
		this.add( buttonGongneng7);
		buttonGongneng7.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String buttonName = e.getActionCommand();
				if(buttonName.equals("�˳���¼")){
					System.out.println("�˳��˳��˳�");
				}
			}			
		});
//******************************************************************

		this.setResizable(false);  //���ڴ�С���ɸı�
		this.getLayeredPane().setLayout(null); 
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(background.getIconWidth(),background.getIconHeight());
	}
}
