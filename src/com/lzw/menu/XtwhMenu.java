package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.MyDesktopPane;

public class XtwhMenu extends JMenu{
	private MyDesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mSjkbfyhfItem;
	private JMenuItem mMmxgItem;
	private JMenuItem mExitItem;
	public XtwhMenu(MyDesktopPane desktoppane,JLabel label){
		super("系统维护(S)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_S);	
		mSjkbfyhfItem = new JMenuItem("数据库备份与恢复");
		ImageIcon sjbficon = new ImageIcon("images/shujuku_beifen_huifu.png");
		mSjkbfyhfItem.setIcon(sjbficon);
		mMmxgItem = new JMenuItem("密码修改");
		ImageIcon mmxgicon = new ImageIcon("images/mima_xiugai.png");
		mMmxgItem.setIcon(mmxgicon);
		mExitItem = new JMenuItem("退出系统");
		ImageIcon tcxticon = new ImageIcon("images/tuichu_xitong.png");
		mExitItem.setIcon(tcxticon);
		add(getsjkbfyhfItem());
		add(getmmxgItem());
		add(getexitItem());
	}
	
	private JMenuItem getsjkbfyhfItem(){
		return mSjkbfyhfItem;
	}

	private JMenuItem getmmxgItem(){
		return mMmxgItem;
	}

	public JMenuItem getexitItem(){
		return mExitItem;
	}
}
