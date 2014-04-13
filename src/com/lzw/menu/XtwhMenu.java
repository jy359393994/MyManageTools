package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.DesktopPane;

public class XtwhMenu extends JMenu{
	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mSjkbfyhfItem;
	private JMenuItem mMmxgItem;
	private JMenuItem mExitItem;
	public XtwhMenu(DesktopPane desktoppane,JLabel label){
		super("系统维护(S)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_S);	
		add(getsjkbfyhfItem());
		add(getmmxgItem());
		add(getexitItem());
	}
	
	private JMenuItem getsjkbfyhfItem(){
		
		if(mSjkbfyhfItem == null){
			mSjkbfyhfItem = new JMenuItem("数据库备份与恢复");
		}
		return mSjkbfyhfItem;
	}

	private JMenuItem getmmxgItem(){
		
		if(mMmxgItem == null){
			mMmxgItem = new JMenuItem("密码修改");
		}
		return mMmxgItem;
	}

	public JMenuItem getexitItem(){
		
		if(mExitItem == null){
			mExitItem = new JMenuItem("退出系统");
		}
		return mExitItem;
	}
}
