package com.lzw;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import com.lzw.login.LoginDialog;

public class ManageSystem extends JFrame{

	private MenuBar mMenuBar;
	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginDialog mlogindialog = new LoginDialog();
		mlogindialog.setTitle("系统登录");
		mlogindialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mlogindialog.setVisible(true);
		mlogindialog.setBounds(300, 300, 285, 200);
	}
	
	public ManageSystem(){
		setTitle("企业进销存管理系统");
		
		init();
	}
	
	public void init(){
		getDesktopPane();
		setJMenuBar(getMyMenuBar());
		ToolBar toolbar = new ToolBar(mMenuBar, mJLabel);
		setLayout(new BorderLayout());
		add(toolbar,BorderLayout.NORTH);
		add(mDesktopPane,BorderLayout.CENTER);
	}
	public JDesktopPane getDesktopPane(){
		
		if(mDesktopPane == null){
			mDesktopPane = new DesktopPane();
		}
		return mDesktopPane;
	}
	
	public JMenuBar getMyMenuBar(){
		if(mMenuBar == null){
			mMenuBar = new MenuBar(mDesktopPane, mJLabel);			
		}
		return mMenuBar;
	}

}
