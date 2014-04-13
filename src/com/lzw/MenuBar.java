package com.lzw;


import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.transaction.xa.Xid;

import com.lzw.menu.BzMenu;
import com.lzw.menu.CkMenu;
import com.lzw.menu.JbzlMenu;
import com.lzw.menu.JhglMenu;
import com.lzw.menu.KcglMenu;
import com.lzw.menu.XsglMenu;
import com.lzw.menu.XtwhMenu;
import com.lzw.menu.XxcxMenu;


public class MenuBar extends JMenuBar{
	
	private DesktopPane mDesktopPane;
	private JLabel mLabel;
	private JhglMenu mJhglMenu;
	private XsglMenu mXsglMenu;
	private KcglMenu mKcglMenu;
	private XxcxMenu mXxcxMenu;
	private JbzlMenu mJbzlMenu;
	private XtwhMenu mXtwhMenu;
	private CkMenu mCkMenu;
	private BzMenu mBzMenu;
	public MenuBar(DesktopPane desktopPane,JLabel label){
		mDesktopPane = desktopPane;
		mLabel = label;
		mJhglMenu = new JhglMenu(mDesktopPane, mLabel);
		mXsglMenu = new XsglMenu(mDesktopPane, mLabel);
		mKcglMenu = new KcglMenu(mDesktopPane, mLabel);
		mXxcxMenu = new XxcxMenu(mDesktopPane, mLabel);
		mJbzlMenu = new JbzlMenu(mDesktopPane, mLabel);
		mXtwhMenu = new XtwhMenu(mDesktopPane, mLabel);
		mCkMenu = new CkMenu(mDesktopPane, mLabel);
		mBzMenu = new BzMenu(mDesktopPane, mLabel);
		add(mJhglMenu);
		add(mXsglMenu);
		add(mKcglMenu);
		add(mXtwhMenu);
		add(mXxcxMenu);
		add(mJbzlMenu);
		add(mCkMenu);
		add(mBzMenu);
	}
	
//	public JMenuBar getMenuBar(){
//		
//		if(mJMenuBar == null){
//			mJMenuBar = new JMenuBar();
//			mJMenuBar.add(mJhglMenu);
//		}
//		return mJMenuBar;
//	}
}
