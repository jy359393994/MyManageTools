package com.lzw;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.lzw.login.LoginDialog;

public class ManageSystem extends JFrame{

	private MenuBar mMenuBar;
	private MyDesktopPane mDesktopPane;
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
		mlogindialog.setBounds((Tools.getWidth()-300)/2, (Tools.getHeight()-300)/2, 300, 180);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			mDesktopPane = new MyDesktopPane();
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
