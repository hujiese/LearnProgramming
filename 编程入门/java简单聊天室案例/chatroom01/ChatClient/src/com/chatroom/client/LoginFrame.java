package com.chatroom.client;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.Inet4Address;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginFrame extends JFrame implements ActionListener, KeyListener {

	private JTextField textUsername; // �û����ı���ǩ
	private JTextField textHostIp; // ������IP�ı���ǩ
	private JTextField textHostPort; // �������˿��ı���ǩ
	private JButton enterButton; // ��¼����
	private JButton exitButton; // �˳�����
	
	public LoginFrame() {
		initUI();
	}
	
	private void initUI() {
		try {
			// ����UI�ķ����Ӧwindows��macos�Ȳ���ϵͳ������֮UI���һ��
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		
		// ����LogoͼƬ�ʹ�����
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/socket.jpg"));
		setTitle("������");
		getContentPane().setLayout(null);
		setSize(296, 249); // ���ô��ڴ�С
		WinCenter.center(this); // ���ô��ھ���
		setResizable(false); // ���ô��ڲ�������
		// ���ô��ڵĹرյ���¼�
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exitButton.doClick();
			}
		});
		
		// ���á��û�������ǩ
		JLabel lblNewLabel = new JLabel("�û���");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 30, 81, 34);
		getContentPane().add(lblNewLabel);
		// �����û��������
		textUsername = new JTextField();
		textUsername.addKeyListener(this);
		textUsername.setBounds(114, 30, 143, 34);
		getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		// ���á���������ַ����ǩ
		JLabel lblNewLabel1 = new JLabel("��������ַ");
		lblNewLabel1.setFont(new Font("����", Font.PLAIN, 14));
		lblNewLabel1.setBounds(23, 74, 81, 34);
		getContentPane().add(lblNewLabel1);
		// ���÷�����IP�����
		textHostIp = new JTextField();
		textHostIp.setBounds(114, 74, 143, 34);
		textHostIp.addKeyListener(this);
		getContentPane().add(textHostIp);
		try {
			// ��ȡ����IP��Ĭ����������Ϊ����IP��ַ
			String ip = (String)Inet4Address.getLocalHost().getHostAddress();
			textHostIp.setText(ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		textHostIp.setColumns(10);
		
		// ���á��˿ںš���ǩ
		JLabel lblNewLabel2 = new JLabel("�˿ں�");
		lblNewLabel2.setFont(new Font("����", Font.PLAIN, 14));
		lblNewLabel2.setBounds(23, 118, 81, 34);
		getContentPane().add(lblNewLabel2);
		// ���ö˿������
		textHostPort = new JTextField();
		textHostPort.addKeyListener(this);
		textHostPort.setBounds(114, 118, 143, 34);
		getContentPane().add(textHostPort);
		textHostPort.setText("5000"); // �˿������Ĭ������Ϊ5000
		textHostPort.setColumns(10);
		
		// ���õ�¼����
		enterButton = new JButton("����������");
		enterButton.addActionListener(this);
		enterButton.addKeyListener(this);
		enterButton.setFont(new Font("����", Font.PLAIN, 14));
		enterButton.setBounds(23, 162, 108, 39);
		getContentPane().add(enterButton);
		
		// �����˳�����
		exitButton = new JButton("�˳�������");
		exitButton.setFont(new Font("����", Font.PLAIN, 14));
		exitButton.setBounds(144, 162, 113, 39);
		exitButton.addActionListener(this);
		getContentPane().add(exitButton);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			enterButton.doClick();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exitButton){
			setVisible(false);
		}
		
		if(e.getSource() == enterButton){
			String username = textUsername.getText().trim();
			String hostIp = textHostIp.getText().trim();
			String hostPort = textHostPort.getText().trim();
			if(!username.equals("")){
				if(!hostIp.equals("")){
					if(!hostPort.equals("")){
						JOptionPane.showMessageDialog(this, "�û�����" + username + 
								" ��������ַ��" + hostIp + "�������˿ڣ�" + hostPort);
					}else{
						JOptionPane.showMessageDialog(this, "���������Ӷ˿ںŲ���Ϊ�գ�");
					}
				}else{
					JOptionPane.showMessageDialog(this, "��������ַ����Ϊ�գ�");
				}
			}else{
				JOptionPane.showMessageDialog(this, "�û�������Ϊ�գ�");
			}
		}
	}

}
