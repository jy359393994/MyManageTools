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
	
	private MyMenuItemObserver mMebuItemObserver;
	private JLabel mLabel;
	private JhglMenu mJhglMenu;
	private XsglMenu mXsglMenu;
	private KcglMenu mKcglMenu;
	private XxcxMenu mXxcxMenu;
	private JbzlMenu mJbzlMenu;
	private XtwhMenu mXtwhMenu;
	private CkMenu mCkMenu;
	private BzMenu mBzMenu;
	public MenuBar(MyMenuItemObserver itemobserver,JLabel label){
		mMebuItemObserver = itemobserver;
		mLabel = label;
		mJhglMenu = new JhglMenu(mMebuItemObserver, mLabel);
		mXsglMenu = new XsglMenu(mMebuItemObserver, mLabel);
		mKcglMenu = new KcglMenu(mMebuItemObserver, mLabel);
		mXxcxMenu = new XxcxMenu(mMebuItemObserver, mLabel);
		mJbzlMenu = new JbzlMenu(mMebuItemObserver, mLabel);
		mXtwhMenu = new XtwhMenu(mMebuItemObserver, mLabel);
		mCkMenu = new CkMenu(mMebuItemObserver, mLabel);
		mBzMenu = new BzMenu(mMebuItemObserver, mLabel);
		add(mJhglMenu);
		add(mXsglMenu);
		add(mKcglMenu);
		add(mXxcxMenu);
		add(mJbzlMenu);
		add(mXtwhMenu);
		add(mCkMenu);
		add(mBzMenu);
	}
	
	public JhglMenu getjhglMenu(){
		return mJhglMenu;
	}
	
	public XsglMenu getxsglMenu(){
		return mXsglMenu;
	}
	public KcglMenu getkcglMenu(){
		return mKcglMenu;
	}
	public XxcxMenu getxxcxMenu(){
		return mXxcxMenu;
	}
	public JbzlMenu getjbzlMenu(){
		return mJbzlMenu;
	}
	public XtwhMenu getxtwhMenu(){
		return mXtwhMenu;
	}
	public CkMenu getckMenu(){
		return mCkMenu;
	}
	public BzMenu getbzMenu(){
		return mBzMenu;
	}

}
