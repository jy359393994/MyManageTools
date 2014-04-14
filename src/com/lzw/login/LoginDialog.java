package com.lzw.login;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.lzw.ManageSystem;
import com.lzw.dao.Dao;

public class LoginDialog extends JFrame{
	private JLabel mUserLabel;
	private JLabel mPasswordLabel;
	private JTextField mUserfield;
	private JPasswordField mPasswordField;
	private JButton mLoginButton;
	private JButton mExitButton;
	private ManageSystem mManageSystem;
	public LoginDialog(){
		LoginPanel panel =new LoginPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
		panel.add(getUserLabel());
		panel.add(getUserField());
		panel.add(getPasswordLabel());
		panel.add(getPasswordField());
		panel.add(getLoginButton());
		panel.add(getExitButton());
		
	}
	
	private JLabel getUserLabel(){
		
		if(mUserLabel == null){
			mUserLabel = new JLabel("用户名:");
			mUserLabel.setBounds(55,20,50,22);
		}
		return mUserLabel;
	}
	
	private JLabel getPasswordLabel(){
		if(mPasswordLabel == null){
			mPasswordLabel = new JLabel("密码:");
			mPasswordLabel.setBounds(55,69,50,22);
		}
		return mPasswordLabel;
	}
	
	private JTextField getUserField(){
		if(mUserfield == null){
			mUserfield = new JTextField();
			mUserfield.setBounds(new Rectangle(105, 20, 105, 22));
			
		}
		return mUserfield;
	}
	
	private JPasswordField getPasswordField(){
		if(mPasswordField == null){
			mPasswordField = new JPasswordField();
			mPasswordField.setEchoChar('*');
			mPasswordField.setBounds(new Rectangle(105, 69, 105, 22));
			mPasswordField.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					if(e.getKeyChar() == '\n'){
						mLoginButton.doClick();
					}
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		return mPasswordField;
	}
	
	private JButton getLoginButton(){
		if(mLoginButton == null){
			mLoginButton = new JButton("登录");
			mLoginButton.setBounds(new Rectangle(60, 114, 60, 20));
			mLoginButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String user = mUserfield.getText();
					String password = mPasswordField.getText();
					if(!Dao.CheckLogin(user, password)){
						JOptionPane.showMessageDialog(LoginDialog.this, "用户名和密码无法登录", "登录失败", JOptionPane.ERROR_MESSAGE);
						mUserfield.setText("");
						mPasswordField.setText("");
					}
					else{
						mManageSystem = new ManageSystem();
						mManageSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						mManageSystem.setVisible(true);
						mManageSystem.setBounds(100, 100, 500, 400);
						LoginDialog.this.setVisible(false);
					}
					
				}
			});
		}
		return mLoginButton;
	}
	
	private JButton getExitButton(){
		if(mExitButton == null){
			mExitButton = new JButton("退出");
			mExitButton.setBounds(new Rectangle(140, 114, 60, 20));
			mExitButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
//隐藏窗体	
					LoginDialog.this.dispose();
					System.exit(0);
					
				}
			});
		}
		
		return mExitButton;
	}



}
