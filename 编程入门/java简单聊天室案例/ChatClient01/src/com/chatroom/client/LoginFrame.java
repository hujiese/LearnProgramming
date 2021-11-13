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

	private JTextField textUsername; // 用户名文本标签
	private JTextField textHostIp; // 服务器IP文本标签
	private JTextField textHostPort; // 服务器端口文本标签
	private JButton enterButton; // 登录按键
	private JButton exitButton; // 退出按键
	
	public LoginFrame() {
		initUI();
	}
	
	private void initUI() {
		try {
			// 设置UI的风格，适应windows、macos等操作系统，并与之UI风格一致
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
		
		// 设置Logo图片和窗口名
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/socket.jpg"));
		setTitle("聊天室");
		getContentPane().setLayout(null);
		setSize(296, 249); // 设置窗口大小
		WinCenter.center(this); // 设置窗口居中
		setResizable(false); // 设置窗口不可拉伸
		// 设置窗口的关闭点击事件
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exitButton.doClick();
			}
		});
		
		// 设置“用户名”标签
		JLabel lblNewLabel = new JLabel("用户名");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 30, 81, 34);
		getContentPane().add(lblNewLabel);
		// 设置用户名输入框
		textUsername = new JTextField();
		textUsername.addKeyListener(this);
		textUsername.setBounds(114, 30, 143, 34);
		getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		// 设置“服务器地址”标签
		JLabel lblNewLabel1 = new JLabel("服务器地址");
		lblNewLabel1.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel1.setBounds(23, 74, 81, 34);
		getContentPane().add(lblNewLabel1);
		// 设置服务器IP输入框
		textHostIp = new JTextField();
		textHostIp.setBounds(114, 74, 143, 34);
		textHostIp.addKeyListener(this);
		getContentPane().add(textHostIp);
		try {
			// 获取本机IP，默认输入内容为本机IP地址
			String ip = (String)Inet4Address.getLocalHost().getHostAddress();
			textHostIp.setText(ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		textHostIp.setColumns(10);
		
		// 设置“端口号”标签
		JLabel lblNewLabel2 = new JLabel("端口号");
		lblNewLabel2.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel2.setBounds(23, 118, 81, 34);
		getContentPane().add(lblNewLabel2);
		// 设置端口输入框
		textHostPort = new JTextField();
		textHostPort.addKeyListener(this);
		textHostPort.setBounds(114, 118, 143, 34);
		getContentPane().add(textHostPort);
		textHostPort.setText("5000"); // 端口输入框默认内容为5000
		textHostPort.setColumns(10);
		
		// 设置登录按键
		enterButton = new JButton("进入聊天室");
		enterButton.addActionListener(this);
		enterButton.addKeyListener(this);
		enterButton.setFont(new Font("宋体", Font.PLAIN, 14));
		enterButton.setBounds(23, 162, 108, 39);
		getContentPane().add(enterButton);
		
		// 设置退出按键
		exitButton = new JButton("退出聊天室");
		exitButton.setFont(new Font("宋体", Font.PLAIN, 14));
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
						JOptionPane.showMessageDialog(this, "用户名：" + username + 
								" 服务器地址：" + hostIp + "服务器端口：" + hostPort);
					}else{
						JOptionPane.showMessageDialog(this, "服务器连接端口号不能为空！");
					}
				}else{
					JOptionPane.showMessageDialog(this, "服务器地址不能为空！");
				}
			}else{
				JOptionPane.showMessageDialog(this, "用户名不能为空！");
			}
		}
	}

}
